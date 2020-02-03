/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Nicole Agila y Sebastian Benalcazar
 */

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

public class GoogleMail {

    public GoogleMail() {
    }
    
    public void enviarMail(String receptor, String contenido, String source) throws AddressException, MessagingException {
        Logger.getLogger(GoogleMail.class.getName()).log(Level.FINE, null, "Generando correo de confirmacion.");
        Properties props = new Properties();
        
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        String myEmail="grupo5agenciaturismopoo@gmail.com";
        String passw="NaSbPOO5";

        Session sesion = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myEmail, passw);
            }
        });
        
        Message message=prepararMensaje(sesion, myEmail, receptor,source, contenido);
        Transport.send(message);
        Logger.getLogger(GoogleMail.class.getName()).log(Level.FINE, null, "Correo enviado exitosamente!!");
        
    }

    private Message prepararMensaje(Session sesion, String myEmail, String receptor,String sourcepdf, String contenido) throws MessagingException{
        try{
            Message message = new MimeMessage(sesion);
            message.setFrom(new InternetAddress(myEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receptor));
            message.setSubject("CORREO DE DISENO DE CASA");
            message.setText(contenido);
            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(new DataHandler(new FileDataSource(sourcepdf)));
            adjunto.setFileName("Diseno.pdf");
            return message;
        } catch (AddressException ex){
            Logger.getLogger(GoogleMail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        }
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

/**
 *
 * @author nicoleagila
 */
public abstract class PDF {
    Casa casa;
    GoogleMail mail;
    Cuenta cuentaDestino;
    protected static final Font CHAPTERFONT = FontFactory.getFont(FontFactory.HELVETICA, 26, Font.BOLDITALIC);
    protected static final Font PARAGRAPHFONT = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.NORMAL);
    protected String iTextExampleImage;

    public PDF(Casa casa,Cuenta c) {
        this.casa=casa;
        this.cuentaDestino=c;
        this.mail= new GoogleMail();
        this.iTextExampleImage="/recursos/".concat(Integer.toString(casa.getId())).concat(".jpg");
    }
    
    public abstract String generarPDF();
    public void enviarPDF(){
        String path = generarPDF();
        String content="Correo electronico enviado desde MyHome...";
        try {
            mail.enviarMail(cuentaDestino.getUsuario().getEmail().toString(), content, path);
        } catch (MessagingException ex) {
            Logger.getLogger(DisenoPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    public abstract void escribirPDF(File pdfNewFile);
}

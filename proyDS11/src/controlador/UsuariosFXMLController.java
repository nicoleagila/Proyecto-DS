/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.diseno.AddAcabadosFXMLController;
import controlador.diseno.EscogerCasaBaseFXMLController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import modelo.Administrador;
import modelo.Cliente;
import modelo.MyHome;
import modelo.Vendedor;
import static myhome.MyHome.stPrincipal;

/**
 *
 * @author nicoleagila
 */
public class UsuariosFXMLController {

    @FXML
    private AnchorPane pantalla1;
    @FXML
    private Button btnCliente;
    @FXML
    private Button btnVendedor;
    @FXML
    private Button btnAdministrador;

    @FXML
    private void loginCliente(ActionEvent event) {
        MyHome.persona = new Cliente();
        pasarLogin();
    }

    @FXML
    private void loginVend(ActionEvent event) {
        MyHome.persona = new Vendedor();
        pasarLogin();
    }

    @FXML
    private void loginAdmin(ActionEvent event) {
        MyHome.persona = new Administrador();
        pasarLogin();
    }
    private void pasarLogin(){
        Parent rootUsuarios = null;
        try {
            rootUsuarios = FXMLLoader.load(getClass().getResource("/vistas/LoginFXML.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(EscogerCasaBaseFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        stPrincipal.setScene(new Scene(rootUsuarios));
        stPrincipal.show();
    }
    
}

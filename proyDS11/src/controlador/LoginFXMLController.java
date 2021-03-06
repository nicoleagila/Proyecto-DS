/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import modelo.Administrador;
import modelo.Cliente;
import modelo.Cuenta;
import modelo.MyHome;
import modelo.Persona;
import modelo.Vendedor;
import static myhome.MyHome.STPRINCIPAL;
/**
 * FXML Controller class
 *
 * @author nicoleagila
 */
public class LoginFXMLController implements Initializable {

    @FXML
    private Button btnIngresLogin;
    @FXML
    private Button btnDesign;
    @FXML
    private AnchorPane pantalla2;
    @FXML
    private TextField txtuser;
    @FXML
    private CheckBox checkboxClientenuevo;
    @FXML
    private PasswordField txtpass;
    private final Persona PERSONA = MyHome.getPersona();
    private Cuenta cuenta = MyHome.getCuenta();
    
    

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(PERSONA instanceof Administrador) btnDesign.setVisible(false);
        if(PERSONA instanceof Vendedor) btnDesign.setVisible(false);
        if(!(PERSONA instanceof Cliente)) checkboxClientenuevo.setVisible(false);
        
    }    

    @FXML
    private void ingreso(ActionEvent event) throws IOException {
        if(validarCuenta()) {
            cuenta = new Cuenta(txtuser.getText(),txtpass.getText(),PERSONA);
            PERSONA.setRegistrado(true);
        }
        Parent rootUsuarios = null;
        if(PERSONA instanceof Administrador){
            try {
            rootUsuarios = FXMLLoader.load(getClass().getResource("/vistas/AdministradorInterfaz.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(LoginFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        };
           

        if(PERSONA instanceof Vendedor){

            try {
                rootUsuarios = FXMLLoader.load(getClass().getResource("/vistas/VendedorInterfaz.fxml"));
            } catch (IOException ex) {
                Logger.getLogger(LoginFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(PERSONA instanceof Cliente){
            try {
                rootUsuarios = FXMLLoader.load(getClass().getResource("/vistas/ClienteInterfaz.fxml"));
            } catch (IOException ex) {
                Logger.getLogger(LoginFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }       
            }
        STPRINCIPAL.setScene(new Scene(rootUsuarios));
        STPRINCIPAL.show();
        
    }

    private boolean validarCuenta(){
        return true;
    }
    
    
    @FXML
    private void disenoRapido(ActionEvent event) {
        Parent rootDisenoRapido = null;
        try {
            rootDisenoRapido = FXMLLoader.load(getClass().getResource("/vistas/diseno/EscogerCasaBaseFXML.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(LoginFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }       
        STPRINCIPAL.setScene(new Scene(rootDisenoRapido));
        STPRINCIPAL.show();
    }
    
    
}

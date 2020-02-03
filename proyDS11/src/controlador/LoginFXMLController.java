/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.diseno.EscogerCasaBaseFXMLController;
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
import static modelo.MyHome.persona;
import modelo.Vendedor;
import static myhome.MyHome.stPrincipal;
//import sun.security.util.Password;

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
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(persona instanceof Administrador) btnDesign.setVisible(false);
        if(persona instanceof Vendedor) btnDesign.setVisible(false);
        if(!(persona instanceof Cliente)) checkboxClientenuevo.setVisible(false);
        
    }    

    @FXML
    private void ingreso(ActionEvent event) throws IOException {
        if(validarCuenta()) {MyHome.cuenta=new Cuenta(txtuser.getText(),txtpass.getText(),MyHome.persona);}
        Parent rootUsuarios = null;
        if(persona instanceof Administrador){
            try {
            rootUsuarios = FXMLLoader.load(getClass().getResource("/vistas/AdministradorInterfaz.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(EscogerCasaBaseFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        };
        if(persona instanceof Vendedor){
            try {
            rootUsuarios = FXMLLoader.load(getClass().getResource("/vistas/VendedorInterfaz.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(EscogerCasaBaseFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        };
        if(persona instanceof Cliente){
        try {
            rootUsuarios = FXMLLoader.load(getClass().getResource("/vistas/ClienteInterfaz.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(EscogerCasaBaseFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }       
        };
        stPrincipal.setScene(new Scene(rootUsuarios));
        stPrincipal.show();
        
    }

    private boolean validarCuenta(){
        return true;
    }
    
    
    @FXML
    private void disenoRapido(ActionEvent event) {
        
    }
    
}

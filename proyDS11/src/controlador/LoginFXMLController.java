/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
import sun.security.util.Password;

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
        if(!(persona instanceof Cliente)) checkboxClientenuevo.setVisible(false);
        
    }    

    @FXML
    private void ingreso(ActionEvent event) {
        if(validarCuenta()) MyHome.cuenta=new Cuenta(txtuser.getText(),txtpass.getText(),MyHome.persona);
        
    }

    private boolean validarCuenta(){
        return true;
    }
    
    
    @FXML
    private void disenoRapido(ActionEvent event) {
    }
    
}

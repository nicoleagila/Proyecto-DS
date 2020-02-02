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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import static myhome.MyHome.stPrincipal;

/**
 * FXML Controller class
 *
 * @author Jimmy Leon
 */
public class ClientePerfilController implements Initializable {

    @FXML
    private TextField id_c;
    @FXML
    private TextField nombre;
    @FXML
    private TextField apellido;
    @FXML
    private TextField trabajo;
    @FXML
    private TextField direccion_t;
    @FXML
    private TextField cargo;
    @FXML
    private TextField direccion_d;
    @FXML
    private TextField numero_t;
    @FXML
    private TextField numero_c;
    @FXML
    private ChoiceBox<?> estadocivil;
    @FXML
    private TextField nhijos;
    @FXML
    private TextField email;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void back(ActionEvent event) {
        Parent rootUsuarios = null;
        try {
            rootUsuarios = FXMLLoader.load(getClass().getResource("/vistas/ClienteInterfaz.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(EscogerCasaBaseFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        stPrincipal.setScene(new Scene(rootUsuarios));
        stPrincipal.show();
    }

    @FXML
    private void save(ActionEvent event) {
        
    }
    
}

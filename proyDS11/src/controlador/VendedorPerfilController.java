/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Jimmy Leon
 */
public class VendedorPerfilController implements Initializable {

    @FXML
    private TextField id;
    @FXML
    private TextField nombre;
    @FXML
    private TextField apellido;
    @FXML
    private ChoiceBox<?> cb_cargo;
    @FXML
    private TextField direccion_d;
    @FXML
    private TextField numero_t;
    @FXML
    private TextField numero_c;
    @FXML
    private ChoiceBox<?> cb_estado;
    @FXML
    private TextField correo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

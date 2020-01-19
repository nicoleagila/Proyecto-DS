/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.sql.Connection;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import modelo.Casa;
import modelo.database.Conexion;

/**
 * FXML Controller class
 *
 * @author nicoleagila
 */
public class DisenarCasaFXMLController implements Initializable {

    @FXML
    private AnchorPane id;
    @FXML
    private HBox cajaCasasBasicas;
    @FXML
    private Label lblescoger;
    @FXML
    private Button btEscoger;
    
    private HashMap<Integer,Casa> casasBase;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    private void agregarCasasBase(){
        Conexion c = Conexion.getInstance();
    }
    
}

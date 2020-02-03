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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import static myhome.MyHome.stPrincipal;

/**
 * FXML Controller class
 *
 * @author josse
 */
public class VendedorFXMLController implements Initializable {

    @FXML
    private TableView<?> tableVendedor;
    @FXML
    private TextField txtciV;
    @FXML
    private TextField textnomV;
    @FXML
    private TextField textapeV;
    @FXML
    private ChoiceBox<?> cbCargoV;
    @FXML
    private TextField textDirV;
    @FXML
    private TextField textTrabajV;
    @FXML
    private TextField textCelV;
    @FXML
    private ChoiceBox<?> cbCivilV;
    @FXML
    private TextField textCorV;
    @FXML
    private Button btnAtrasV;
    @FXML
    private Button textConsultV;

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
            rootUsuarios = FXMLLoader.load(getClass().getResource("/vistas/AdministradorInterfazFXML.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(EscogerCasaBaseFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        stPrincipal.setScene(new Scene(rootUsuarios));
        stPrincipal.show();
    }

    @FXML
    private void consultar(ActionEvent event) {
    }
}

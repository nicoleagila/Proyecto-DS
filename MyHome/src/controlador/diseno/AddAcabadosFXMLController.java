/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.diseno;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import modelo.Casa;
import modelo.acabados.Acabado;

/**
 * FXML Controller class
 *
 * @author nicoleagila
 */
public class AddAcabadosFXMLController implements Initializable {

    @FXML
    private AnchorPane paneChooseAcabados;
    @FXML
    private Label lbltitulo;
    @FXML
    private ImageView imgviewcasa;
    @FXML
    private Label lblnombrecasa;
    @FXML
    private Label lblbase;
    @FXML
    private Label lblfinal;
    @FXML
    private Label valorbase;
    @FXML
    private Label valorfinal;
    @FXML
    private ListView<Acabado> listvaracteristicas;
    @FXML
    private VBox paneopcionesacabados;
    @FXML
    private Label lblacabados;
    @FXML
    private Button btguardar;
    @FXML
    private Button btenviar;
    
    static Casa casaescogida;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        imgviewcasa.setImage(new Image(Integer.toString(casaescogida.getId())+".jpg"));
        lblnombrecasa.setText(casaescogida.getNombre());
        lblbase.setText(Float.toString(casaescogida.getCostoFinal()));
        
        
    }    
    
}

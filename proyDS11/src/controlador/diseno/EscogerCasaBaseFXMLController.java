/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.diseno;

import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import modelo.Casa;
import static modelo.MyHome.casas_base;
import static myhome.MyHome.stPrincipal;

/**
 * FXML Controller class
 *
 * @author nicoleagila
 */
public class EscogerCasaBaseFXMLController implements Initializable {
    
    @FXML
    private AnchorPane id;
    @FXML
    private HBox cajaCasasBasicas;
    @FXML
    private Label lblescoger;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenarCasasBase();
    }    
    
    private void llenarCasasBase(){
        for (Map.Entry<Integer, Casa> entry : casas_base.entrySet()) {
            Casa c= entry.getValue();
            VBox cajaCasa = new VBox();
            Label nombre = new Label(c.getNombre());
            ImageView imgv = new ImageView(new Image(Integer.toString(c.getId())+".jpg"));
            imgv.setOnMouseClicked(e->{
                Parent rootAcabados = null;
                try {
                    rootAcabados = FXMLLoader.load(getClass().getResource("/vistas.diseno/AddAcabadosFXML.fxml"));
                } catch (IOException ex) {
                    Logger.getLogger(EscogerCasaBaseFXMLController.class.getName()).log(Level.SEVERE, null, ex);
                }
                AddAcabadosFXMLController.casaescogida=c;
                stPrincipal.setScene(new Scene(rootAcabados));
                stPrincipal.show();
            });
            cajaCasa.getChildren().addAll(nombre,imgv);
            cajaCasasBasicas.getChildren().add(cajaCasa);         
        }        
    }

    
}

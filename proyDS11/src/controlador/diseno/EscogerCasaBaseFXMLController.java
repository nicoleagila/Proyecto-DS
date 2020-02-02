/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.diseno;

import static controlador.diseno.AddAcabadosFXMLController.casaescogida;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import modelo.casas.CasaCieloBuilder;
import modelo.casas.CasaDirector;
import modelo.casas.CasaOasisBuilder;
import modelo.casas.CasaParaisoBuilder;
import static myhome.MyHome.STPRINCIPAL;

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
    @FXML
    private ImageView imgoasis;
    @FXML
    private ImageView imgparaiso;
    @FXML
    private ImageView imgcielo;
    
    private CasaDirector director;
    

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void chooseOasis(MouseEvent event) throws IOException {
        director=new CasaDirector(new CasaOasisBuilder());
        director.construirCasa();
        casaescogida=director.getCasa();
        changeSceneAcabados();
    }

    @FXML
    private void chooseParaiso(MouseEvent event) throws IOException {
        director=new CasaDirector(new CasaParaisoBuilder());
        director.construirCasa();
        casaescogida=director.getCasa();
        changeSceneAcabados();
    }

    @FXML
    private void chooseCielo(MouseEvent event) throws IOException {
        director=new CasaDirector(new CasaCieloBuilder());
        director.construirCasa();
        casaescogida=director.getCasa();
        changeSceneAcabados();
    }
    
    private void changeSceneAcabados() throws IOException{
        Parent rootAcabados = null;
        try {
            rootAcabados = FXMLLoader.load(getClass().getResource("/vistas/diseno/AddAcabadosFXML.fxml"));
        } catch (IOException ex) {
                Logger.getLogger(EscogerCasaBaseFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        STPRINCIPAL.setScene(new Scene(rootAcabados));
        STPRINCIPAL.show();
        
    }
    
}

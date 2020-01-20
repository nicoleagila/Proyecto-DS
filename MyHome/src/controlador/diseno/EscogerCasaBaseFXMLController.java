/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.diseno;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import modelo.Casa;
import modelo.acabados.Acabado;
import modelo.database.Conexion;
import modelo.datos.Orientacion;
import modelo.datos.TamanoPatio;

/**
 * FXML Controller class
 *
 * @author nicoleagila
 */
public class EscogerCasaBaseFXMLController implements Initializable {
    Connection bd = Conexion.getInstance().getConexion();
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
        try (Statement st = bd.createStatement()) {
            String query = "SELECT * FROM casa_modelo;";
            try(ResultSet rs = st.executeQuery(query)){
                while (rs.next()){
                    int idC =rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    double mCuadrados= rs.getDouble("mCuadrados");
                    int nPisos=rs.getInt("nPisos");
                    boolean esquinera= rs.getBoolean("esquinera");
                    int orientacion=rs.getInt("orientacion");
                    boolean patio = rs.getBoolean("patio");
                    int tamanoPatio=rs.getInt("tamanoPatio");
                    int nHabitaciones=rs.getInt("nHabitaciones");
                    int nBanos=rs.getInt("nBanos");
                    float costo_base=rs.getFloat("costo_base");
                    VBox casa = new VBox();
                    casa.getChildren().add(new Label(nombre));
                    
                    cajaCasasBasicas.getChildren().add(casa);                
                }
            }catch(Exception e){   
            }
        } catch (Exception e) {
        }
    }
    
}

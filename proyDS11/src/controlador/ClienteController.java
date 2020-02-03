/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.diseno.EscogerCasaBaseFXMLController;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modelo.Cliente;
import modelo.database.Conexion;
import static myhome.MyHome.STPRINCIPAL;

/**
 * FXML Controller class
 *
 * @author Jimmy Leon
 */
public class ClienteController implements Initializable {
    Statement stmt =null;
    ObservableList<Cliente> cliente;
    private int indiceCliente=0;
    @FXML
    private Button btn_back;
    @FXML
    private Button btn_consultar;
    @FXML
    private TableView<Cliente> Tabla =new TableView();
    @FXML
    private TableColumn<Cliente, Integer> id;
    @FXML
    private TableColumn<Cliente, String> trabajo;
    @FXML
    private TableColumn<Cliente, String> D_t;
    @FXML
    private TableColumn<Cliente, String> cargo;
    @FXML
    private TableColumn<Cliente, Integer> hijos;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Conexion con = Conexion.getInstance();
        Connection k = con.getConexion();
        cliente=FXCollections.observableArrayList();
        Cliente c= new Cliente();
        Cliente.llenarTabla(k, cliente);
        Tabla.setItems(cliente);
        id.setCellValueFactory(new PropertyValueFactory<>("identificador"));
        trabajo.setCellValueFactory(new PropertyValueFactory<>("empresa_trabajo"));
        D_t.setCellValueFactory(new PropertyValueFactory<>("direccion_trabajo"));
        cargo.setCellValueFactory(new PropertyValueFactory<>("cargo"));
        hijos.setCellValueFactory(new PropertyValueFactory<>("nHijos"));
    }    
    @FXML
    private void back(ActionEvent event) {
        Parent rootUsuarios = null;
        try {
            rootUsuarios = FXMLLoader.load(getClass().getResource("/vistas/VendedorInterfaz.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(EscogerCasaBaseFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        STPRINCIPAL.setScene(new Scene(rootUsuarios));
        STPRINCIPAL.show();
    }    
}

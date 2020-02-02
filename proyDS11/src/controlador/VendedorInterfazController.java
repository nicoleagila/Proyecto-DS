
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
import javafx.scene.control.TextField;
import static myhome.MyHome.stPrincipal;

/**
 * FXML Controller class
 *
 * @author Jimmy Leon
 */
public class VendedorInterfazController implements Initializable {

    @FXML
    private Button btn_diseños;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void verPerfil(ActionEvent event) {
        Parent rootUsuarios = null;
        try {
            rootUsuarios = FXMLLoader.load(getClass().getResource("/vistas/VendedorPerfil.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(EscogerCasaBaseFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        stPrincipal.setScene(new Scene(rootUsuarios));
        stPrincipal.show();
    }

    @FXML
    private void verClientes(ActionEvent event) {
        Parent rootUsuarios = null;
        try {
            rootUsuarios = FXMLLoader.load(getClass().getResource("/vistas/Cliente.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(EscogerCasaBaseFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        stPrincipal.setScene(new Scene(rootUsuarios));
        stPrincipal.show();
    }

    @FXML
    private void verDiseños(ActionEvent event) {
        
        
    }

    @FXML
    private void menu(ActionEvent event) {
        Parent rootUsuarios = null;
        try {
            rootUsuarios = FXMLLoader.load(getClass().getResource("/vistas/UsuariosFXML.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(EscogerCasaBaseFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        stPrincipal.setScene(new Scene(rootUsuarios));
        stPrincipal.show();
    }
    
}
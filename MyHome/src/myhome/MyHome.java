/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myhome;

import java.io.IOException;
import java.sql.Connection;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author nicoleagila
 */
public class MyHome extends Application{

    public static final Stage stPrincipal = new Stage();
    public static final Stage stAuxiliar = new Stage();
    public static final Stage stForms = new Stage();
    
    @Override
    public void start(Stage stage) throws IOException  {        
        FXMLLoader loaderLogin=new FXMLLoader(getClass().getResource("/interfazempleado/FXMLEmpleado.fxml"));
        Parent rootPrincipal= (Parent) loaderLogin.load();
        Scene scPrincipal = new Scene(rootPrincipal);
        stPrincipal.setScene(scPrincipal);
        stPrincipal.show();
    }   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}

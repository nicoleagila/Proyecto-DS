/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nicoleagila
 */
public class Conexion  {
    private static Conexion instance = new Conexion();
    private Connection conexion;
    
    private Conexion() {
        Connection con = null;
        String url = "jdbc:mysql://192.168.99.100:3308/MyHomeDataBase";
        String user= "root";
        try {
            con = DriverManager.getConnection(url, user, this.passw());
            this.conexion= con;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, "Error en conexion "+ex.getMessage());
            this.conexion=null;
        }
        Logger.getLogger(Conexion.class.getName()).log(Level.FINE, null,"Conexion existosa");
    }

    public Connection getConexion() {
        return conexion;
    }

    public static Conexion getInstance(){
        return instance;
    }
    
    private String passw(){
        return "root";
    }
    
}

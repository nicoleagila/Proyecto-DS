/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nicoleagila
 */
public class Conexion  {
    private static Conexion instance = new Conexion();
    private Connection conexion;

    private Conexion() {
        Connection con = null;
        String url = "jdbc:mysql://ip:3306/myhomedatabase";
        String user= "root";
        String pass= "pass";
        try {
            con = DriverManager.getConnection(url, user, pass);
            this.conexion= con;
        } catch (SQLException ex) {
            System.out.println("Error en conexion "+ex.getMessage());
            this.conexion=null;
        }
        System.out.println("Conexion existosa");
    }

    public Connection getConexion() {
        return conexion;
    }

    public static Conexion getInstance(){
        return instance;
    }
    
}

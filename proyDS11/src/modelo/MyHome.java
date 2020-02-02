/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.util.HashMap;
import modelo.database.Conexion;

/**
 *
 * @author nicoleagila
 */
public class MyHome {
    public static HashMap<Integer,Casa> casas_base = new HashMap<>();
    public static Connection bd = Conexion.getInstance().getConexion();
    public static Persona persona;
    public static Cuenta cuenta;
    
    
}

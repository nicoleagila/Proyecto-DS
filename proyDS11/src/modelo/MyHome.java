/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import modelo.database.Conexion;

/**
 *
 * @author nicoleagila
 */
public class MyHome {
    private static final Connection BD = Conexion.getInstance().getConexion();
    private static Persona persona;
    private static Cuenta cuenta;

    private MyHome() {
    }

    public static Connection getBD() {
        return BD;
    }

    public static Persona getPersona() {
        return persona;
    }

    public static Cuenta getCuenta() {
        return cuenta;
    }

    public static void setPersona(Persona persona) {
        MyHome.persona = persona;
    }

    public static void setCuenta(Cuenta cuenta) {
        MyHome.cuenta = cuenta;
    }
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


/**
 *
 * @author nicoleagila
 */
public class Cuenta {
    private String user;
    private String pass;
    private Persona usuario;

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public Persona getUsuario() {
        return usuario;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setUsuario(Persona usuario) {
        this.usuario = usuario;
    }

    public Cuenta(String user, String pass, Persona usuario) {
        this.user = user;
        this.pass = pass;
        this.usuario = usuario;
    }

    public Cuenta() {
    }
    
    
}

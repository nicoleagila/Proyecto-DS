/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.datos;

/**
 *
 * @author nicoleagila
 */
public class Direccion {
    private String CallePrincipal;
    private String CalleSecundaria;
    private String Mz;
    private String Villa;
    
    public Direccion(String cp, String cs, String mz, String v){
        this.CallePrincipal=cp;
        this.CalleSecundaria=cs;
        this.Mz=mz;
        this.Villa=v;
    }
    
    public Direccion(String cp, String mz, String v){
        this.CallePrincipal=cp;
        this.CalleSecundaria=null;
        this.Mz=mz;
        this.Villa=v;
    }
    
}

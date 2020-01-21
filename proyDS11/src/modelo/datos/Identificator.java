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
public class Identificator {
    private String numero;
    private boolean pasaporte;
    
    public Identificator(String numero, boolean pasaporte){
        this.numero=numero;
        this.pasaporte=pasaporte;
    }
    
    public Identificator(String numero){
        this.numero=numero;
        this.pasaporte=false;
    }
    
}

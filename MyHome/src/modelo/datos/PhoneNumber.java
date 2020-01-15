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
public class PhoneNumber {
    private String numero;
    private String prefijo;
    
    public PhoneNumber(String numero){
        this.numero=numero;
    }
    
    public PhoneNumber(String prefijo,String numero){
        this.numero=numero;
        this.prefijo=prefijo;
    }
    
    
    
    
}

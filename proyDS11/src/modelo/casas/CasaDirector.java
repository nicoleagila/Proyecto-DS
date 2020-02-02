/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.casas;

import modelo.Casa;

/**
 *
 * @author nicoleagila
 */
public class CasaDirector {
    private CasaBuilder builder;
    
    public CasaDirector(CasaBuilder builder){
        this.builder=builder;
    }
    
    public void construirCasa(){
        builder.definirCasa();
        builder.crearInterior();
        builder.crearExterior();
        builder.crearPatio();
    }

    public Casa getCasa() {
        return builder.getC();
    }
    
    
}

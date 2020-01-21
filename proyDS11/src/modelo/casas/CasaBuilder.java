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
public abstract class CasaBuilder {
    protected Casa c;

    public Casa getC() {
        return c;
    }
    
    public abstract void definirCasa();
    public abstract void crearInterior();
    public abstract void crearExterior();
    public abstract void crearPatio();
}

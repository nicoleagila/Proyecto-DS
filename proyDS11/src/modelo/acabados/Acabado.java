/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.acabados;

import modelo.Casa;

/**
 *
 * @author nicoleagila
 */
public abstract class Acabado implements ICasa{
    protected Casa casa;
    protected float costo;
    protected String nombre;

    public Acabado(float costo, String nombre,Casa c) {
        this.casa=c;
        this.costo = costo;
        this.nombre=nombre;
    }

    @Override
    public void agregarAcabado(int cantidad) {
        casa.agregarAcabado(cantidad);
    }

    public float getCosto() {
        return costo;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
}

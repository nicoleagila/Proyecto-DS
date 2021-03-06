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
public class BanoSincronizado extends Acabado{

    public BanoSincronizado(float costo, String nombre, Casa c) {
        super(costo, nombre, c);
    }

    @Override
    public void agregarAcabado(int cantidad) {
        super.agregarAcabado(cantidad);
        System.out.println("Agregando bano sincronizado");
        this.casa.setCostoFinal(this.casa.getCostoFinal()+(this.costo*cantidad));
        this.casa.getAcabados().add(new BanoSincronizado(this.costo,this.nombre,this.casa));
        
    }

    
}

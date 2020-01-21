/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.casas;

import modelo.Casa;
import modelo.datos.Orientacion;
import modelo.datos.TamanoPatio;

/**
 *
 * @author nicoleagila
 */
public class CasaCieloBuilder extends CasaBuilder{

    @Override
    public void crearInterior() {
        c.setNumHabitaciones(4);
        c.setNumBanos(4);
        c.setNumeroPisos(2);
    }

    @Override
    public void definirCasa() {
        c= new Casa();
        c.setId(3);
        c.setNombre("Cielo");
        c.setCostoFinal(2000000);
    }

    @Override
    public void crearExterior() {
        c.setMetrosCuadrados(20);
        c.setEsquinera(true);
        c.setOrientacion(Orientacion.OESTE);
    }

    @Override
    public void crearPatio() {
        c.setPatio(true);
        c.setTamanoPatio(TamanoPatio.GRANDE);
    }
    
}

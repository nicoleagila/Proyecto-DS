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
public class CasaOasisBuilder extends CasaBuilder{

    @Override
    public void crearInterior() {
        c.setNumHabitaciones(2);
        c.setNumBanos(2);
        c.setNumeroPisos(1);
    }

    @Override
    public void definirCasa() {
        c= new Casa();
        c.setId(1);
        c.setNombre("Oasis");
        c.setCostoFinal(20000);
    }

    @Override
    public void crearExterior() {
        c.setMetrosCuadrados(10);
        c.setEsquinera(false);
        c.setOrientacion(Orientacion.OESTE);
    }

    @Override
    public void crearPatio() {
        c.setPatio(false);
        c.setTamanoPatio(TamanoPatio.NADA);
    }
 
}

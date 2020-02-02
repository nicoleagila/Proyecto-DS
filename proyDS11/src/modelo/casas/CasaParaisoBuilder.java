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
public class CasaParaisoBuilder extends CasaBuilder{

    @Override
    public void crearInterior() {
        c.setNumHabitaciones(3);
        c.setNumBanos(3);
        c.setNumeroPisos(2);
    }

    @Override
    public void definirCasa() {
        c= new Casa();
        c.setNombre("Paraiso");
        c.setId(2);
        c.setCostoFinal(200000);
    }

    @Override
    public void crearExterior() {
        c.setMetrosCuadrados(15);
        c.setEsquinera(false);
        c.setOrientacion(Orientacion.ESTE);
    }

    @Override
    public void crearPatio() {
        c.setPatio(true);
        c.setTamanoPatio(TamanoPatio.PEQUENO);
    }

}

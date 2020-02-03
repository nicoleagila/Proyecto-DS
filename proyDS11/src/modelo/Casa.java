/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;
import java.util.List;
import modelo.acabados.Acabado;
import modelo.acabados.ICasa;
import modelo.datos.Orientacion;
import modelo.datos.TamanoPatio;

/**
 *
 * @author nicoleagila
 */
public class Casa implements ICasa {
    protected int id;
    protected String nombre;
    protected double metrosCuadrados;
    protected int numeroPisos;
    protected boolean esquinera;
    protected Orientacion orientacion;
    protected boolean patio;
    protected TamanoPatio tamanoPatio;
    protected int numHabitaciones;
    protected int numBanos;
    protected List<Acabado> acabados;
    protected float costoFinal;

    public Casa(int id,String nombre, double metrosCuadrados, int numeroPisos, boolean esquinera, Orientacion orientacion, boolean patio, TamanoPatio tamanoPatio, int numHabitaciones, int numBanos, float costoFinal) {
        this.id=id;
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
        this.numeroPisos = numeroPisos;
        this.esquinera = esquinera;
        this.orientacion = orientacion;
        this.patio = patio;
        this.tamanoPatio = tamanoPatio;
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
        this.acabados = new LinkedList<>();
        this.costoFinal = costoFinal;
    }

    public Casa() {
        this.acabados = new LinkedList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    @Override
    public void agregarAcabado(int cantidad) {
        System.out.println("Agregando ".concat(Integer.toString(cantidad)).concat(" acabados...")); 
        
    }

    public String getNombre() {
        return nombre;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public boolean isEsquinera() {
        return esquinera;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public boolean isPatio() {
        return patio;
    }

    public TamanoPatio getTamanoPatio() {
        return tamanoPatio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public int getNumBanos() {
        return numBanos;
    }

    public List<Acabado> getAcabados() {
        return acabados;
    }

    public float getCostoFinal() {
        return costoFinal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public void setEsquinera(boolean esquinera) {
        this.esquinera = esquinera;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    public void setPatio(boolean patio) {
        this.patio = patio;
    }

    public void setTamanoPatio(TamanoPatio tamanoPatio) {
        this.tamanoPatio = tamanoPatio;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public void setNumBanos(int numBanos) {
        this.numBanos = numBanos;
    }

    public void setAcabados(List<Acabado> acabados) {
        this.acabados = acabados;
    }

    public void setCostoFinal(float costoFinal) {
        this.costoFinal = costoFinal;
    }
    
    
}

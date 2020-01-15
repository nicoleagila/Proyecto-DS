/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.datos.Direccion;

/**
 *
 * @author nicoleagila
 */
public class Cliente extends Persona{
    private Direccion direccionTrabajo;
    private String nombreTrabajo;
    private String cargo;
    private int numeroHijos;

    public Cliente(Direccion direccionTrabajo, String nombreTrabajo, String cargo, int numeroHijos) {
        this.direccionTrabajo = direccionTrabajo;
        this.nombreTrabajo = nombreTrabajo;
        this.cargo = cargo;
        this.numeroHijos = numeroHijos;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.datos.Direccion;
import modelo.datos.PhoneNumber;
import modelo.datos.Identificator;
import modelo.datos.Email;
import modelo.datos.EstadoCivil;

/**
 *
 * @author nicoleagila
 */
public abstract class Persona {
    protected String nomber;
    protected String apellido;
    protected Identificator CI;
    protected PhoneNumber telefono;
    protected Email email;
    protected Direccion direccionCasa;
    protected PhoneNumber telefonoTrabajo;
    protected EstadoCivil estadoCivil;
    protected boolean activo;
}

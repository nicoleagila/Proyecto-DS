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
    protected String nombre;
    protected String apellido;
    protected Identificator CI;
    protected PhoneNumber telefono;
    protected Email email;
    protected Direccion direccionCasa;
    protected PhoneNumber telefonoTrabajo;
    protected EstadoCivil estadoCivil;
    protected boolean activo;    
    protected boolean registrado;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Identificator getCI() {
        return CI;
    }

    public PhoneNumber getTelefono() {
        return telefono;
    }

    public Email getEmail() {
        return email;
    }

    public Direccion getDireccionCasa() {
        return direccionCasa;
    }

    public PhoneNumber getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public boolean isActivo() {
        return activo;
    }

    public boolean isRegistrado() {
        return registrado;
    }

    public void setNomber(String nomber) {
        this.nombre = nomber;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCI(Identificator CI) {
        this.CI = CI;
    }

    public void setTelefono(PhoneNumber telefono) {
        this.telefono = telefono;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public void setDireccionCasa(Direccion direccionCasa) {
        this.direccionCasa = direccionCasa;
    }

    public void setTelefonoTrabajo(PhoneNumber telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setRegistrado(boolean registrado) {
        this.registrado = registrado;
    }

    
}

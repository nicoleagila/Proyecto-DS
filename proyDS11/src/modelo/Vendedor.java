/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.datos.Direccion;
import modelo.datos.Email;
import modelo.datos.EstadoCivil;
import modelo.datos.Identificator;
import modelo.datos.PhoneNumber;

/**
 *
 * @author nicoleagila
 */
public class Vendedor extends Persona{

    public Vendedor() {
    }
    

    public String getNomber() {
        return nomber;
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

    public void setNomber(String nomber) {
        this.nomber = nomber;
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
    
}

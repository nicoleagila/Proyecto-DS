/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import javafx.collections.ObservableList;
import modelo.datos.Direccion;
import modelo.datos.Email;
import modelo.datos.EstadoCivil;
import modelo.datos.Identificator;
import modelo.datos.PhoneNumber;

/**
 *
 * @author nicoleagila
 */
public class Cliente extends Persona{
    private int identificador;
    private String direccionS; 
    private Direccion direccionTrabajo;
    private String nombreTrabajo;
    private String cargo;
    private int numeroHijos;
    private LinkedList<Casa> disenos;

    public Cliente(int identificador,String direccionTrabajo, String nombreTrabajo, String cargo, int numeroHijos) {        
        this.identificador=identificador;
        this.direccionS = direccionTrabajo;
        this.nombreTrabajo = nombreTrabajo;
        this.cargo = cargo;
        this.numeroHijos = numeroHijos;
    }

    public Cliente(Direccion direccionTrabajo, String nombreTrabajo, String cargo, int numeroHijos) {
        this.direccionTrabajo = direccionTrabajo;
        this.nombreTrabajo = nombreTrabajo;
        this.cargo = cargo;
        this.numeroHijos = numeroHijos;
        this.registrado=false;
        this.disenos = new LinkedList<>();
    }
    
    public void setID(int id){
        this.identificador=id;
    }

    public Cliente() {
        this.registrado=false;
        this.disenos= new LinkedList<>();
    }

    public Direccion getDireccionTrabajo() {
        return direccionTrabajo;
    }

    public String getNombreTrabajo() {
        return nombreTrabajo;
    }

    public String getCargo() {
        return cargo;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public Identificator getCI() {
        return CI;
    }

    @Override
    public PhoneNumber getTelefono() {
        return telefono;
    }

    @Override
    public Email getEmail() {
        return email;
    }

    @Override
    public Direccion getDireccionCasa() {
        return direccionCasa;
    }

    @Override
    public PhoneNumber getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    @Override
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    @Override
    public boolean isActivo() {
        return activo;
    }

    public void setDireccionTrabajo(Direccion direccionTrabajo) {
        this.direccionTrabajo = direccionTrabajo;
    }

    public void setNombreTrabajo(String nombreTrabajo) {
        this.nombreTrabajo = nombreTrabajo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
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

    public boolean isRegistrado() {
        return registrado;
    }

    public void setRegistrado(boolean registrado) {
        this.registrado = registrado;
    }

    public LinkedList<Casa> getDisenos() {
        return disenos;
    }

    public void setDisenos(LinkedList<Casa> disenos) {
        this.disenos = disenos;
    }
    
    public static void llenarTabla(Connection con, ObservableList<Cliente> lista) throws SQLException{
        
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Cliente");
            while(rs.next()){
                Cliente c;
                c = new Cliente(rs.getInt("identificador"),
                        rs.getString("direccion_trabajo"),
                        rs.getString("empresa_trabajo"),
                        rs.getString("cargo"),
                        rs.getInt("nHijos")               
                );
               
                lista.add(c);
                
            }
    }
    
    
}

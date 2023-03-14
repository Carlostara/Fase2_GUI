/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;

/**
 *
 * @author Carlos Andres
 */
public class Propietario {
    
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String cedula;
    private boolean cartaPropiedad;
    private List<Vehiculo> vehiculos;
    
    //constructores

    public Propietario() {
    }

    public Propietario(String nombres, String apellidos, String direccion, String telefono, String cedula, boolean cartaPropiedad, List<Vehiculo> vehiculos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cedula = cedula;
        this.cartaPropiedad = cartaPropiedad;
        this.vehiculos = vehiculos;
    }

   
    
    //Getters and Setters

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isCartaPropiedad() {
        return cartaPropiedad;
    }

    public void setCartaPropiedad(boolean cartaPropiedad) {
        this.cartaPropiedad = cartaPropiedad;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
}

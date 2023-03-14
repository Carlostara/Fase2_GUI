/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Carlos Andres
 */
public class Servicio {
    private Date fechaIngreso;
    private Date fechaEntrega;
    private float costo;
    private String descripcion;
    private Vehiculo vehiculo;
    
    //Constructores

    public Servicio() { 
    }

    public Servicio(Date fechaIngreso, Date fechaEntrega, float costo, String descripcion, Vehiculo vehiculo) {
        this.fechaIngreso = fechaIngreso;
        this.fechaEntrega = fechaEntrega;
        this.costo = costo;
        this.descripcion = descripcion;
        this.vehiculo = vehiculo;
    }
    
   
    
    // getters y setters

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    
    
}

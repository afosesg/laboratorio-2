package Agate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author freddy
 */
public class Cliente {
    private String nombre;
    private String direccion;
    private Personal[] contacto;
    private Campaña[] campañas;
    

    public Cliente(String nombre, String direccion, Personal[] contacto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Personal[] getContacto() {
        return contacto;
    }

    public void setContacto(Personal[] contacto) {
        this.contacto = contacto;
    }

    public Campaña[] getCampañas() {
        return campañas;
    }

    public void setCampañas(Campaña[] campañas) {
        this.campañas = campañas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", direccion=" + direccion + ", contacto=" + contacto + ", campa\u00f1as=" + campañas + '}';
    }
    
    

   
    
    
    
    
}

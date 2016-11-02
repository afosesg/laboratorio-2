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

import java.util.ArrayList;

public class Campaña {
    private String titulo;
    private String fechaInicio;
    private String fechaFinalizacion;
    private double costoEstimado;
    private double presupuesto;
    private double costoReal;
   
    private double presupuestoTotal = 15000000;
    
    Director director;
    ArrayList<Personal> Equipo;
    private Anuncio[] Anuncios = new Anuncio[10];
    
    public Campaña(String titulo, String fechaInicio, String fechaFinalizacion, double costoEstimado, double presupuesto, double costoReal) {
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.costoEstimado = costoEstimado;
        this.presupuesto = presupuesto;
        this.costoReal = costoReal;
        
        }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public double getCostoEstimado() {
        return costoEstimado;
    }

    public void setCostoEstimado(double costoEstimado) {
        this.costoEstimado = costoEstimado;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getCostoReal() {
        return costoReal;
    }

    public void setCostoReal(double costoReal) {
        this.costoReal = costoReal;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Personal> getEquipo() {
        return Equipo;
    }

    public void setEquipo(ArrayList<Personal> Equipo) {
        this.Equipo = Equipo;
    }

    public Anuncio[] getAnuncios() {
        return Anuncios;
    }

    public void setAnuncios(Anuncio[] Anuncios) {
        this.Anuncios = Anuncios;
    }

    
    
    
    
    public boolean presupuesto(){
        if(this.presupuesto > presupuestoTotal){
            return false;
        } else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "Campa\u00f1a{" + "titulo=" + titulo + ", fechaInicio=" + fechaInicio + ", fechaFinalizacion=" + fechaFinalizacion + ", costoEstimado=" + costoEstimado + ", presupuesto=" + presupuesto + ", costoReal=" + costoReal + ", presupuestoTotal=" + presupuestoTotal + ", director=" + director + ", Equipo=" + Equipo + '}';
    }

    
    
    
    
}

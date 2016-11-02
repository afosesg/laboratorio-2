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
public class Anuncio {
    private String tipoAnuncio;
    private double costoEstimado;
    private double costoReal;
    private boolean textoEscrito;
    private boolean graficos;
    private boolean fotografias;
    private boolean animaciones;
    private boolean videos; 
    private boolean actores;
    private boolean audio;
    private String fechaLanzamiento;

    public Anuncio(String tipoAnuncio, double costoEstimado, double costoReal, boolean textoEscrito, boolean graficos, boolean fotografias, boolean animaciones, boolean videos, boolean actores, boolean audio) {
        this.tipoAnuncio = tipoAnuncio;
        this.costoEstimado = costoEstimado;
        this.costoReal = costoReal;
        this.textoEscrito = textoEscrito;
        this.graficos = graficos;
        this.fotografias = fotografias;
        this.animaciones = animaciones;
        this.videos = videos;
        this.actores = actores;
        this.audio = audio;
    }

    public String getTipoAnuncio() {
        return tipoAnuncio;
    }

    public void setTipoAnuncio(String tipoAnuncio) {
        this.tipoAnuncio = tipoAnuncio;
    }

    public double getCostoEstimado() {
        return costoEstimado;
    }

    public void setCostoEstimado(double costoEstimado) {
        this.costoEstimado = costoEstimado;
    }

    public double getCostoReal() {
        return costoReal;
    }

    public void setCostoReal(double costoReal) {
        this.costoReal = costoReal;
    }

    public boolean isTextoEscrito() {
        return textoEscrito;
    }

    public void setTextoEscrito(boolean textoEscrito) {
        this.textoEscrito = textoEscrito;
    }

    public boolean isGraficos() {
        return graficos;
    }

    public void setGraficos(boolean graficos) {
        this.graficos = graficos;
    }

    public boolean isFotografias() {
        return fotografias;
    }

    public void setFotografias(boolean fotografias) {
        this.fotografias = fotografias;
    }

    public boolean isAnimaciones() {
        return animaciones;
    }

    public void setAnimaciones(boolean animaciones) {
        this.animaciones = animaciones;
    }

    public boolean isVideos() {
        return videos;
    }

    public void setVideos(boolean videos) {
        this.videos = videos;
    }

    public boolean isActores() {
        return actores;
    }

    public void setActores(boolean actores) {
        this.actores = actores;
    }

    public boolean isAudio() {
        return audio;
    }

    public void setAudio(boolean audio) {
        this.audio = audio;
    }
    
    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    @Override
    public String toString() {
        return "Anuncio{" + "tipoAnuncio=" + tipoAnuncio + ", costoEstimado=" + costoEstimado + ", costoReal=" + costoReal + ", textoEscrito=" + textoEscrito + ", graficos=" + graficos + ", fotografias=" + fotografias + ", animaciones=" + animaciones + ", videos=" + videos + ", actores=" + actores + ", audio=" + audio + ", fechaLanzamiento=" + fechaLanzamiento + '}';
    }
    
    
    
}

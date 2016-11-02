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

public class Personal {
    private String nombre;
    private String apellido;
    private double salario;
    private String nivelLaboral;
    public Cliente cliente;
    
    private ArrayList<String> Notas;

    public Personal(String nombre, String apellido, double salario, String nivelLaboral, Cliente cliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nivelLaboral = nivelLaboral;
        this.cliente = cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNivelLaboral() {
        return nivelLaboral;
    }

    public void setNivelLaboral(String nivelLaboral) {
        this.nivelLaboral = nivelLaboral;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<String> getNotas() {
        return Notas;
    }

    public void setNotas(ArrayList<String> Notas) {
        this.Notas = Notas;
    }

    @Override
    public String toString() {
        return "Personal{" + "nombre=" + nombre + ", Notas=" + Notas + '}';
    }

   

    
    
    
    
    
}

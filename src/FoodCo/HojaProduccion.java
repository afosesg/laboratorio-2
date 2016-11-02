package FoodCo;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cesar velasco
 */
public class HojaProduccion extends Hoja {
    private Supervisor supervisor;  
    private String supervisorNombre;
    private int linea;
    private int numTrabajo;
    private String fecha;
    private String producto;
    private int diaDeSemana;
    private int inicioSerie;
    private int finSerie;
    private String problema;
    private String firmaSupervisor;
    private int cantidadProductos;
    private Empleado verificadoPor;
    private String empleadoNombre;

    public HojaProduccion(Supervisor supervisor, int linea, int numTrabajo, String fecha, String producto, int diaDeSemana, int inicioSerie, int finSerie, String problema, String firmaSupervisor, int cantidadProductos, String verificadoPor) {
        this.supervisor = supervisor;
        this.supervisorNombre=this.supervisor.getNombre();
        this.linea = linea;
        this.numTrabajo = numTrabajo;
        this.fecha = fecha;
        this.producto = producto;
        this.diaDeSemana = diaDeSemana;
        this.inicioSerie = inicioSerie;
        this.finSerie = finSerie;
        this.problema = problema;
        this.firmaSupervisor = firmaSupervisor;
        this.cantidadProductos = cantidadProductos;
        this.empleadoNombre=verificadoPor;
    }

    
    public int getCantidadProductos() {
        return cantidadProductos;
    }

    @Override
    public int getLinea() {
        return linea;
    }

    @Override
    public int getNumTrabajo() {
        return numTrabajo;
    }

    @Override
    public String getFecha() {
        return fecha;
    }

    public void setVerificadoPor(Empleado verificadoPor) {
        this.verificadoPor = verificadoPor;
    }
    
    
    
    
}

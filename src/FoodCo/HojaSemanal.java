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
public class HojaSemanal extends Hoja {
    
    private String fechas;
    private int numTrabajo;
    private int linea;
    private Empleado Empleado;
    private String EmpleadoNombre;    
    private String we;
    private String fabrica;
    private int numNomina;
    private int hrsProd;
    private int tiempoInactividad;
    private int code;
    private String firmaSupervisor;
    private Supervisor autor;
    private String autorNombre;
    private String fechaFirma;

    public HojaSemanal(String fechas, int numTrabajo, int linea, String we, String fabrica, int numNomina, int hrsProd, int tiempoInactividad, int code, String firmaSupervisor, Supervisor autor, String fechaFirma) {
        this.fechas = fechas;
        this.numTrabajo = numTrabajo;
        this.linea = linea;
        this.Empleado = null;
        this.EmpleadoNombre = this.Empleado.getNombre();
        this.we = we;
        this.fabrica = fabrica;
        this.numNomina = numNomina;
        this.hrsProd = hrsProd;
        this.tiempoInactividad = tiempoInactividad;
        this.code = code;
        this.firmaSupervisor = firmaSupervisor;
        this.autor = autor;
        this.autorNombre = this.autor.getDirector();
        this.fechaFirma = fechaFirma;
    }

    public void setEmpleado(Empleado Empleado) {
        this.Empleado = Empleado;
    }
 
    public String getAutorNombre() {
        return autorNombre;
    }

    public String getEmpleadoNombre() {
        return EmpleadoNombre;
    }

    public String getFabrica() {
        return fabrica;
    }

    
    public int getHrsProd() {
        return hrsProd;
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
        return we;
    }

    public Empleado getEmpleado() {
        return Empleado;
    }

    
    
    
    
}

package FoodCo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cesar velasco
 */
public class Empleado {
    private String nombre;
    private String fabrica;
    private Double remuneraciones;
    private HojaProduccion hojaProduccion;
    private HojaSemanal hojaSemanal;

    public Empleado(String nombre, String fabrica) {
        this.nombre = nombre;
        this.fabrica = fabrica;
        this.remuneraciones = 0.0;
    }

    public String getFabrica() {
        return fabrica;
    }

    public String getNombre() {
        return nombre;
    }
//suponiendo que se paga 7 usd por cada hora
    public void setRemuneraciones() {
        this.remuneraciones=(this.hojaSemanal.getHrsProd()*7000.0);
    }

    public Double getRemuneraciones() {
        return remuneraciones;
    }

    public void setHojaProduccion(HojaProduccion hojaProduccion) {
        this.hojaProduccion = hojaProduccion;
    }

    public HojaProduccion getHojaProduccion() {
        return hojaProduccion;
    }

    public void setHojaSemanal(HojaSemanal hojaSemanal) {
        this.hojaSemanal = hojaSemanal;
    }

    public HojaSemanal getHojaSemanal() {
        return hojaSemanal;
    }
    
    
}

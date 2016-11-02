package FoodCo;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cesar velasco
 */
public class Supervisor {
    private String nombre;
    private String fabrica;
    private String director;
    private ArrayList<Hoja>hojas;
    //private ArrayList<HojaSemanal> hojasSemanal;
    //private ArrayList<HojaProduccion> hojasProduccion;

    public Supervisor(String nombre, String fabrica) {
        this.nombre = nombre;
        this.fabrica = fabrica;
        this.director= "finanzas";
        this.hojas=new ArrayList<>();
       // this.hojasProduccion=new ArrayList<>();
       // this.hojasSemanal=new ArrayList<>();
    }
    public void addHojaProduccion( HojaProduccion hojaP){
        
        hojas.add(hojaP);
    }   
    public void addHojaSemanal(HojaSemanal hojaS){
        
        hojas.add(hojaS);
    }
    public String getDirector() {
        return director;
    }

    public String getFabrica() {
        return fabrica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    public double calcularCostoTotalProduccionDiaria(){
        double costo=0.0;
        for(int i =0;i<hojas.size();i++){
            HojaProduccion actual=(HojaProduccion)hojas.get(i);
            //suponiendo que el costo de produccion por producto es de 8000
            costo+=(actual.getCantidadProductos()*10000);
        }
        return costo;
    }
    // calcular el costo en tiempo por recursos humanos 
    public double calcularCostoSemanalPersonal(){
            double costo=0.0;
        for(int i=0;i<hojas.size();i++){
            HojaSemanal actual=(HojaSemanal)hojas.get(i);
           costo+= actual.getEmpleado().getRemuneraciones();
        }
        return costo;
    }
    public double calcularCostoLinea(int linea){
        double costo=0.0;
        for(int i=0;i<hojas.size();i++){
            HojaProduccion actual=(HojaProduccion) hojas.get(i);
            HojaSemanal actualS=(HojaSemanal)hojas.get(i);
            if(actual.getLinea()==linea){
                costo+=actual.getCantidadProductos()*10000;
                costo+=actualS.getEmpleado().getRemuneraciones();
                
            }
                    
            
        }
        return costo;
    } 
}

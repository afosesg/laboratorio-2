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
public class FoodCo {
    private ArrayList<Empleado> empleados;
    private ArrayList<Supervisor> supervisores;
    

    public FoodCo() {
        this.empleados=new ArrayList<>();
        this.supervisores=new ArrayList<>();
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void setSupervisores(ArrayList<Supervisor> supervisores) {
        this.supervisores = supervisores;
    }
    public void addEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    public void addSupervisor(Supervisor supervisor){
        supervisores.add(supervisor);
    }
    public double calcularCostosProduccionDiariaTotal(){
        double costo=0.0;
        for(int i =0;i<supervisores.size();i++){
            Supervisor actual=supervisores.get(i);
            costo+=actual.calcularCostoTotalProduccionDiaria();
        }
        return costo;
    }
    public double calcularCostosSemanalPersonalTotal(){
        double costo=0.0;
        for(int i =0;i<supervisores.size();i++){
            Supervisor actual=supervisores.get(i);
            costo+=actual.calcularCostoSemanalPersonal();
        }
        return costo;
    }
    public double calcularCostosTotalLinea(int linea){
        double costo=0.0;
        for(int i=0;i<supervisores.size();i++){
            Supervisor actual=supervisores.get(i);
            costo+=actual.calcularCostoLinea(linea);
        }
        return costo;
    }
    public double calcularCostoRemuneracionTotalEmpleados(){
        double costo=0.0;
        for(int i=0;i<empleados.size();i++){
            Empleado actual= empleados.get(i);
            costo+=actual.getRemuneraciones();
        }
        return costo;
    }
    public static void main(String args[]){
        
    }
}

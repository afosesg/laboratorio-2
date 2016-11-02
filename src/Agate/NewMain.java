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
import java.util.Arrays;
import java.util.HashSet;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Personal[] p = new Personal[10];  
    Campaña[] campañas = new Campaña[10];
    Anuncio[] anuncios = new Anuncio[10];
    Personal p1 = new Personal("ab", "cd", 100, "Jefe", null);
    Cliente c = new Cliente("fg", "strasse", null);
    Director d = new Director("Freddy", "Vanegas", 1500000);
    ArrayList<String> nota = new ArrayList<String>();
    Campaña elecciones = new Campaña("USA", "08/05/2016", "08/11/2016", 50000,1500000, 2500000 );
    Anuncio spot = new Anuncio("Propaganda", 10000, 150000, false, true, false, true, false, true, false);
    
    
    p[0] = p1;
    c.setContacto(p);
    p1.setCliente(c);
    
    
    anuncios[0] = spot;
    nota.add("algo");
    nota.add("datos");
    p1.setNotas(nota);

        
    elecciones.setDirector(d);
    campañas[0] = elecciones;
    elecciones.setAnuncios(anuncios);
    c.setCampañas(campañas);
    
    
    
    System.out.println(Arrays.toString(c.getContacto()));
    System.out.println(p1.getCliente());    
    System.out.println();
    System.out.println(p1.getNotas().get(0));
    System.out.println(elecciones.getDirector());
    //System.out.println(c.getCampañas());
    System.out.println(elecciones.presupuesto());
    //System.out.println(elecciones.getAnuncios());
    
    
    
    }
        
    
}

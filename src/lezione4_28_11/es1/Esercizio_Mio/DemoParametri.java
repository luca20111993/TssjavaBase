/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione4_28_11.es1.Esercizio_Mio;

import lezione4_28_11.es1.Esercizio_Mio.Bicycle;

/**
 *
 * @author tss
 */
public class DemoParametri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Bicycle bici = new Bicycle(0, 1);
        
        
        
        bici.cambiaVelocità(10);
    
        System.out.println(bici.leggiVelocità());
        
        
        
        
        //Proviamo class box
        
        Box box = new Box ();
        //passaggio parametro PRIMITIVO (INT) in java
        int numero = 10;
        box.setN(numero);
        
        //che numero stampa?? ((su box ho settato n = 100))
        
        System.out.println(numero);
        
        //netbin ragiona in modo strutturale. se ho settato numero = 10 nel main , nonostante 
        //abbiamo N=100 nella classe , lui stamperà il numero e non il valore nella classe
        //se non richiamato
        
        
        
    
    }
    
    
}

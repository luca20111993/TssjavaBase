/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione4_28_11.es1.Esercizio_Mio;

/**
 *
 * @author tss
 */
public class DemoOggetti {
    
    public static void main(String[] args) {
        
        Bicycle b1 = new Bicycle(10, 1);
        
        
        Bicycle b2 = new Bicycle(10, 1);
        
        
        if (b1 == b2){
            System.out.println("uguali");
        }else{
            System.out.println("diversi");
        }        
        //Stampa diversi perchè sono due OGGETTI con gli stessi parametri ma DIVERSI
        
        Bicycle b3 = new Bicycle();
        
        
        System.out.println("numero istanze create: " + Bicycle.getNumeroIstanzeCreate());
        
        
        
    }
     
}

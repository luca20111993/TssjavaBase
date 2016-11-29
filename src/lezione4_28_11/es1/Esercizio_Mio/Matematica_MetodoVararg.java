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
public class Matematica_MetodoVararg {
    
    public static final double PI = Math.PI;
    
    
   public double somma ( int... numeri)/* si può anche scrivere come:
   public long sommaDiversa (int numeri []) { 
   return=0}
   */{
       
       double risultato =0;
       for (int i = 0; i < numeri.length ; i++) {
           risultato += numeri [i];
           
       }
       return risultato;
       
       //Creiamo nel main un ciclo for (es) , poi ci spostiamo qua e con questo metodo possiamo fare 
       //l'operazione desiderata fra i numeri dell'array
   }
    
    
    
    
}

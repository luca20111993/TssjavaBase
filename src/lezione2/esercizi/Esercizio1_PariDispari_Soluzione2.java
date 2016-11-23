/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione2.esercizi;

/**
 *
 * @author tss
 */
public class Esercizio1_PariDispari_Soluzione2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 20;
        int i = 0;
        int add = 2;
        int totale = 0;
        String risultato;
        //Risolvo
        
        while ( totale < num1){
            totale = totale + add;
          
        } 
        
         if (totale == num1){
                risultato = "Il numero è pari";
                 
                 }else{
                risultato = "il numero è dispari";
                
          
        }
        System.out.println(risultato);
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione2.esercizi;

import java.util.Scanner;

/**
 *Legge un numero in input e stampa se pari o dispari
 * 
 * @author tss
 */
public class Esercizio1_PariDispari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s;
        int pari;
        
        // Crea oggetto scanner per leggere input
        s = new Scanner(System.in);
        System.out.print("Inserisci il numero: ");
        
        // Leggo il numero in input
        int numero = s.nextInt();
        String risultato;
        System.out.println("Il numero inserito è: " + numero);
        
        //Elaboro le variabili per capire se è pari o dispari
        pari = numero %2;
        
        
        if (pari==0){
            risultato = "il numero è pari";
        }else{
            risultato = "Il numero è dispari!";
            
            /* in ternario si scrivere così:
            risultato = (numero % 2) == 0 ? "il numero è pari" : "il numero è dispari";
            */
        }
        System.out.println(risultato);
        
    }
    
}

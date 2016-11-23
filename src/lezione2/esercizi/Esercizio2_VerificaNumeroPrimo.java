/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione2.esercizi;

import java.util.Scanner;

/**
 *leggo un numero in input e stampa se è un numero primo o no.
 * @author tss
 */
public class Esercizio2_VerificaNumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s= new Scanner(System.in);
        System.out.println("inserire primo numero: ");
        int num1 = s.nextInt();
        int caso1;
        int caso2;
        int caso3;
        int caso4;
        String risultato;
        
        
        caso1 = num1 %2;
        caso2 = num1 %3;
        caso3 = num1 %5;
        caso4 = num1 %7;
        
        if((caso1 == 0 || caso2 == 0 || caso3 == 0 || caso4 ==0) && num1 != 1 && num1 != 2 && num1 != 3 && num1 != 5 && num1 != 7){
            risultato = "numero non primo";
        }else{
            risultato = "numero primo";
        
    }
        System.out.println(risultato);  
        
        
        
    }
    
}

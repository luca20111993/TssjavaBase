/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione2.esercizi;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Esercizio3_Fattoriali {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       int i;
       String ciclo = JOptionPane.showInputDialog("Inserire numero da controllare: ");
       int cicli = Integer.parseInt(ciclo);
       System.out.println("cicli: " + cicli);
       int fat =1;
       
       //Elaboro i risultati
       //Fattoriale = n * fatt (n-1)
      
       for (i = 1 ; i <= cicli ; i ++ ){
           fat = fat * i;
           
          
           
       }
        System.out.println(fat);
        
        
    }
    
}

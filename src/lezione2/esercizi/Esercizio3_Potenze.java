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
public class Esercizio3_Potenze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String num1;
        int num;
        int i;
        num1 = JOptionPane.showInputDialog("Inserire numero reale: ");
        num = Integer.parseInt(num1);
        String esp1 = JOptionPane.showInputDialog("inserire esponente: ");
        int esp = Integer.parseInt(esp1);
        int potenza=1;
        
        
        for ( i = 0 ; i < esp ; i ++){
         // Potenza = potenza * num
         potenza = potenza * num;
         
            
            System.out.println(potenza);
        }
        
        
        
        
    }
    
}

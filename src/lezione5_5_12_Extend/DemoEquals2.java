/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione5_5_12_Extend;

/**
 *
 * @author tss
 */
public class DemoEquals2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creo prima persona P
        Persona p = new Persona ("Mario", "Rossi" );
        
        //Creo seconda persona A
        Persona a = new Persona ("Mario", "Rossi" );
        
        //Guardo mediante medoto Equals che si trova sotto classe persona se
        //le due persona sono uguali
        
        System.out.println(p.equals(a));
        
        //Dopo aver controllato se la persona a esiste , se la classe è la stessa e se nome e cognome corrispondono
        //il nostro equals tira fuori vero
        
        
    }
    
}

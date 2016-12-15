/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione5_5_12_Extend;

import java.util.Date;

/**
 *
 * @author tss
 */
public class DemoPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        //Creo AUTISTA
        Autista a = new Autista("mario", "rossi" , "B");
        //CREO PERSONA
        Persona p = new Persona("giuseppe", "verdi");
        
        //CREO ARRAY PERSONE DI 2 ELEMENTI
        Object [] persone = new Object[2];
        
        //Assegno all'array in posizione 0 e 1  gli assegno a ed p
        persone [0] = a;
        persone [1] = p;
        
        //uso metodo stampa
                
        stampa(persone);
        
        
       
    }
    
    
    //polimorfismo
    public static void stampa(Object[] anagrafica){
        //PER OGNI ANAGRAFICA GLI ASSEGNO UNA VARIABILE ED ESEGUO
        //PER OGNI ELEMENTO DI OBJECT GLI ASSEGNIAMO ANAGRAFICA ED ESEGUIAMO
        for (Object o : anagrafica) {
            
            //SI PUÒ SCRIVERE ANCHE COSÌ
            /* for ( int i=0 ; i<anagrafica.lenght ; i++){
            object o = anagrafica [i]
            }
            */
            System.out.println(o.toString());
        }
        
    }
}

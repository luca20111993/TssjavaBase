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
public class DemoEquals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creo p Autista
        Autista p = new Autista ("Mario", "Rossi" , "C");
        
        //Creo a autista
        Autista a = new Autista ("Mario", "Rossi", "C");
        
        //--QUA NON AVEVAMO ANCORA FATTO L'OVERRIDE SU PERSONA -- (e comunque siamo nella classe autista ergo non crea problemi.
        
        //In questo caso i puntatori vanno da due parti diverse , creano due autisti diversi
        //nonostante abbiano uguali caratteristiche.
        //La risposta è falsa. Equals controlla SOLO i puntatori
        System.out.println(p.equals(a));
        
        //Dico che a = p
        a = p;
        
        //Adesso equals controlla che entrambi i puntatori puntino lo stesso punto
        //CONTROLLA SOLO QUELLO E BASTA QUINDI SE ANCHE SI CHIAMASSERO IN MANIERA DIVERSA
        //DIREBBE SEMPRE TRUE POICHÈ NON CONTROLLA I VALORI MA SOLO LA DIREZIONE DEL PUNTATORE
        System.out.println(p.equals(a));
        
        
    }
    
}

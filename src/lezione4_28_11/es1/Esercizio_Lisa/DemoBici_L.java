/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione4_28_11.es1.Esercizio_Lisa;



/**
 *
 * @author tss
 */
public class DemoBici_L {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Bicicletta_L bici1= new Bicicletta_L();
        
        Bicicletta_L bici= new Bicicletta_L(0,1);
        bici.setSpeed(100);
        
        System.out.println("Bici: "+bici.getSpeed());
        
        Box_L box= new Box_L();
        box.setBici(bici);
        System.out.println("Bici: "+bici.getSpeed());
    }
    
}//L'oggetto BOX 

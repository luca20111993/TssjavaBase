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
public class Box_L {
    //Questo è un'esempio di come funziona il passaggio di parametri per valore. viene fatta 
    //una copia di quello che tu gli passi dentro il parametro
    
    private Bicicletta_L bici;

    public Bicicletta_L getBici() {
        return bici;
    }

    public void setBici(Bicicletta_L param) {
        param.setSpeed(0);
        this.bici = param;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione3_21_11_esercizi.lezione3_21_11_gioco_dadi;

/**
 *
 * @author tss
 */
public class Contatore {
    private int valore;
    private int passo;
    
    public Contatore (int valoreIniziale , int step) {
        valore = valoreIniziale;
        passo = step;
        
    }
    
    public void Conta(){
        valore +=passo;
    }
    
    public int valoreCorrente (){
        return valore;
    }
    
    
    
}

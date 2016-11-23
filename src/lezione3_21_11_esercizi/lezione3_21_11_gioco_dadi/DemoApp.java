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
public class DemoApp {
    
    public static void main(String[] args) {
       
        //creo oggetto
        Giocatore g = new Giocatore ("Rossi" , 100);
        
        Dado giocatoreDado = new Dado (6);
        Dado bancoDado = new Dado (6);
        
        Contatore contaMani = new Contatore (0,1);
        
        
        while (g.saldo() > 0){
            
            contaMani.Conta ();
            int lancioGiocatore = giocatoreDado.lancio();
            int lancioBanco = bancoDado.lancio();
            
            
            if (lancioGiocatore > lancioBanco){
                g.vinciSoldo();
            }else{
                g.perdiSoldo();
            }
            //double vittoria = (g.contavv / contaMani.valoreCorrente()) * 100;
            
            System.out.println(" Risultato lancio : Giocatore " + lancioGiocatore + " . . . . Banco -> " + lancioBanco);
            g.stampa();
            System.out.println("Tiro numero: " + contaMani.valoreCorrente() + " -- partite vinte: " + g.contavv );
        
        
    }
        
        
        /*double vittoria = (g.contavv / contaMani.valoreCorrente()) * 100;
        System.out.println(" % vittoria = " + vittoria);*/
    }
}

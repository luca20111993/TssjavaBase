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
public class Giocatore {

    private String nome;
    private int soldi = 0;
    int contavv;
    

    public Giocatore(String nomeGiocatore, int credito) {
        nome = nomeGiocatore;
        soldi = credito;
    }

    public void perdiSoldo() {
        soldi--;
    }

    public void vinciSoldo() {
        contavv ++ ;
        soldi++;
    }

    public void stampa() {
        System.out.println("Nome: " + nome + " , soldi : " + soldi);
    }

    public int saldo() {
       return soldi;
    }

}

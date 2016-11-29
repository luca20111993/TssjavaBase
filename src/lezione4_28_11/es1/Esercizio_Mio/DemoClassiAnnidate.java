/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione4_28_11.es1.Esercizio_Mio;

/**
 *
 * @author tss
 */
public class DemoClassiAnnidate {

    public static void main(String[] args) {
       // Persona P = new Persona("mario", "rossi");
        System.out.println(P.getCognome() + " , " + P.getNome());

    }

}

class Persona {

    private String nome, cognome;
    private indirizzo indirizzo;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    class indirizzo {
        private String indirizzi;
        private int numero , cap;
        private String città;

        public indirizzo(String indirizzi, int numero, int cap, String città) {
            this.indirizzi = indirizzi;
            this.numero = numero;
            this.cap = cap;
            this.città = città;
        }

        public String getIndirizzi() {
            return indirizzi;
        }

        public void setIndirizzi(String indirizzi) {
            this.indirizzi = indirizzi;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public int getCap() {
            return cap;
        }

        public void setCap(int cap) {
            this.cap = cap;
        }

        public String getCittà() {
            return città;
        }

        public void setCittà(String città) {
            this.città = città;
        }
    }
}

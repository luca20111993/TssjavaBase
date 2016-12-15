/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione6_ordinamento.ordinamentoIMPORTANTE;

/**
 *
 * @author tss
 */
public class DemoOrdinaArray {

    public static void main(String[] args) {

        //Crea array di persone
        //Stampa array
        //richiama metodo ordina passando l'array di persone
        //Stampa array ordinato
        Persona p1 = new Persona("Mario", "Rossi");
        Persona p2 = new Persona("Gennaro", "Savastano");
        Persona p3 = new Persona("Roberto", "Baggio");
        //Persona p4 = new Persona("Ajeje" , "Brazorv");

        Persona[] persone = new Persona[3];
        persone[0] = p1;
        persone[1] = p2;
        persone[2] = p3;

        stampa(persone);

        ordina(persone);
        
        stampa(persone);

    }

    private static void stampa(Persona[] persone) {

        System.out.println("--------- INIZIO STAMPA ---------");

        //per tutte le persone nell'array persona: 
        for (Persona persona : persone) {
            System.out.println(persona);
        }
        System.out.println("--------- FINE STAMPA ---------");
    }

    /**
     * Ordinamento con bubblesort
     *
     * @param persone
     */
    private static void ordina(Persona[] persone) {
        boolean disordinato;

        do {
            //Setto disordinato = false
            disordinato = false;
            //Avvio ciclo for con la lunghezza MENO uno poichè vogliamo che l'ultimo
            //Controllo sia valido.
            for (int i = 0; i < persone.length -1; i++) {
                //Creo p[i]
                Persona p = persone[i];
                //Creo p dove è il numero successivo
                Persona pNext = persone[i + 1];
                
                //SE il numero è maggiore di zero allora scambio i due numeri
                //e faccio uscire disordinato = true
                if (p.compareTo(pNext) >= 0) {
                    //Scambio
                    persone[i] = pNext;
                    persone[i + 1] = p;
                    disordinato = true;
                }

            }

        } while (disordinato);

    }
}

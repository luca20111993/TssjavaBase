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
public class DemoEquals4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //creo autista1
        Autista p = new Autista("mario", "rossi", "b");
        //Creo autista2
        Autista a = new Autista("pippo", "rossi", "b");
        
        Autista daCercare = new Autista ("pippo" , "rossi" , "b");
        
        
        Object [] persone = new Object[2];
        persone [0] = p;
        persone [1] = a;
        
        //PRIMO valore fra ()= dove = persone
        //SECONDO valore fra () = che cosa = daCercare
        int risultato = cerca (persone , daCercare);
        
        System.out.println(risultato);
        
        //IL RISULTATO SARÀ 0 , 1 O -1
        //IL RISULTATO È LA POSIZIONE SULL'ARRAY DELL'ELEMENTO CERCATO.
        //SE L'ELEMENTO CERCATO NON SI TROVA SULL'ARRAY LA RISPOSTA SARÀ -1

    }

    /**
     *
     * Ricerca un elemento all'interno di un vettoree ritorna l'indice della
     * prima occorrenza trovata
     *
     *
     * @param anagrafica vettore dove ricercare
     * @param elemento elemento da cercare all'interno del vettore
     * @return indice dell'elemento se trovato , altrimenti -1
     *
     */
    //Creo metodo per cercare
    public static int cerca(Object[] anagrafica, Object elemento) {

        for (int i = 0; i < anagrafica.length; i++) {
            if (anagrafica[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
}



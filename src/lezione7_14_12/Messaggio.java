/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione7_14_12;

import java.util.Objects;
import lezione6_ordinamento.Generics.*;

/**
 *
 * @author tss
 */

//Implementiamo la classe comparable PER messaggio.
public class Messaggio implements Comparable<Messaggio>{
    
    private String testo;

    public Messaggio(String testo) {
        this.testo = testo;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String messaggio) {
        this.testo = messaggio;
    }

    
    
    
    
    @Override
    public String toString() {
        return "Messaggio (" + "testo : " + testo + ")";
    }

    
    //Riscriviamo il metodo con l'override
    @Override
    //Questo metodo ci da in output un valer numerico che ci indica la posizione del primo oggetto
    //Analizzato rispetto al secondo
    public int compareTo(Messaggio o) {
        //Ritorna questo testo rispetto al testo analizzato.
        return this.testo.compareTo(o.getTesto());
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.testo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Messaggio other = (Messaggio) obj;
        if (!Objects.equals(this.testo, other.testo)) {
            return false;
        }
        return true;
    }
    
    
    
    
}

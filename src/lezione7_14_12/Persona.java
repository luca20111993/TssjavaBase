/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione7_14_12;

import lezione6_ordinamento.Generics.*;
import lezione6_ordinamento.ordinamentoIMPORTANTE.*;
import java.util.Date;
import java.util.Objects;

/**
 * Facciamo una classe
 *
 * @author tss
 */

//Se implementiamo il comparableTO significa che dobbiamo creargli il metodo altrimenti ci da errore
//Per creare il metodo ci basta cliccare sulla iconcina di errore e creare tutti i metodi astratti
public class Persona implements Comparable<Persona> {

    private String nome, cognome;
    private String sesso;
    private Date dataNascita;

    //Quello vuoto non ha senso in questo caso MA in futuro , per salvarlo su DB
    //sarà OBBLIGATORIO fare il costruttore vuoto ergo incomincio già adesso
    public Persona() {
    }

    //do 2 opzioni una NOME E COGNOME e enuncio le altre variabili facendo riferimento al mio metodo costruttore
    //come recipienti vuoti  con le loro rispettive definizione in questo caso null
    public Persona(String nome, String cognome) {
        this(nome, cognome, null, null);
    }

    //l'altra con TUTTE LE OPZIONI
    public Persona(String nome, String cognome, String sesso, Date dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
        this.dataNascita = dataNascita;
    }

    //metto getter e setter di tutto poichè in futuro , quando lavoreremo coi database , 
    //serviranno tutti.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    //Vado esattamente a riscrivere la firma del metodo tostring mediante override
    // e gli dico quello che voglio che faccia
    
    
    @Override
    public String toString() {
        return nome + " . " + cognome;
    }
    

    //METODO OVERRIDE PER DEMOEQUALS
    //METODO DEL PROFESSORE
   /*@Override
    public boolean equals(Object obj) {
        //Se la classe dell'oggetto assegnato a OBJ non esiste allora ritorna falso
        if (obj == null) {
            return false;
        }
        //Se la classe dell'oggetto assegnato a OBJ è diversa da Persona ritorna falso
        if (this.getClass() != Persona.class) {
            return false;
        }
        //Assegna a P obj facendolo diventare Persona 
        //QUESTO PROCESSO SI CHIAMA CAST
        //QUELLO FRA PARENTESI È QUELLO IN CUI SI VUOLE SIA CONVERTITA
        Persona p = (Persona) obj;

        //Se è arrivato fino qua significa che obj fa parte di Persona.
        //Ergo this sta a indicare i valori di Persona che si trovano in questa classe
        if (this.getNome().equals(p.getNome())
                && this.getCognome().equals(p.getCognome())) {
            return true;
        } else {
            return false;
        }
    }*/

    
    //METODO CREATO CON INSERT CODE 
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.nome);
        hash = 61 * hash + Objects.hashCode(this.cognome);
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        return true;
    }

    
    
    //riscrivo metodo compareTO
    @Override
    public int compareTo(Persona o) {
        
        return this.cognome.compareTo(o.getCognome());
        
    }
}





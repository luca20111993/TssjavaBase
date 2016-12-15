/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione5_5_12_Extend;

import java.util.Objects;

/**
 *
 * @author tss
 */
//ESTENDE PERSONA CHE HA COME METODO COSTRUTTORE VUOTO ERGO RICHIEDE 0 PARAMETRI
//MA QUESTA VOLTA VOGLIO CHE ABBIA 2 PARAMETRI N , C
public class Autista extends Persona {
//Aggiungo variabile patente
    private String patente;

    //Creo metodo costruttore esteso di PERSONA chiamato AUTISTA e gli aggiungo la mia richiesta PATENTE
    public Autista(String nome, String cognome , String patente) {
        super(nome, cognome);
        this.patente = patente;
    }
//Creo Getter and Setter
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    //VOGLIO UN METODO CHE MI PERMETTA DI STAMPARE IN OUTPUT SU MAIN
    //QUINDI RIPRENDO IL MIO METODO TOOSTRING DI PERSONA IN OVERRIDE E GLI AGGIUNGO QUALCOSA

    @Override
    public String toString() {
        return super.toString() + " , " + patente;
    }

    
    
    //METODO EQUALS CON INSERT CODE
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.patente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (!super.equals(obj)){
            return false;
        }
        final Autista other = (Autista) obj;
        
        if (!Objects.equals(this.patente, other.patente)) {
            return false;
        }
        return true;
    }
    
    
    
    
    

}

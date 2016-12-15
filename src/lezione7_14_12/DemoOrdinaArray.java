/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione7_14_12;


import java.text.ParseException;
import java.util.Date;
import lezione6_ordinamento.ordinamentoIMPORTANTE.*;
import util.DateFunction;
import util.LibreriaFunzioniArray;

/**
 *
 * @author tss
 */
public class DemoOrdinaArray {

    public static void main(String[] args) throws ParseException {

        
        //I METODI DA ME CREATI VALGONO SOLO PER GLI OGGETTI E NON PER GLI INT ERGO
        //CHIAMO LA CLASSE INTEGER CHE È UNA CLASSE DI INTERI.
        
        //int [] numeri = {.....} SBAGLIATO
        Integer[]numeri = {3 , 4 , 10 , 50 , 66};
        
        //adesso posso utilizzare il mio metodo
        LibreriaFunzioniArray.ordina(numeri);
        LibreriaFunzioniArray.stampa(numeri);
        
        
        
        //---------------
        
        //Crea array di persone
        Persona p1 = new Persona("Mario", "Rossi");
        Persona p2 = new Persona("Gennaro", "Savastano");
        Persona p3 = new Persona("Roberto", "Baggio");
        //Persona p4 = new Persona("Ajeje" , "Brazorv");

        Persona[] persone = new Persona[3];
        persone[0] = p1;
        persone[1] = p2;
        persone[2] = p3;

        //Stampa array
        LibreriaFunzioniArray.stampa(persone);

        //richiama metodo ordina passando l'array di persone
        LibreriaFunzioniArray.ordina(persone);
        
        //Stampa array ordinato
        LibreriaFunzioniArray.stampa(persone);
        
        
        //Faccio prova 2 , creo array messaggi
        Messaggio[] messaggi = new Messaggio[3];
        messaggi[0] = new Messaggio("Ciao");
        messaggi[1] = new Messaggio("Arrivederci");
        messaggi[2] = new Messaggio("Ciaone");
        
        //Gli faccio stampare i miei messaggi
        LibreriaFunzioniArray.stampa(messaggi);
        
        //Ordino i messaggi
        LibreriaFunzioniArray.ordina(messaggi);
        
        //ristampo i messaggi ordinatin in ordine alfabetico
        LibreriaFunzioniArray.stampa(messaggi);
        
        
        
        //Utilizzio metodo cerca
        System.out.println(LibreriaFunzioniArray.cerca(persone, new Persona("Mario", "Rossi")));
        
        //Utilizzo metodo cerca
        System.out.println(LibreriaFunzioniArray.cerca(messaggi, new Messaggio("Probabile")));
        
        
        //Provo a usare il metodo per convertire una data
        System.out.println(DateFunction.convert(new Date()));
        
        //Provo altro metodo per fare il cotnrario
        System.out.println(DateFunction.convert("01/01/2010"));
        
        

    }
    
    

    
}

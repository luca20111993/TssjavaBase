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
public class Bicycle {
    
    private int speed;
    private int gear;
    
    //Creo un CONTATORE di istanze create
    private static int NumeroDiIstanze ;
    
    
    //per delineare il parametro della STATIC si può fare:
    //Questo static viene ripetuto solo una volta la prima volta che prendiamo in considerazione
    //l'oggetto messo in static
    static {
        NumeroDiIstanze =0;
    }

    //con questo metodo faccio in modo che l'utente non faccia danni
    //METODO COSTRUTTORE
    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
        //Lo scrivo solo una volta nel metodo costruttore principale tanto in seguito farò riferimento
        //a questo metodo con this ();
        this.NumeroDiIstanze ++;
    }
    
    //POSSO AVERE PIÙ COSTRUTTORI
    //QUANDO VADO NEL MAIN POSSO SCEGLIERE QUALE CLASSE AVERE E CON QUALI PARAMETRI
    public Bicycle() {
        speed = 1;
        
    }
    
   public Bicycle (int speed) {
       this.speed = speed;
       
   }
    
    
    //Faccio un metodo che legga la velocità e me la mostri
    public int leggiVelocità () {
        return speed;
        
    }
    
    //Faccio un metodo per modificare la velocità
    //lo facciamo in void per non dare il return sennò il nostro leggi velocità sarebbe inutile
    public void cambiaVelocità (int valore) {
        speed = valore;
    }
    
    //Creo un metodo per leggere il numero delle istanze create
    //lo creo public static in modo che possa richiamarlo NON per il nome dell'oggetto 
    //ma per il NOME DELLA CLASSE.
    public static int getNumeroIstanzeCreate (){
        return NumeroDiIstanze;
    }
    
    
    
}

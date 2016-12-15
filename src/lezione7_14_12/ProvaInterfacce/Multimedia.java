/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione7_14_12.ProvaInterfacce;

/**
 *
 * @author tss
 */
public interface Multimedia {
    //POSSIAMO OMETTERE PUBLIC PERCHÈ QUALSIASI COSA IN UNA INTERFACCIA È PUBLIC
    public static final String PLAYER = "CD_Player";
    
    public void play();
    public void stop();
    public void pause();
    
    //prima abiamo detto che le interfacce non potevano avere corpo.
    //Ma da java 8 possiamo creargli un corpo mettendo come default il metodo.
    //Quando vado a chiamare il modello reset SE vogliamo riscriverlo dobbiamo fare l'override
    default public void reset(){
        System.out.println(this.getClass() + "." + "reset().... di default");
    }
    
}

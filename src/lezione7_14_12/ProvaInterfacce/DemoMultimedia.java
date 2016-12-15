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
public class DemoMultimedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Multimedia mm = new CdPlayer();
        mm.play();
        mm.stop();
        
        Multimedia mm1 = new MP3Player();
        mm1.play();
        mm1.stop();
        mm1.pause();
        
        
        //Possiamo anche fare un'array di multimedia
        Multimedia [] medias = new Multimedia[2];
        medias[0] = mm;
        medias[1] = mm1;
        
        //Quindi se entrambi gli oggetti implementano multimedia posso fare un ciclo for
        for (Multimedia media : medias) {
            media.play();
            media.reset();
            
            
        }
        
    }
    
    
}

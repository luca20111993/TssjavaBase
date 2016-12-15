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
public class MP3Player implements MultimediaPlus{
    
    
    @Override
    public void play() {
        System.out.println(this.getClass() + ".play()");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass() + ".stop()");
    }

    @Override
    public void pause() {
        System.out.println(this.getClass() + ".pause()");
    }
    
    @Override
    public void reset(){
        System.out.println(this.getClass() + ".Reset usato metodo override su mp3");
    }

    @Override
    public void fastorward() {
        System.out.println(this.getClass() + ".FF()");
    }

    @Override
    public void backForward() {
        System.out.println(this.getClass() + ".BF()");
    }
}

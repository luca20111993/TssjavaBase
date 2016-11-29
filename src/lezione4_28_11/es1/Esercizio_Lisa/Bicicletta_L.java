/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione4_28_11.es1.Esercizio_Lisa;

/**
 *
 * @author tss
 */
public class Bicicletta_L {
    
    private int speed;
    private int gear;

    public Bicicletta_L() {
        speed=1;
    }

    public Bicicletta_L(int speed) {
        this.speed = speed;
    }

    public Bicicletta_L(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
    
}

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
public class DemoEquals3 {

    public static void main(String[] args) {

        //creo autista1
        Autista p = new Autista("mario", "rossi", "b");
        //Creo autista2
        Autista a = new Autista("mario", "rossi", "b");
        //li uguaglio con metodo equals in override su autista

        System.out.println(a.equals(p));

    }
}

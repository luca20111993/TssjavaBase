/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione3_21_11;

/**
 *
 * @author tss
 */
public class Switch_e_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int x = 5;

        
        //Caso con lo switch , dopo il "case" c'è la condizione! quindi se X = 1 abbiamo condizione uno , se X = 2 abbiamo condizione 2 , ecc
        switch (x) {
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;

            default:
                System.out.println("altro");
                break;

        }
//Rappresentazione dello switch precedente con gli if
        if (x == 1) {
            System.out.println("uno");
        } else if (x == 2) {
            System.out.println("due");
        } else if (x == 3) {
            System.out.println("tre");
        } else {
            System.out.println("altro");
        }
    }
}

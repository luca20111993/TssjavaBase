/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione6_ordinamento.Generics;

/**
 *
 * @author tss
 */
public class DemoBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Box<Persona> box = new Box<>(new Persona("llll", "yyyyy"));
        Persona p = box.getObject();
        
        
        Box<Message> box1 = new Box<>(new Message("Ciao"));
        Message msg = box1.getObject();
        
        
        
        
        
        
        
        
        //METODO PRE JAVA 5
        /*
        Box box = new Box(new Persona("Mario", "Rossi"));
        
        //SE VOGLIO PRENDERE UNA PERSONA DAL MIO INSIEME GENERICO DEVO FARE IL CAST 
        
        Persona object = (Persona) box.getObject();
        if (box.getObject() instanceof Persona){
            Persona p = (Persona) box.getObject();
            p.setCognome("XXXXXX");
            System.out.println(box.getObject());
        }
        
        System.out.println(box.getObject().getClass());
        
        Box box1 = new Box(new Message ("Ciao"));
        
        System.out.println(box1.getObject().getClass());
    }*/
    
    
  
}
}

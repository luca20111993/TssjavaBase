/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione6_ordinamento.Generics;

/**
 * //Box è una scatola generica
 * Quindi gli creiamo dentro in obj in modo che sia il più generica possibile
 *
 * @author tss
 */
public class Box<T> {
    
    private T object;

    public Box(T object) {
        this.object = object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
    
    @Override
    public String toString(){
        return object.toString();
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclass;

/**
 *
 * @author asunawesker
 */
public class Box<T> {

    private T t;

    public T get() { 
        return t; 
    }
    public void set(T t) { 
        this.t = t; 
    }
    
    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
  
}


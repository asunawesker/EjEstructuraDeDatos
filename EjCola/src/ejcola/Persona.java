/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcola;

/**
 *
 * @author asunawesker
 */
public class Persona {
    private int edad;
    private float precio;

    public Persona(int edad) {
        this.edad = edad;
        precio(edad);
    }
    
    /*
     * Getters & setters
    */
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    private float precio(int edad) {
        if (between(edad, 5, 10)) {
            precio = 1;
        } else if (between(edad, 11, 17)) {
            precio = (float) 2.5;
        } else if (edad > 18) {
            precio = (float) 3.5;
        } 
        
        return (float) 0.1;
    }
    
    private static boolean between(int edad, int min, int max) {
        return (edad >= min && edad <= max);
    }
}

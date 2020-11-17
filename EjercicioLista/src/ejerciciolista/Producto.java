/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolista;

import java.util.Random;

/**
 *
 * @author iragu
 */
public class Producto {
    
    public String nombre;
    public int cantidad, precio, count, total;
    private Random random;
    
    public Producto() {
        random = new Random();
        cantidad = random.nextInt(100);
        precio = random.nextInt(1000);
        count = random.nextInt(1000);
        nombre = "Producto " + count;
        total = cantidad * precio;
    }   
        
}

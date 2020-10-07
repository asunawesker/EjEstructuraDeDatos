/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherencia;

import java.util.ArrayList;

/**
 *
 * @author asunawesker
 */
public class Main {

    public static Electrodomestico [] electrodomesticos = new Electrodomestico [10];
    
    public static void main(String[] args) {
        float precioTotal = 0; 
        float precioTotalTelevision = 0;
        float precioTotalLavadora = 0;
        float precioTotalElectrodomestico = 0;
        
        Electrodomestico electrodomestico = new Electrodomestico();
        Lavadora lavadora = new Lavadora();
        Television television = new Television(); 
        
        electrodomesticos [0] = electrodomestico;
        electrodomesticos [9] = electrodomestico;
        
        for (int i=1; i<electrodomesticos.length-5; i++){
            electrodomesticos [i] = lavadora;
        }
        
        for (int i=5; i<electrodomesticos.length-1; i++){
            electrodomesticos [i] = television;
        }
        
        for (int i=0; i<electrodomesticos.length; i++){
            System.out.println(electrodomesticos[i].toString() + " numero " + (i+1) + " $" + electrodomesticos[i].precioFinal());
            precioTotal += electrodomesticos[i].precioFinal();
        }
        
        System.out.println("Precio total: " + precioTotal);
        
        for (int i=0; i<electrodomesticos.length; i++){
            if (electrodomesticos[i] instanceof Lavadora){
                precioTotalLavadora += electrodomesticos[i].precioFinal();
            } else if (electrodomesticos[i] instanceof Television){
                precioTotalTelevision += electrodomesticos[i].precioFinal();
            } else {
                precioTotalElectrodomestico += electrodomesticos[i].precioFinal();
            }
        }
        
        System.out.println("Precio total lavadora: " + precioTotalLavadora);
        System.out.println("Precio total television: " + precioTotalTelevision);
        System.out.println("Precio total electrodomesticos: " + precioTotalElectrodomestico);
    }
}

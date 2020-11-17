/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolista;

import gui.Table;
import java.util.Random;

/**
 *
 * @author asunawesker
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Table table = new Table();
        table.setVisible(true);
        
        /*
        int randomProduct;        
        LinkedListProducto list = new LinkedListProducto();
        
        Random random = new Random();
        randomProduct = random.nextInt(9);
        
        System.out.println("Productos generados del 0 al 8: " + randomProduct + "\n");
        
        for (int i=0; i<randomProduct ; i++){
            Producto producto = new Producto();
            list.addHead(producto);
        }
        
        list.printLinkedListHeadToTail();
        System.out.println("Precio final: " + list.totalCost());
        */
        
    }
    
}

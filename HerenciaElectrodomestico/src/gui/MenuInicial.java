/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author asunawesker
 */
public class MenuInicial {
    
    ArrayList<herenciaelectrodomestico.Electrodomestico> listaElectrodomesticos = new ArrayList<>();
    
    //Menú para seleccionar que electrodoméstico quiero comprar, método público para que se vea en el Main
    public void menu (){
        Object [] electrodomesticos ={"Electrodomestico","Lavadora","Television", "Precio a pagar", "Salir"}; 
        Object opcion = JOptionPane.showInputDialog(null,"Selecciona el electrodomestico que quieras comprar", 
                "Elegir",JOptionPane.QUESTION_MESSAGE,null,electrodomesticos, electrodomesticos[0]);
        
        do {
            if (opcion == "Electrodomestico"){
                ElectrodomesticoGUI electrodomestico = new ElectrodomesticoGUI();
                electrodomestico.menu(listaElectrodomesticos);
                opcion = JOptionPane.showInputDialog(null,"Selecciona el electrodomestico que quieras comprar", 
                        "Elegir",JOptionPane.QUESTION_MESSAGE,null,electrodomesticos, electrodomesticos[0]);
            } else if (opcion == "Lavadora") {
                LavadoraGUI lavadora = new LavadoraGUI();
                lavadora.menu(listaElectrodomesticos);
                opcion = JOptionPane.showInputDialog(null,"Selecciona el electrodomestico que quieras comprar", 
                        "Elegir",JOptionPane.QUESTION_MESSAGE,null,electrodomesticos, electrodomesticos[0]);
            } else if (opcion == "Television") {
                TelevisionGUI television = new TelevisionGUI();
                television.menu(listaElectrodomesticos);
                opcion = JOptionPane.showInputDialog(null,"Selecciona el electrodomestico que quieras comprar", 
                        "Elegir",JOptionPane.QUESTION_MESSAGE,null,electrodomesticos, electrodomesticos[0]);
            } else if(opcion == "Precio a pagar") {
                ElectrodomesticoGUI electrodomestico = new ElectrodomesticoGUI();
                electrodomestico.operaciones(listaElectrodomesticos);
                opcion = JOptionPane.showInputDialog(null,"Selecciona el electrodomestico que quieras comprar", 
                        "Elegir",JOptionPane.QUESTION_MESSAGE,null,electrodomesticos, electrodomesticos[0]);
            } 
        } while (opcion != "Salir"); 
    }
    
    
    
}

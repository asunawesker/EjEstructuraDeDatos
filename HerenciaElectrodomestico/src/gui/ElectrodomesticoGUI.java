/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import herenciaelectrodomestico.Electrodomestico;
import herenciaelectrodomestico.Lavadora;
import herenciaelectrodomestico.Television;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author asunawesker
 */
public class ElectrodomesticoGUI {
    /*
        Iniciando los JTextField donde voy a ingresar datos de los electrodomésticos
    */
    protected JTextField precioBase = new JTextField();
    protected JTextField peso = new JTextField();
    protected JTextField consumoEnergetico = new JTextField();
    protected JTextField color = new JTextField();

    public ElectrodomesticoGUI() {
    }
    
    //Menú de electrodoméstico 
    public void menu (ArrayList<herenciaelectrodomestico.Electrodomestico> listaElectrodomesticos) {
                
        Object [] electrodomesticos ={"Valores por default", "Precio base y peso", "Ingresar valores individualmente", "Salir"}; 
        Object [] colores ={"blanco", "negro", "rojo", "azul", "gris"}; 
        
        Object opcion = JOptionPane.showInputDialog(null,"Selecciona el tipo de pago", "Elegir",JOptionPane.QUESTION_MESSAGE,null,electrodomesticos, electrodomesticos[0]);
        
        do {
            if (opcion == "Valores por default"){
                listaElectrodomesticos.add(new herenciaelectrodomestico.Electrodomestico());
                JOptionPane.showMessageDialog(null, "Agregado a la lista de compras");
                opcion = JOptionPane.showInputDialog(null,"Selecciona el tipo de pago", "Elegir",JOptionPane.QUESTION_MESSAGE,null,electrodomesticos, electrodomesticos[0]);
                
            } else if (opcion == "Precio base y peso") {
                                
                Object[] message = {
                    "Precio base:", precioBase,
                    "Peso:", peso,
                };

                int option = JOptionPane.showConfirmDialog(null, message, "Ingresa los datos", JOptionPane.OK_CANCEL_OPTION);
                double double_precioBase =  Double.parseDouble(precioBase.getText());
                double double_peso = Double.parseDouble(peso.getText());
                
                if (option == JOptionPane.OK_OPTION) {
                    listaElectrodomesticos.add(new herenciaelectrodomestico.Electrodomestico(double_precioBase, double_peso));
                    JOptionPane.showMessageDialog(null, "Agregado a la lista de compras");
                } 
                
                opcion = JOptionPane.showInputDialog(null,"Selecciona el tipo de pago", "Elegir",JOptionPane.QUESTION_MESSAGE,null,electrodomesticos, electrodomesticos[0]);
            } else if (opcion == "Ingresar valores individualmente") {
                Object[] message = {
                    "Precio base:", precioBase,
                    "Peso:", peso,
                    "Consumo energetico: \n(A, B, C, D, E, F)", consumoEnergetico,
                    "Color: \n(blanco, negro, rojo, azul, gris)", color,
                };

                int option = JOptionPane.showConfirmDialog(null, message, "Ingresa los datos", JOptionPane.OK_CANCEL_OPTION);
                
                double double_precioBase =  Double.parseDouble(precioBase.getText());
                double double_peso = Double.parseDouble(peso.getText());
                char[] ch_consumo = (consumoEnergetico.toString()).toCharArray();
                char ch_consumoEnergetico = ch_consumo[0];
                String string_color = color.getText(); 
                
                if (option == JOptionPane.OK_OPTION) {
                    listaElectrodomesticos.add(new herenciaelectrodomestico.Electrodomestico(double_precioBase, double_peso, ch_consumoEnergetico, string_color));
                    JOptionPane.showMessageDialog(null, "Agregado a la lista de compras");
                } 
                opcion = JOptionPane.showInputDialog(null,"Selecciona el tipo de pago", "Elegir",JOptionPane.QUESTION_MESSAGE,null,electrodomesticos, electrodomesticos[0]);
            }
            
        } while (opcion != "Salir");
    }
    
    //Costo por electrodoméstico
    public void operaciones (ArrayList<herenciaelectrodomestico.Electrodomestico> listaElectrodomesticos){
        
        //Creamos las variables que usaremos para almacenar la suma de los precios
        
        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;
        
        //Recorremos el array invocando el metodo precioFinal
        for(Electrodomestico electrodomestico : listaElectrodomesticos)  {
            /*
             * Cuando una Television o una Lavadora este en la posicion del array actual,
             * pasara por su clase y por la de electrodomestico, ya que una television es un electrodomestico.
             * Ejecutamos en cada uno su propia version del metodo precioFinal
             */
              if(electrodomestico instanceof Electrodomestico){ 
               /*
                * El operador instanceof sirve para conocer si un objeto es de un tipo determinado. 
                * Por tipo, nos referimos a clase o interfaz (interface)
                */
                  sumaElectrodomesticos+=electrodomestico.precioFinal();
                  //System.out.println("Precio Final Electrodomestico: "+ electrodomestico.precioFinal());
                }
              if(electrodomestico instanceof Lavadora) {
                  sumaLavadoras+=electrodomestico.precioFinal();
                  //System.out.println("Precio Final Lavadora: "+ electrodomestico.precioFinal());
                }
              if(electrodomestico instanceof Television) {
                  sumaTelevisiones+=electrodomestico.precioFinal();
                  //System.out.println("Precio Final Television: "+ electrodomestico.precioFinal());
                }         
          }
        //Mostramos los resultados
        
        String to_print = "La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos + 
                          "\nLa suma del precio de las lavadoras es de "+sumaLavadoras + 
                          "\nLa suma del precio de las televisiones es de "+sumaTelevisiones;   
        
        JOptionPane.showMessageDialog( null,to_print);
    }
}

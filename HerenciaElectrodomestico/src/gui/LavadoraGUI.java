/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author asunawesker
 */
public class LavadoraGUI extends ElectrodomesticoGUI{
    
    //Menú de lavadora
    @Override
    public void menu (ArrayList<herenciaelectrodomestico.Electrodomestico> listaElectrodomesticos) {
        Object [] lavadoras ={"Valores por default","Ingresar precio base y peso","Ingresar carga", "Salir"}; 
        Object opcion = JOptionPane.showInputDialog(null,"Selecciona el tipo de pago", "Elegir",JOptionPane.QUESTION_MESSAGE,null,lavadoras, lavadoras[0]);
               
        do {
            if (opcion == "Valores por default"){
                
                byDefault(listaElectrodomesticos);
                opcion = JOptionPane.showInputDialog(null,"Selecciona un color", "Elegir",JOptionPane.QUESTION_MESSAGE,null,lavadoras, lavadoras[0]);
                
            } else if (opcion == "Ingresar precio base y peso") {
                
                basePrecio(listaElectrodomesticos);
                opcion = JOptionPane.showInputDialog(null,"Selecciona un color", "Elegir",JOptionPane.QUESTION_MESSAGE,null,lavadoras, lavadoras[0]);
                
            } else if (opcion == "Ingresar carga") {
                
                valoresIndividuales(listaElectrodomesticos);
                opcion = JOptionPane.showInputDialog(null,"Selecciona el tipo de pago", "Elegir",JOptionPane.QUESTION_MESSAGE,null,lavadoras, lavadoras[0]);
            }
        } while (opcion != "Salir");
    }
    
    @Override
    protected void byDefault(ArrayList<herenciaelectrodomestico.Electrodomestico> listaElectrodomesticos){
        listaElectrodomesticos.add(new herenciaelectrodomestico.Lavadora());
        JOptionPane.showMessageDialog(null, "Agregado a la lista de compras");
    }
    
    @Override
    protected void basePrecio(ArrayList<herenciaelectrodomestico.Electrodomestico> listaElectrodomesticos){
        
        Object[] message = {
            "Precio base:", precioBase,
            "Peso:", peso,
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Ingresa los datos", JOptionPane.OK_CANCEL_OPTION);

        double double_precioBase =  Double.parseDouble(precioBase.getText());
        double double_peso = Double.parseDouble(peso.getText());

        if (option == JOptionPane.OK_OPTION) {
            listaElectrodomesticos.add(new herenciaelectrodomestico.Lavadora(double_precioBase, double_peso));
            JOptionPane.showMessageDialog(null, "Agregado a la lista de compras");
        }
        
    }
    
    @Override
    public void valoresIndividuales(ArrayList<herenciaelectrodomestico.Electrodomestico> listaElectrodomesticos) {
        JTextField carga = new JTextField();
                
        Object[] message = {
            "Precio base:", precioBase,
            "Peso:", peso,
            "Consumo energetico: \n(A, B, C, D, E, F)", consumoEnergetico,
            "Color: \n(blanco, negro, rojo, azul, gris)", color,
            "Carga: ", carga,
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Ingresa los datos", JOptionPane.OK_CANCEL_OPTION);

        double double_precioBase =  Double.parseDouble(precioBase.getText());
        double double_peso = Double.parseDouble(peso.getText());
        char[] ch_consumo = (consumoEnergetico.toString()).toCharArray();
        char ch_consumoEnergetico = ch_consumo[0];
        String string_color = color.getText();
        int int_carga = Integer.parseInt(carga.getText());

        if (option == JOptionPane.OK_OPTION) {
            listaElectrodomesticos.add(new herenciaelectrodomestico.Lavadora(double_precioBase, double_peso, ch_consumoEnergetico, string_color, int_carga));
            JOptionPane.showMessageDialog(null, "Agregado a la lista de compras");
        } 
    }
}

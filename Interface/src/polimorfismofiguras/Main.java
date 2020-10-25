/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismofiguras;

import gui.GUI;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author asunawesker
 */
public class Main {
    
    public static ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
    
    public static void main(String[] args) {
        
        /**
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(20, (float) 12.5);
        PoligonoRegular poligono = new PoligonoRegular(32, 28, 5);
        
        figuras.add(circulo);
        figuras.add(rectangulo);
        figuras.add(poligono);
                
        System.out.println("Perímetro");
        for (FiguraGeometrica figura : figuras){
            System.out.println(figura.nombre() + " " +figura.perimetro());
        }
        
        System.out.println("\nÁrea");
        for (FiguraGeometrica figura : figuras){
            System.out.println(figura.nombre() + " " + figura.area());
        }
        **/
        
        GUI interfaz = new GUI();
        interfaz.setBounds(0,0,350,230);
        interfaz.setVisible(true);
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

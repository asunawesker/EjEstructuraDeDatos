package gui;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import polimorfismofiguras.FiguraGeometrica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asunawesker
 */
public class Opciones_poligonos extends JFrame{
    private JRadioButton triangulo, cuadrado, poligonoMasCuatro;
    private ButtonGroup bg;
    
    private ArrayList<FiguraGeometrica> figuras;
    
    public Opciones_poligonos() {
        
        setLayout(null);
        
        bg=new ButtonGroup();
        
        triangulo=new JRadioButton("Triangulo");
        triangulo.setBounds(10,20,100,30);
        triangulo.addActionListener((ActionEvent e) -> { 
            FormularioTriangulo triangulo = new FormularioTriangulo();
        });
        add(triangulo);
        bg.add(triangulo);
        
        cuadrado=new JRadioButton("Cuadrado");
        cuadrado.setBounds(10,70,100,30);
        cuadrado.addActionListener((ActionEvent e) -> {
            FormularioCuadrado cuadrado = new FormularioCuadrado();
        });
        add(cuadrado);
        bg.add(cuadrado);
        
        poligonoMasCuatro=new JRadioButton("Poligono de más de cuatro lados");
        poligonoMasCuatro.setBounds(10,120,200,30);    
        poligonoMasCuatro.addActionListener((ActionEvent e) -> {
            FormularioPR_MasCincoLados poligono = new FormularioPR_MasCincoLados();
        });
        add(poligonoMasCuatro);
        bg.add(poligonoMasCuatro);
        
    }

}

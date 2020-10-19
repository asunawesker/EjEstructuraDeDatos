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
public class GUI extends JFrame{
    private JRadioButton circulo, rectangulo, poligonoRegular;
    private ButtonGroup bg;
    
    private ArrayList<FiguraGeometrica> figuras;
    
    public GUI() {
        
        setLayout(null);
        
        bg=new ButtonGroup();
        
        circulo=new JRadioButton("Circulo");
        circulo.setBounds(10,20,100,30);
        circulo.addActionListener((ActionEvent e) -> { 
            FormularioCirculo circulo = new FormularioCirculo();
        });
        add(circulo);
        bg.add(circulo);
        
        rectangulo=new JRadioButton("Rectángulo");
        rectangulo.setBounds(10,70,100,30);
        rectangulo.addActionListener((ActionEvent e) -> {
            FormularioRectangulo rectangulo = new FormularioRectangulo();
        });
        add(rectangulo);
        bg.add(rectangulo);
        
        poligonoRegular=new JRadioButton("Poligono regular");
        poligonoRegular.setBounds(10,120,200,30);    
        poligonoRegular.addActionListener((ActionEvent e) -> {
            FormularioPoligono poligono = new FormularioPoligono();
        });
        add(poligonoRegular);
        bg.add(poligonoRegular);
        
    }

}

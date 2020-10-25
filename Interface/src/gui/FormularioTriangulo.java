/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import polimorfismofiguras.PR_MasCincoLados;
import polimorfismofiguras.TrianguloEquilatero;

/**
 *
 * @author asunawesker
 */
public class FormularioTriangulo {
    Frame frame;
    JPanel paneliz,panelde,panelab,panelar,panelex;
    JLabel lado;
    JTextField text1;
    JButton boton1;
    
    public FormularioTriangulo(){
        initializeElements();
        inituializeMethods();
    }
    
    private void initializeElements() {
        frame = new JFrame();
        paneliz  = new JPanel();
        panelde  = new JPanel();
        panelab  = new JPanel();
        panelar  = new JPanel();
        panelex = new JPanel();
        lado = new JLabel();
        text1 = new JTextField();
        boton1 = new JButton();
    }
    
    private void inituializeMethods(){
        createFrame();
        addText();
        addElements();
        addPanels();
    }
     
    private void createFrame() {
        frame.setTitle("Formulario");
        frame.setLayout(new FlowLayout());      
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(300,170);
    }
    
    private void addText() {
        lado.setText("Medida lado: ");
        boton1.setText("Aceptar");
        boton1.addActionListener((ActionEvent e) -> {
            String lado = text1.getText();

            float ladoFloat = (float) Double.parseDouble(lado);

            TrianguloEquilatero triangulo = new TrianguloEquilatero(ladoFloat);
            
            String message = "Área: " + triangulo.area() + "\nPerímetro: " + triangulo.perimetro();
            
            JOptionPane.showMessageDialog(null, message);
        });
    }
 
    private void addElements() {
        paneliz.setLayout(new GridLayout(3,0));
        paneliz.add(lado);
         
        panelde.setLayout(new GridLayout(3,0));
        panelde.add(text1);
         
        panelar.setLayout(new GridLayout(1,1));
        panelar.setPreferredSize(new Dimension(100,75));
        panelar.add(paneliz);
        panelar.add(panelde);
                 
        panelab.setLayout(new FlowLayout());
        panelab.setPreferredSize(new Dimension(200,25));
        panelab.add(boton1);
         
        panelex.setLayout(new GridLayout(2,0));
        panelex.add(panelar);
        panelex.add(panelab);
    }
    
    private void addPanels() {
        frame.add(panelex);
    }
}

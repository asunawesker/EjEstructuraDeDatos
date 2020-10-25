package gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import polimorfismofiguras.Circulo;
import polimorfismofiguras.FiguraGeometrica;

/**
 *
 * @author asunawesker
 */
public class FormularioCirculo {
    Frame frame;
    JPanel paneliz,panelde,panelab,panelar,panelex;
    JLabel radio;
    JTextField text1;
    JButton boton1;
    
    public FormularioCirculo (){
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
        radio = new JLabel();
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
        radio.setText("Radio:");
        boton1.setText("Aceptar");
        boton1.addActionListener((ActionEvent e) -> {
            String radio = text1.getText();

            float radioFloat = (float) Double.parseDouble(radio);

            Circulo circulo = new Circulo(radioFloat);
            
            String message = "Área: " + circulo.area() + "\nPerímetro: " + circulo.perimetro();
            
            JOptionPane.showMessageDialog(null, message);
        });
    }
 
    private void addElements() {
        paneliz.setLayout(new GridLayout(1,0));
        paneliz.add(radio);
         
        panelde.setLayout(new GridLayout(1,0));
        panelde.add(text1);
         
        panelar.setLayout(new GridLayout(1,1));
        panelar.setPreferredSize(new Dimension(50,25));
        panelar.add(paneliz);
        panelar.add(panelde);
                 
        panelab.setLayout(new FlowLayout());
        panelab.setPreferredSize(new Dimension(100,25));
        panelab.add(boton1);
         
        panelex.setLayout(new GridLayout(2,0));
        panelex.add(panelar);
        panelex.add(panelab);
    }
    
    private void addPanels() {
        frame.add(panelex);
    }
}

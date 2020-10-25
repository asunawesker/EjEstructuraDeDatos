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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import polimorfismofiguras.PR_MasCincoLados;
import polimorfismofiguras.PoligonoRegular;

/**
 *
 * @author asunawesker
 */
public class FormularioPoligono {
    Frame frame;
    JPanel paneliz,panelde,panelab,panelar,panelex;
    JLabel lado, apotema, noLados;
    JTextField text1,text2,text3;
    JButton boton1;
    
    public FormularioPoligono(){
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
        apotema = new JLabel();
        noLados = new JLabel();
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
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
        apotema.setText("Apotema: ");
        noLados.setText("No. Lados");
        boton1.setText("Aceptar");
        boton1.addActionListener((ActionEvent e) -> {
            String lado = text1.getText();
            String apotema = text1.getText();
            String lados = text1.getText();

            float ladoFloat = (float) Double.parseDouble(lado);
            float apotemaFloat = (float) Double.parseDouble(apotema);
            int ladosInt = Integer.parseInt(lados);

            PR_MasCincoLados poligono = new PR_MasCincoLados(ladoFloat, ladosInt, apotemaFloat);
            
            String message = "Área: " + poligono.area() + "\nPerímetro: " + poligono.perimetro();
            
            JOptionPane.showMessageDialog(null, message);
        });
    }
 
    private void addElements() {
        paneliz.setLayout(new GridLayout(3,0));
        paneliz.add(lado);
        paneliz.add(apotema);
        paneliz.add(noLados);
         
        panelde.setLayout(new GridLayout(3,0));
        panelde.add(text1);
        panelde.add(text2);
        panelde.add(text3);
         
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

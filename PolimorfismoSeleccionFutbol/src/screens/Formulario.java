/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import polimorfismo.SeleccionFutbol;
 
public class Formulario {
 
    JFrame frame;
    JPanel paneliz,panelde,panelab,panelar,panelex;
    JLabel nombre,apellidos,id,edad;
    JTextField text1,text2,text3,text4;
    JButton boton1;
    private ArrayList<SeleccionFutbol> integrantes;
    
    public Formulario (ArrayList<SeleccionFutbol> integrantes){
        this.integrantes = integrantes;
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
        nombre = new JLabel();
        apellidos = new JLabel();
        id = new JLabel();
        edad = new JLabel();
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();
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
        id.setText("ID");
        nombre.setText("Nombre");
        apellidos.setText("Apellidos");        
        edad.setText("Edad");
        boton1.setText("Aceptar");
        boton1.addActionListener((ActionEvent e) -> {
            String id1 = text1.getText();
            String nombre1 = text2.getText();
            String apellidos1 = text3.getText();
            String edad1 = text4.getText();
            int idInt = Integer.parseInt(id1);
            int edadInt = Integer.parseInt(edad1);
            integrantes.add(new SeleccionFutbol(idInt, nombre1, apellidos1, edadInt) {
                @Override
                public void entrenamiento() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            });
            JOptionPane.showMessageDialog(null, "Integrante agregado");
        });
    }
 
    private void addElements() {
        paneliz.setLayout(new GridLayout(4,0));
        paneliz.add(id);
        paneliz.add(nombre);
        paneliz.add(apellidos);        
        paneliz.add(edad);
         
        panelde.setLayout(new GridLayout(4,0));
        panelde.add(text1);
        panelde.add(text2);
        panelde.add(text3);
        panelde.add(text4);
         
        panelar.setLayout(new GridLayout(1,1));
        panelar.setPreferredSize(new Dimension(250,100));
        panelar.add(paneliz);
        panelar.add(panelde);
                 
        panelab.setLayout(new FlowLayout());
        panelab.setPreferredSize(new Dimension(200,50));
        panelab.add(boton1);
         
        panelex.setLayout(new GridLayout(2,0));
        panelex.add(panelar);
        panelex.add(panelab);
    }
    
    private void addPanels() {
        frame.add(panelex);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import polimorfismo.Entrenador;
import polimorfismo.SeleccionFutbol;

/**
 *
 * @author asunawesker
 */
public class FormularioFutbolista {
    JFrame frame;
    JPanel paneliz,panelde,panelab,panelar,panelex;
    JLabel nombre,apellidos,id,edad, idFederacion;
    JTextField text1,text2,text3,text4, text5;
    JButton boton1;
    private ArrayList<SeleccionFutbol> integrantes;
    
    public FormularioFutbolista (ArrayList<SeleccionFutbol> integrantes){
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
        idFederacion = new JLabel();
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();
        text5 = new JTextField();
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
        idFederacion.setText("ID Federación");
        boton1.setText("Aceptar");
        boton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String id = text1.getText();
                String nombre = text2.getText();
                String apellidos = text3.getText();
                String edad = text4.getText();
                String idFederacion = text5.getText();
                
                int idInt=Integer.parseInt(id);
                int edadInt=Integer.parseInt(edad);
                
                integrantes.add(new Entrenador(idInt, nombre, apellidos, edadInt, idFederacion));
                
                JOptionPane.showMessageDialog(null, "Entrenador agreagado");
            }

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
    
    public void actionBotton(ActionEvent e) {
        
        if (e.getSource() == boton1) {
            JOptionPane.showMessageDialog(null, "Agregado");
        }
        
    }
}

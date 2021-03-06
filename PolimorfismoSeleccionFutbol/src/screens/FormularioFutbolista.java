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
import polimorfismo.Futbolista;
import polimorfismo.SeleccionFutbol;

/**
 *
 * @author asunawesker
 */
public class FormularioFutbolista {
    JFrame frame;
    JPanel paneliz,panelde,panelab,panelar,panelex;
    JLabel nombre,apellidos,id,edad, dorsal, demarcacion;
    JTextField text1,text2,text3,text4, text5, text6;
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
        dorsal = new JLabel();
        demarcacion = new JLabel();
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();
        text5 = new JTextField();
        text6 = new JTextField();
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
        dorsal.setText("Dorsal");
        demarcacion.setText("Posición");
        boton1.setText("Aceptar");
        
        boton1.addActionListener((ActionEvent e) -> {
            String id1 = text1.getText();
            String nombre1 = text2.getText();
            String apellidos1 = text3.getText();
            String edad1 = text4.getText();
            String dorsal = text5.getText();
            String demarcacion = text6.getText();
            
            int idInt = Integer.parseInt(id1);
            int edadInt = Integer.parseInt(edad1);
            int dorsalInt = Integer.parseInt(dorsal);
            
            integrantes.add(new Futbolista(idInt, nombre1, apellidos1, edadInt, dorsalInt,demarcacion));
            
            JOptionPane.showMessageDialog(null, "Futbolista agreagado");
        });
    }
 
    private void addElements() {
        paneliz.setLayout(new GridLayout(6,0));
        paneliz.add(id);
        paneliz.add(nombre);
        paneliz.add(apellidos);        
        paneliz.add(edad);
        paneliz.add(dorsal);
        paneliz.add(demarcacion);
         
        panelde.setLayout(new GridLayout(6,0));
        panelde.add(text1);
        panelde.add(text2);
        panelde.add(text3);
        panelde.add(text4);
        panelde.add(text5);
        panelde.add(text6);
         
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

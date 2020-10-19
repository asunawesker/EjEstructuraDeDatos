/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import polimorfismo.SeleccionFutbol;

public class Home extends JFrame implements ActionListener{
    
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<>();

    /* Definimos variables. */
    private JMenuBar menuBar;
    private JMenu menuEntrenador, menuFutbolista, menuMasajista, menuSeleccionFutbol; 
    private JMenuItem menuSFVer, menuSFRegistrar;
    private JMenuItem menuEVer;
    private JMenuItem menuFVer;
    private JMenuItem menuMVer;

    public Home () {
        createSideMenu();
        createSubMenus();
    }
    
    private void createSideMenu() {
        setLayout(null);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menuSeleccionFutbol = new JMenu("Selección Futbol");
        menuBar.add(menuSeleccionFutbol);

        menuEntrenador = new JMenu("Entrenadores");
        menuBar.add(menuEntrenador);
        
        menuFutbolista = new JMenu("Futbolistas");
        menuBar.add(menuFutbolista);
        
        menuMasajista = new JMenu("Masajista");
        menuBar.add(menuMasajista);
    }
    
    private void createSubMenus(){
        // Seleccion futbol
        menuSFRegistrar = new JMenuItem("Registrar integrante");
        menuSeleccionFutbol.add(menuSFRegistrar);
        menuSFRegistrar.addActionListener(this);
        
        menuSFVer = new JMenuItem("Ver integrantes registrados");
        menuSeleccionFutbol.add(menuSFVer);
        menuSFVer.addActionListener(this);
                        
        //Entrenador
        menuEVer = new JMenuItem("Ver");
        menuEntrenador.add(menuEVer);
        menuEVer.addActionListener(this);
        
        //Futbolista
        menuFVer = new JMenuItem("Ver"); 
        menuFutbolista.add(menuFVer);
        menuFVer.addActionListener(this);
        
        menuMVer = new JMenuItem("Ver");
        menuMasajista.add(menuMVer);
        menuMVer.addActionListener(this);
    }

        @Override
	public void actionPerformed(ActionEvent e) {
            
            actionsSF(e);
            actionsEntrenador(e);
            actionsFutbolista(e);
            actionsMasajista(e);
            
	}
        
        private void actionsSF(ActionEvent e) {            
            if (e.getSource() == menuSFRegistrar) {
                
                Opciones opciones = new Opciones(integrantes);
                opciones.setBounds(0,0,350,230);
                opciones.setVisible(true);
                                
            }
            if (e.getSource() == menuSFVer) {
                                
                for(SeleccionFutbol integrante: integrantes){
                   integrante.datos();
                }
                
                
            }
        }
        
        private void actionsEntrenador(ActionEvent e) {
            if (e.getSource() == menuEVer) {
                JOptionPane.showMessageDialog(null, "Entrenador Concentrar");
            }
        }
        
        private void actionsFutbolista(ActionEvent e) {
            if (e.getSource() == menuFVer) {
                JOptionPane.showMessageDialog(null, "Futbolista Concentrar");
            }
        }
        
        private void actionsMasajista(ActionEvent e){            
            if (e.getSource() == menuMVer) {
                JOptionPane.showMessageDialog(null, "Masajista Concentrar");
            }
        }
}
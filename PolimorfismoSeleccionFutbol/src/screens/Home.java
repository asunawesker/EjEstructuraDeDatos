/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import polimorfismo.SeleccionFutbol;

public class Home extends JFrame implements ActionListener{
    
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<>();

    /* Definimos variables. */
    private JMenuBar menuBar;
    private JMenu menuEntrenador, menuFutbolista, menuMasajista, menuSeleccionFutbol; 
    private JMenuItem menuSFVer, menuSFRegistrar;
    private JMenuItem menuEConcentrar, menuEViajar, menuEDigPartido, menuEDigEntrenamiento;
    private JMenuItem menuFConcentrar, menuFViajar, menuFJugPartido, menuFJugEntrenamiento;
    private JMenuItem menuMConcentrar, menuMViajar, menuMMasajes;

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
        menuEConcentrar = new JMenuItem("Concentrar");
        menuEntrenador.add(menuEConcentrar);
        menuEConcentrar.addActionListener(this);

        menuEViajar = new JMenuItem("Viajar");
        menuEntrenador.add(menuEViajar);
        menuEViajar.addActionListener(this);

        menuEDigPartido = new JMenuItem("Dirigir Partido");
        menuEntrenador.add(menuEDigPartido);
        menuEDigPartido.addActionListener(this);
        
        menuEDigEntrenamiento = new JMenuItem("Dirigir entrenamiento");
        menuEntrenador.add(menuEDigEntrenamiento);
        menuEDigEntrenamiento.addActionListener(this);
        
        //Futbolista
        menuFConcentrar = new JMenuItem("Concentrar"); 
        menuFutbolista.add(menuFConcentrar);
        menuFConcentrar.addActionListener(this);
        
        menuFViajar = new JMenuItem("Viajar");
        menuFutbolista.add(menuFViajar);
        menuFViajar.addActionListener(this);
        
        menuFJugPartido = new JMenuItem("Jugar Partido");
        menuFutbolista.add(menuFJugPartido);
        menuFJugPartido.addActionListener(this);
        
        menuFJugEntrenamiento = new JMenuItem("Jugar entrenamiento");
        menuFutbolista.add(menuFJugEntrenamiento);
        menuFJugEntrenamiento.addActionListener(this);
        
        menuMConcentrar = new JMenuItem("Concentrar");
        menuMasajista.add(menuMConcentrar);
        menuMConcentrar.addActionListener(this);
        
        menuMViajar = new JMenuItem("Viajar");
        menuMasajista.add(menuMViajar);
        menuMViajar.addActionListener(this);
        
        menuMMasajes = new JMenuItem("Masaje");
        menuMasajista.add(menuMMasajes);
        menuMMasajes.addActionListener(this);
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
                
                Opciones opciones = new Opciones();
                opciones.setBounds(0,0,350,230);
                opciones.setVisible(true);
                                
            }
            if (e.getSource() == menuSFVer) {
                
            }
        }
        
        private void actionsEntrenador(ActionEvent e) {
            if (e.getSource() == menuEConcentrar) {
                JOptionPane.showMessageDialog(null, "Entrenador Concentrar");
            }
            if (e.getSource() == menuEViajar) {
                JOptionPane.showMessageDialog(null, "Entrenador Viajar");
            }
            if (e.getSource() == menuEDigPartido) {
                JOptionPane.showMessageDialog(null, "Entrenador dirigir partido");
            }
            if (e.getSource() == menuEDigEntrenamiento) {
                JOptionPane.showMessageDialog(null, "Entrenador dirigir entrenamiento");
            }
        }
        
        private void actionsFutbolista(ActionEvent e) {
            if (e.getSource() == menuFConcentrar) {
                JOptionPane.showMessageDialog(null, "Futbolista Concentrar");
            }
            if (e.getSource() == menuFViajar) {
                JOptionPane.showMessageDialog(null, "Futbolista Viajar");
            }
            if (e.getSource() == menuFJugPartido) {
                JOptionPane.showMessageDialog(null, "Futbolista jugar partido");
            }
            if (e.getSource() == menuFJugEntrenamiento) {
                JOptionPane.showMessageDialog(null, "Futbolista jugar entrenamiento");
            }
        }
        
        private void actionsMasajista(ActionEvent e){            
            if (e.getSource() == menuMConcentrar) {
                JOptionPane.showMessageDialog(null, "Masajista Concentrar");
            }
            if (e.getSource() == menuMViajar) {
                JOptionPane.showMessageDialog(null, "Masajista Viajar");
            }
            if (e.getSource() == menuMMasajes) {
                JOptionPane.showMessageDialog(null, "Masaje masaje");
            }
        }
}
package screens;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.*;
import polimorfismo.SeleccionFutbol;
/**
 *
 * @author asunawesker
 */
public class Opciones extends JFrame {

    private final JRadioButton entrenador;
    private JRadioButton futbolista, masajista, general;
    private ButtonGroup bg;
    public ArrayList<SeleccionFutbol> integrantes = new ArrayList<>();
    
    public Opciones(ArrayList<SeleccionFutbol> integrantes) {
        
        this.integrantes = integrantes;
        
        setLayout(null);
        
        bg=new ButtonGroup();
        
        general=new JRadioButton("General");
        general.setBounds(10,20,100,30);
        general.addActionListener((ActionEvent e) -> {
            Formulario form = new Formulario(integrantes);                       
        });
        add(general);
        bg.add(general);
        
        entrenador=new JRadioButton("Entrenador");
        entrenador.setBounds(10,70,100,30);
        entrenador.addActionListener((ActionEvent e) -> {
            FormularioEntrenador formEntrenador = new FormularioEntrenador(integrantes);
        });
        add(entrenador);
        bg.add(entrenador);
        
        futbolista=new JRadioButton("Futbolista");
        futbolista.setBounds(10,120,100,30);    
        futbolista.addActionListener((ActionEvent e) -> {
            FormularioFutbolista formFutbolista = new FormularioFutbolista(integrantes);
        });
        add(futbolista);
        bg.add(futbolista);
        
        masajista=new JRadioButton("Masajista");
        masajista.setBounds(10,170,100,30);  
        masajista.addActionListener((ActionEvent e) -> {
            FormularioMasajista formMasajista = new FormularioMasajista(integrantes);
        });
        add(masajista);
        bg.add(masajista);  
    }

}

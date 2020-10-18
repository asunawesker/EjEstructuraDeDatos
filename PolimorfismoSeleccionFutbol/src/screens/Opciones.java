package screens;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import javax.swing.event.*;
import static screens.Home.integrantes;
/**
 *
 * @author asunawesker
 */
public class Opciones extends JFrame implements ChangeListener{
    private JRadioButton entrenador, futbolista, masajista, general;
    private ButtonGroup bg;
    
    public Opciones() {
        
        setLayout(null);
        
        bg=new ButtonGroup();
        
        general=new JRadioButton("General");
        general.setBounds(10,20,100,30);
        general.addChangeListener(this);
        add(general);
        bg.add(general);
        
        entrenador=new JRadioButton("Entrenador");
        entrenador.setBounds(10,70,100,30);
        entrenador.addChangeListener(this);
        add(entrenador);
        bg.add(entrenador);
        
        futbolista=new JRadioButton("Futbolista");
        futbolista.setBounds(10,120,100,30);
        futbolista.addChangeListener(this);        
        add(futbolista);
        bg.add(futbolista);
        
        masajista=new JRadioButton("Masajista");
        masajista.setBounds(10,170,100,30);
        masajista.addChangeListener(this);        
        add(masajista);
        bg.add(masajista);  
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (general.isSelected()) {
            Formulario fSF;
            fSF = new Formulario(integrantes);
        }
        if (entrenador.isSelected()) {
            FormularioEntrenador fE;
            fE = new FormularioEntrenador(integrantes);
        }
        if (futbolista.isSelected()) {
            
        }
        if (masajista.isSelected()) {
            setSize(1024,768);
        } 
    }
}

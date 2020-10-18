/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import screens.Home;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author asunawesker
 */
public class Main {

    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<>();
    
    public static void main(String[] args) {
        
        /**
        
        Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
        Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        Masajista raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        // CONCENTRACION
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
            integrante.concentrarse();
        }

        // VIAJE
        System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
            integrante.viajar();
        }
        
        // ENTRENAMIENTO
        System.out.println("\nEntrenamiento: Solamente el entrenador y el futbolista tiene metodos para entrenar:");
        System.out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");
        delBosque.dirigirEntrenamiento();
        System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+" -> ");
        iniesta.entrenar();

        // MASAJE
        System.out.println("\nMasaje: Solo el masajista tiene el método para dar un masaje:");
        System.out.print(raulMartinez.getNombre()+" "+raulMartinez.getApellidos()+" -> ");
        raulMartinez.darMasaje();

        // PARTIDO DE FUTBOL
        System.out.println("\nPartido de Fútbol: Solamente el entrenador y el futbolista tiene metodos para el partido de fútbol:");
        System.out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");
        delBosque.dirigirPartido();
        System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+" -> ");
        iniesta.jugarPartido();  
        **/
        
        Home formulario=new Home();
        formulario.setBounds(0,0,300,200);
        formulario.setVisible(true);
        formulario.setSize(700,500);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

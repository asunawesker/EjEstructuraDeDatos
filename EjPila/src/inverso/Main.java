package inverso;

import java.util.Random;
import javax.swing.JOptionPane;
import lista.Lista;
import lista.Nodo;

/**
 *
 * @author asunawesker
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int listaLength;
        int numbers;
        Lista lista;
        Random random;
        
        lista = new Lista();
        random = new Random();
        
        listaLength = random.nextInt(10);
        
        for (int i=0; i<listaLength; i++){
            numbers = random.nextInt(10);
            lista.insertar_frente(numbers);
        }
        
        visualizar(lista);
        
    }
    
    public static void visualizar(Lista lista) {
        String datos="";
        if (!lista.ListaVacia()) {

            Nodo n = lista.cabeza;
            n = lista.cabeza;
            while (n != null) {
                
                datos= datos + n.getDato() + " ";
                n = n.getEnlace();
            }
            JOptionPane.showMessageDialog(null, "Elementos de la lista: \n" + datos);
        }
        else
           JOptionPane.showMessageDialog(null, "Lista Vacia."); 
    }
    
}

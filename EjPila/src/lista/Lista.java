package lista;

import javax.swing.JOptionPane;

public class Lista {

    public Nodo cabeza;
    public Nodo anterior;

    public Lista() {
        cabeza = null;
    }

    public Lista insertar_final(Object entrada) {
        //nodo nuevo=new Nodo(entrada,null);
        Nodo nuevo = new Nodo();
        nuevo.setDato(entrada);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            anterior.setEnlance(nuevo);
        }

        anterior = nuevo;
        return this;
    }

    public Lista insertar_frente(Object entrada) {
        Nodo nuevo = new Nodo(entrada, null);
        nuevo.setEnlance(cabeza);
        cabeza = nuevo;
        return this;
    }

    public void visualizar() {
        String datos="";
        if (!ListaVacia()) {
            Nodo n = cabeza;
            n = cabeza;
            while (n != null) {
                
                datos= datos + n.getDato() + " ";
                n = n.getEnlace();
            }
            JOptionPane.showMessageDialog(null, "Elementos de la lista: \n" + datos);
        }
        else
           JOptionPane.showMessageDialog(null, "Lista Vacia."); 
    }

    public void visualizar(Object dato) {
        boolean bandera = false;
        if (!ListaVacia()) {
            Nodo n = cabeza;
            while (n != null && bandera == false) {
                if (n.getDato() == dato) {
                    JOptionPane.showMessageDialog(null, "Dato " + n.getDato() + " encontrado en la lista.");
                    bandera = true;
                }
                n = n.getEnlace();
                if(n==null && bandera==false)
                    JOptionPane.showMessageDialog(null, "Dato no encontrado.");
            }
        }
        else
           JOptionPane.showMessageDialog(null, "Lista Vacia."); 
    }

    public boolean ListaVacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }
}

package listaenlazadagenerica;

import javax.swing.JOptionPane;

class lista <T> {

    private nodo cabeza;
    private nodo anterior;

    public lista() {
        cabeza = null;
    }

    public lista insertar_final(T entrada) {
        //nodo nuevo=new nodo(entrada,null);
        nodo nuevo = new nodo();
        nuevo.setDato(entrada);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            anterior.setEnlance(nuevo);
        }

        anterior = nuevo;
        return this;
    }

    public lista insertar_frente(T entrada) {
        nodo nuevo = new nodo(entrada, null);
        nuevo.setEnlance(cabeza);
        cabeza = nuevo;
        return this;
    }

    public void visualizar() {
        String datos="";
        if (!ListaVacia()) {
            nodo n = cabeza;
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

    public void visualizar(T dato) {
        boolean bandera = false;
        if (!ListaVacia()) {
            nodo n = cabeza;
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

    private boolean ListaVacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }
}

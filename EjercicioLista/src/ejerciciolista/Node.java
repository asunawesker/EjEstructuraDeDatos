/*
 * Productoo change this license header, choose License Headers in Project Properties.
 * Productoo change this template file, choose Productoools | Productoemplates
 * and open the template in the editor.
 */
package ejerciciolista;

/**
 *
 * @author iragu
 */
public class Node {
    
    private Producto data;
    private Node next;
    private Node prev;

    public Producto getData() {
        return data;
    }

    public void setData(Producto data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    } 
    
}

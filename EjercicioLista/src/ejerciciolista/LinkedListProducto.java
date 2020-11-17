/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolista;

/**
 *
 * @author iragu
 */
public class LinkedListProducto{
    public Node head;
    public Node tail;
    public int size;
    
    public void addHead(Producto data) {
        Node newNode = new Node();
        
        newNode.setData(data);
        newNode.setNext(head);
        newNode.setPrev(null);
        
        if(head!=null)
            head.setPrev(newNode);
        head = newNode;
        if(tail==null)
            tail=newNode;
        
        size++;        
    }
    
    public void addTail(Producto data) {
        Node newNode = new Node();
        
        newNode.setData(data);
        newNode.setNext(null);
        newNode.setPrev(tail);
        
        if(tail!=null)
            tail.setNext(newNode);
        
        tail = newNode;
        
        if(head==null)
            head=newNode;
        
        size++;        
    }
    
    public Node deleteFirst() {
        if (size == 0) 
            throw new RuntimeException("Lista vacía");
        
        Node temp = head;
        head = head.getNext();
        head.setPrev(null); 
        
        size--;
        
        return temp;
    }
    
    public Node deleteLast() {
        Node temp = tail;
        tail = tail.getPrev();
        tail.setNext(null);
        
        size--;
        
        return temp;
    }
    
    public void deleteAnyone(Node anyone) {
        Node temp = head;
        
        while (temp.getNext() != null && temp.getData() != anyone.getData()) {
            temp = temp.getNext();
        }
        
        if (temp.getNext() != null)
            temp.getNext().getNext().setPrev(temp);
        
        temp.setNext(temp.getNext().getNext());
    }
    
    public Node deleteAll(LinkedListProducto list) {
        if (size == 0) 
            throw new RuntimeException("Lista vacía");
        
        Node temp = head;
        
        for (int i=0; i<list.size; i++){
            head = head.getNext();
            head.setPrev(null); 

            size--;
        }
                
        return temp;
    }
    
    public void printLinkedListHeadToTail() {
        System.out.println("Desde inicio a fin");
        Node current = head;
        
        while (current != null) {
            System.out.println("");
            System.out.print(current.getData().nombre);
            System.out.print(" -> Cantidad: "+current.getData().cantidad);
            System.out.print(" Precio: "+current.getData().precio);
            System.out.print(" Total: "+current.getData().total);
            current = current.getNext();
        }        
        System.out.println("\n");
    }
    
    public void printLinkedListTailToHead() {
        System.out.println("Desde fin a inicio");
        Node current = tail;
        
        while (current != null) {
            System.out.println("");
            System.out.print(current.getData().nombre);
            System.out.print(" -> Cantidad: "+current.getData().cantidad);
            System.out.print(" Precio: "+current.getData().precio);
            System.out.print(" Total: "+current.getData().total);
            current = current.getNext();
        }
        
        System.out.println();
    }
    
    public Object[][] matrix(LinkedListProducto list) {
        int i = 0;
        Object matriz [][] = new Object [list.size][4];
        Node current = head;
        
        while(current != null){
            matriz[i][0] = current.getData().nombre;
            matriz[i][1] = current.getData().cantidad;
            matriz[i][2] = current.getData().precio;
            matriz[i][3] = current.getData().total;
            
            current = current.getNext();
            
            i++;
        }
        
        return matriz;
    }
    
    public int totalCost(){
        int total = 0;
        Node current = head;
        
        while (current != null) {
            total += current.getData().total;
            current = current.getNext();
        }        
        
        return total;
    }
}

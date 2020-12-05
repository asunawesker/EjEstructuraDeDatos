/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author iragu
 */
public class LinkedList <T> {
    private Node head;
    private Node tail;
    private int size; 

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addHead(int data) {
        Node node = new Node(data);
        
        node.setNextNode(head);
        node.setPrevNode(null);
        
        if(head!=null)
            head.setPrevNode(node);
        head = node;
        if(tail==null)
            tail=node;
        size++;     
    }
    
    public void addTail(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node currentNode = head;
            while(currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(node);
        }
        size++;
    }
    
    public Node deleteFirst() {
        if (size == 0) 
            throw new RuntimeException("Lista vacía");
        
        Node temp = head;
        head = head.getNextNode();
        head.setPrevNode(null); 
        
        size--;
        
        return temp;
    }
    
    public Node deleteLast() {
        Node temp = tail;
        tail = tail.getPrevNode();
        tail.setNextNode(null);
        
        size--;
        
        return temp;
    }

    public void sort() {
        if (size > 1) {
            boolean wasChanged = true;
            while( wasChanged ) {
                Node current = head;
                Node previous = null;
                Node next = head.getNextNode();
                wasChanged = false;
                while ( next != null ) {
                    if ( current.getData() > next.getData() ) {
                        wasChanged = true;
                        if ( previous != null ) {
                            Node sig = next.getNextNode();

                            previous.setNextNode(next);
                            next.setNextNode(current);
                            current.setNextNode(sig);
                        } else {
                            Node sig = next.getNextNode();

                            head = next;
                            next.setNextNode(current);
                            current.setNextNode(sig);
                        }

                        previous = next;
                        next = current.getNextNode();
                    } else { 
                        previous = current;
                        current = next;
                        next = next.getNextNode();
                    }
                } 
            } 
        }
    }

    public int listSize() {     
        return size;
    }
    
    public int search(int pos) {
        int dato = 0;
        int cont=0;
        Node aux=head;
        if (!isEmpty()) {
            while(aux!=null){
                if (pos == cont){
                    dato = aux.getData();
                }                
                aux=aux.getNextNode();
                cont++;
            }
        }    
        return dato;
    }
    
    public void printData() {
        Node currentNode = head;
        while(currentNode != null) {
            int data = currentNode.getData();
            System.out.println(data);
            currentNode = currentNode.getNextNode();
        }
    }


    public boolean isEmpty() {
        return size == 0;
    }
}

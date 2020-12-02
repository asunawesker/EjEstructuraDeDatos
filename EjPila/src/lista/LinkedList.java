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
    private  Node head;
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

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node currentNode = head;
            while(currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = node;
        }
        size++;     
    }

    public void sort() {
        if (size > 1) {
            boolean wasChanged = true;
            while( wasChanged ) {
                Node current = head;
                Node previous = null;
                Node next = head.nextNode;
                wasChanged = false;
                while ( next != null ) {
                    if ( current.data > next.data ) {
                        wasChanged = true;
                        if ( previous != null ) {
                            Node sig = next.nextNode;

                            previous.nextNode = next;
                            next.nextNode = current;
                            current.nextNode = sig;
                        } else {
                            Node sig = next.nextNode;

                            head = next;
                            next.nextNode = current;
                            current.nextNode = sig;
                        }

                        previous = next;
                        next = current.nextNode;
                    } else { 
                        previous = current;
                        current = next;
                        next = next.nextNode;
                    }
                } 
            } 
        }
    }

    public int listSize() {     
        return size;
    }

    public void printData() {
        Node currentNode = head;
        while(currentNode != null) {
            int data = currentNode.getData();
            System.out.println(data);
            currentNode = currentNode.nextNode;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

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
public class Node {
    
    int data; 
    Node nextNode;

    public Node(int data) {
        this.data = data;
        this.nextNode = null;       
    }

    public int getData() {
        return this.data;
    }

    public Node getNextNode() {
        return nextNode;
    }
    
}

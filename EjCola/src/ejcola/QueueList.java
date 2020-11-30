/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcola;

/**
 *
 * @author adolfoparada
 */
public class QueueList <T> {

    public Node<T> head;
    public Node<T> tail;
  

    public QueueList() {
       head=null;
    }
    
  
    public boolean isEmpty() {
      return head==null;
    }
    
    public void enqueue(T t) {
        Node<T> nuevo = new Node<>(t);
        
        nuevo.setLink(head);
        head = nuevo;
    }
    
    public Object dequeue() {
        Object aux;
        if (isEmpty())
            return null;
        aux = head.getLink();
        head = head.getLink();
        
        return aux;
    }
    
    public T poll(int pos){
        T dato=null;
        int cont=0;
        Node<T> aux=head;
        if (!isEmpty()) {
          if(pos<0 || pos>=listLength()){
            dato=null;
           }else{
            while(aux!=null){
                if (pos == cont){
                    dato=aux.getDato();
                }                
                aux=aux.getLink();
                cont++;
            }
          }
        }    
        return dato;
    }
    

    public int listLength(){
        int i=0;
        if (!isEmpty()) {
            Node<T> aux = head;
            while (aux!=null) {          
                i++;
                aux = aux.getLink();
            }
        } 
        return i;
    }
}
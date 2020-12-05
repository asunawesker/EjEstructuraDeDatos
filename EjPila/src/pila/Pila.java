/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

/**
 *
 * @author asunawesker
 */
public class Pila <T> {
    public Node<T> head;
    private Node<T> previous;
  

    public Pila() {
       head=null;
    }
    
  
    public boolean isEmpty() {
      return head==null;
    }
    
    public Pila push(T t) {
        Node<T> nuevo = new Node<>();
        nuevo.setData(t);

        if (isEmpty()) {
            head = nuevo;
        } else {
            previous.setLink(nuevo);
        }

        previous = nuevo;
        
        return this;
    }   
    
    public void pop(){
        if (!isEmpty()) {
            head = head.getLink(); 
        }
    }
    
    public T peek() throws Exception{
        if(!isEmpty()){
            return (T) head.getDato();
        } else {
            throw new Exception("Stack is empty.");
        }
    }

    public T search(int pos){
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

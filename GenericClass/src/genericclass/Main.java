/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclass;

/**
 *
 * @author asunawesker
 */
public class Main {
    
    public static void main (String[] args) {
                
        Box<Integer> integerBox = new Box<Integer>();
        
        integerBox.set(10);
        
        integerBox.inspect(15);
        
        
        Pair<Integer, String> p1 = new OrderedPair<>(1, "apple");
        Pair<Integer, String> p2 = new OrderedPair<>(1, "orange");
        boolean same = Method.compare(p1, p2);
        System.out.println(same);
        
        //integerBox.set(new Integer(10));
        //integerBox.inspect("some text"); // error: this is still String!
        
    } 

}

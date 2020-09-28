/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author asunawesker
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        ArrayList <Character> chars;
        Iterator <Character> itr; 
        String sentence = "";
        String originalSentence;
        String letter;
        
        System.out.println("Enter a sentence: ");        
        sentence += sc.nextLine();
        originalSentence = sentence;
        
        chars = new ArrayList<>();
        for (char c : sentence.toCharArray()) {
            chars.add(c);
        }
        
        System.out.println("\nEnter the letter you want to remove: ");       
        letter = sc.next();
        
        chars.remove(sentence.indexOf(letter));
        
        System.out.println("\nOriginal sentence: \n"+originalSentence);
        
        System.out.println("\nWithout the letter:");
        itr = chars.iterator(); 
        while (itr.hasNext()) { 
            System.out.print(itr.next() + ""); 
        }
    }
    
}

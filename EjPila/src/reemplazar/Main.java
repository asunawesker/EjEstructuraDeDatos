package reemplazar;

import java.util.Random;
import pila.Pila;

/**
 *
 * @author asunawesker
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int stackLength;
        int numbers;
        int number;
        Pila stack;
        Random random;
        
        stack = new Pila();        
        random = new Random();
        stackLength = random.nextInt(10);
        
        for (int i=0; i<stackLength; i++){
            numbers = random.nextInt(10);
            stack.push(numbers);
        }
        
        System.out.println("Stack:");
        for (int i=0; i<stack.listLength(); i++){
            number = (int) stack.search(i);
            System.out.println(number);
        }
        
        System.out.println("\nChange values");
        changeValue(stack, 1 , 2);
    }
    
    public static void changeValue(Pila stack, int newN, int oldN) {
        
        Pila newStack = new Pila();
        
        for (int i=0; i<stack.listLength(); i++){
            int number = (int) stack.search(i);
            
            if (number != oldN){
                newStack.push(number);
            } else {
                newStack.push(newN);
            }
        }
        
        for (int i=0; i<stack.listLength(); i++){
            int number = (int) newStack.search(i);
            System.out.println(number);
        }
    } 
}

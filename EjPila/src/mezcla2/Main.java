package mezcla2;

import java.util.Random;
import lista.LinkedList;
import lista.Node;

/**
 *
 * @author asunawesker
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        LinkedList linked1;
        LinkedList linked2;
        LinkedList mix;
        
        linked1 = new LinkedList();
        linked2 = new LinkedList();
        mix = new LinkedList();
        
        linked1 = addNumbers(linked1);
        linked2 = addNumbers(linked2);
    
        System.out.println("Lista 1:");
        linked1.printData();
        
        System.out.println("\nLista 2:");
        linked2.printData();
        
        System.out.println("\nMix:");
        mix = addingDataAnotherList(linked1, mix);
        mix = addingDataAnotherList(linked2, mix);
        mix.printData();
        
        System.out.println("\nLista mezclada ordenada");
        mix.sort();
        mix.printData();
    }
    
    public static LinkedList addNumbers(LinkedList linked){
        int numbers;
        int linkedLength;
        Random random;
        
        random = new Random();
        linkedLength = random.nextInt(10);
        
        if (linkedLength > 0) {
            for (int i=0; i<linkedLength; i++){
                numbers = random.nextInt(10);
                linked .addTail(numbers);
            }
        } else {
            linkedLength = random.nextInt(10);
            
            for (int i=0; i<linkedLength; i++){
                numbers = random.nextInt(10);
                linked .addTail(numbers);
            }
        }
        
        return linked;
    }
    
    public static LinkedList addingDataAnotherList(LinkedList linked, LinkedList mix){        
        Node currentNode;
        
        currentNode = linked.getHead();
        while(currentNode != null) {
            int data = (int) currentNode.getData();
            mix.addTail(data);
            currentNode = currentNode.getNextNode();
        }
        
        return mix;
    }
    
}

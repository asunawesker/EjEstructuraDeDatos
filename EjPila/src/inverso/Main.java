package inverso;

import java.util.Random;
import lista.LinkedList;

/**
 *
 * @author asunawesker
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int listLength;
        int numbers;
        int data;
        int count;
        boolean condition;
        
        LinkedList list;
        LinkedList listReverse = null;
        Random random;
        
        list = new LinkedList();
        listReverse = new LinkedList();
        random = new Random();
        listLength = random.nextInt(10);
        
        for (int i=0; i<listLength; i++){
            numbers = random.nextInt(10);
            list.addHead(numbers);
        }
        
        System.out.println("Lista");
        for (int i=0; i<listLength; i++){
            data = list.search(i);
            System.out.print(data + " ");
        }
        
        condition = dataInList(5, list);
        
        if (condition == true && listLength > 0) {
            count = countToFind(5, list);
            for (int i=0; i<count; i++){
                list.deleteFirst();
            }
            
            System.out.println("\nLista datos eliminados");
            listReverse = reverse(list, listReverse);
            
            for (int i=0; i<listLength; i++){
                data = listReverse.search(i);
                System.out.print(data + " ");
            }
        } else {
            System.out.println("\nNúmero no encontrado");
        }
        
    }
    
    public static boolean dataInList(int number, LinkedList list){
        boolean condition = true;
        int data;
        
        for (int i=0; i<list.getSize(); i++){
            data = list.search(i);
            if (number == data) {
                condition = true;
                break;
            } else {
                condition = false;
            }
        } 
        return condition;
    }
    
    public static int countToFind(int number, LinkedList list) {
        int data;
        int i = 0;
        int count = 1;
        boolean condition = true;
        
        while(condition){
            data = list.search(i);
            if (number != data) {
                count++;
                i++;
                condition = true;
            } else {
                condition = false;
                break;
            }            
        }
        
        return count-1;
    }
    
    public static LinkedList reverse(LinkedList list, LinkedList listReverse) {
        int data; 
        
        for (int i=0; i<list.getSize(); i++){
            data = list.search(i);
            listReverse.addHead(data);
        }
        
        return listReverse;
    }
    
}

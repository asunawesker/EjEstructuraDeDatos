package ejcola;

import gui.Table;
import java.util.Random;

/**
 *
 * @author asunaweske
 */
public class Main {

    /**
        1) Un cine de un pueblo pequeño nos propone hacer una aplicación para controlar las personas de una cola de un cine en los grandes estrenos de películas.

        Un conjunto de personas esperan la cola para sacar una entrada, tendremos que calcular la entrada según la edad de la persona (mínimo 5 años).

        La edad de las personas se generan aleatoriamente entre 5 y 60 años. Os recomiendo realizar un método en el main para generar Personas en la cola.

        Al final, deberemos mostrar la cantidad total recaudada. El número de personas de la cola se elige al azar entre 0 y 50.

        Te recomiendo usar un mensaje de traza para saber si la recaudación es correcta según la edad (opcional).
     */
    public static void main(String[] args) {
        
        Table table = new Table();
        table.setVisible(true);
        
        /*
        int randomPerson; 
        int randomAge;
        QueueList queue = new QueueList();
        
        Random random = new Random();
        randomPerson = random.nextInt(5);
                
        System.out.println("Productos generados del 0 al 8: " + randomPerson + "\n");
        
        for (int i=0; i<randomPerson ; i++){
            randomAge = random.nextInt(100);
            
            if (randomAge >= 5) {
                Persona persona = new Persona(randomAge);
                queue.enqueue(persona);
            }
        }
        
        System.out.println("Lista total: ");
        
        for (int i=0; i<queue.listLength() ; i++){
            Persona persona = (Persona) queue.poll(i);
            System.out.println(i + ". " + persona.getPrecio());
        }
        
        queue.dequeue();
        
        System.out.println("Lista sin uno: ");
        
        for (int i=0; i<queue.listLength() ; i++){
            Persona persona = (Persona) queue.poll(i);
            System.out.println(i + ". " + persona.getPrecio());
        }*/
    }
    
}

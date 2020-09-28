/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author asunawesker
 */
public class Remove {
    
    Scanner sc = new Scanner (System.in);

    // Declarando mi arraylist bidimensional con su iterador para almacenar 
    // los carácteres de cada oración
    ArrayList <ArrayList<Character>> arrayListSentences = new ArrayList <>();
    Iterator <ArrayList<Character>> itrArrayListSentences;

    // Declarando letra que quiero eliminar
    String letter;
    // Opcion para eliminar más de una letra
    String option;
    
    String textOriginal = "";
    String textNew = "";
    
    final String file = "/home/asunawesker/Desktop/File.txt";

    public Remove() {
    
    }
    
    public void removeWord() {
        
        try {

            File myObj = new File(file);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                // Declarando mi array de carácteres que es el que contiene cada letra de la oración
                ArrayList <Character> sentences;
                // letra uno por uno de la oración que se ocupará para llenar el array anterior
                String data;

                data = myReader.nextLine();
                sentences = new ArrayList<>();
                for (char c : data.toCharArray()) {
                    sentences.add(c);
                }
                // Llenando el array de arrays con una oración particionada en carácteres
                arrayListSentences.add(sentences);	
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }

        System.out.println("\nContenido del ArrayList de ArrayList"
                + "mostrando separacion de carácteres");
        // Iniciando mi iterador del array de arrays
        itrArrayListSentences = arrayListSentences.iterator();
        while(itrArrayListSentences.hasNext()){
            ArrayList <Character> sentences;
            String text = "";

            sentences = itrArrayListSentences.next();
            Iterator <Character> itrSentence = sentences.iterator();
            while(itrSentence.hasNext()){
                Character sentence = itrSentence.next();
                text += sentence;
            }
            textOriginal += (text + "\n");
        }
        
        JOptionPane.showMessageDialog(null, textOriginal);

         
        letter = JOptionPane.showInputDialog("Enter the letter you want to remove: ");

        char c = letter.charAt(0);

        System.out.println("\nRemoving a letter");

        itrArrayListSentences = arrayListSentences.iterator();
        while(itrArrayListSentences.hasNext()){
            ArrayList<Character> sentences = itrArrayListSentences.next();
            Iterator<Character> itrSentences = sentences.iterator();
            while(itrSentences.hasNext()){
                char caracter = itrSentences.next();
                if (caracter == c){
                    itrSentences.remove();
                } 
            }
        }

        itrArrayListSentences = arrayListSentences.iterator();
        while(itrArrayListSentences.hasNext()){
            ArrayList <Character> sentences;
            String text = "";

            sentences = itrArrayListSentences.next();
            Iterator <Character> itrSentence = sentences.iterator();
            while(itrSentence.hasNext()){
                Character sentence = itrSentence.next();
                text += sentence;
            }
            textNew += (text + "\n");
        }
        
        JOptionPane.showMessageDialog(null, textNew);

        JOptionPane.showMessageDialog(null, "Thanks for using this text editor");
    }

}

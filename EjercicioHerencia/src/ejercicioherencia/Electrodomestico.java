/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherencia;

/**
 *
 * @author asunawesker
 */
public class Electrodomestico {
    
    //Atributos que se podrán heredar
    protected float precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected float peso;
    
    //Valores por defecto
    private final float PB_PORDEFECTO = 100;    
    private final String C_PORDEFECTO = "blanco";    
    private final char CE_PORDEFECTO = 'F';    
    private final float P_PORDEFECTO = 5;
    
    /*
        Constructores
    */
    public Electrodomestico() {
        precioBase = PB_PORDEFECTO;
        color = C_PORDEFECTO;
        consumoEnergetico = CE_PORDEFECTO;
        peso = P_PORDEFECTO;
    }

    public Electrodomestico(float precioBase, float peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        consumoEnergetico = CE_PORDEFECTO;
        color = C_PORDEFECTO;
    }

    public Electrodomestico(float precioBase, String color, char consumoEnergetico, float peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }
    
    /*
        Getters de los atributos
    */
    public float getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }
    
    //Métodos de la clase
    private char comprobarConsumoEnergetico(char letra){
        if (letra == 'A' || letra == 'B' || letra == 'C' || 
            letra == 'D' || letra == 'E' || letra == 'F'){
            return letra;
        }else {
            return 'F';
        }
    }

    private String comprobarColor(String color){
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || 
            color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || 
            color.equalsIgnoreCase("gris")){
            return color;
        }else {
            return "Blanco";
        }
    }

    public float precioFinal(){
        float precio = precioBase;

        if (consumoEnergetico == 'A'){
            precio += 100;
        }else if (consumoEnergetico == 'B'){
            precio += 80;
        }else if (consumoEnergetico == 'C'){
            precio += 60;
        }else if (consumoEnergetico == 'D'){
            precio += 50;
        }else if (consumoEnergetico == 'E'){
            precio += 30;
        }else {
            precio += 10;
        }

        if (peso > 0 && peso <= 19){
            precio += 10;
        }else if (peso >= 20 && peso <= 49){
            precio += 50;
        }else if (peso >= 50 && peso <= 79){
            precio += 80;
        }else {
            precio += 100;
        }

        return precio;
    }

    @Override
    public String toString() {
        return "Electrodomestico"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

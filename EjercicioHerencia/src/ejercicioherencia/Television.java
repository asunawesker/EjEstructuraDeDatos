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
public class Television extends Electrodomestico{
    
    //Atributos
    private int resolucion;
    private boolean sintonizadorTDT;
    
    //Valores por defecto
    private final int R_PORDEFECTO = 20;
    private final boolean STDT_PORDEFECTO = false;
    
    /*
        Constructores
    */
    public Television() {
        resolucion = R_PORDEFECTO;
        sintonizadorTDT = STDT_PORDEFECTO;
    }

    public Television(float precioBase, float peso) {
        super(precioBase, peso);
        resolucion = R_PORDEFECTO;
        sintonizadorTDT = STDT_PORDEFECTO;
    }

    public Television(float precioBase, String color, char consumoEnergetico, float peso) {
        super(precioBase, color, consumoEnergetico, peso);
        resolucion = R_PORDEFECTO;
        sintonizadorTDT = STDT_PORDEFECTO;
    }
    
    /*
        Getters por defecto
    */
    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    //Método de Television modificando método del padre
    @Override
    public float precioFinal() {
        float precio = 0;

        if (resolucion > 40){
            precio += precioBase*0.3;
        }
        
        if (sintonizadorTDT = true){
            precio += 50;
        }

        return super.precioFinal()+precio;
    }    
    
    @Override
    public String toString() {
        return "Television"; //To change body of generated methods, choose Tools | Templates.
    }
    
}

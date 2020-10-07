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
public class Lavadora extends Electrodomestico{
    
    //Atributo de clase
    private float carga;
    
    //Valores por defecto
    private final float C_PORDEFECTO = 5;

    /*
        Constructores
    */
    public Lavadora() {
        carga = C_PORDEFECTO;
    }

    public Lavadora(float carga) {
        this.carga = carga;
    }

    public Lavadora(float precioBase, float peso) {
        super(precioBase, peso);
        carga = C_PORDEFECTO;
    }

    public Lavadora(float precioBase, String color, char consumoEnergetico, float peso, float carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    
    //Getter atributo
    public float getCarga() {
        return carga;
    }
    
    //Método de Lavadora modificando método del padre
    @Override
    public float precioFinal() {
        float precio = 0;
        
        if (carga > 30){
            precio += 50;
        }
        
        return super.precioFinal()+precio;
    }
    
    @Override
    public String toString() {
        return "Lavadora"; //To change body of generated methods, choose Tools | Templates.
    }
}

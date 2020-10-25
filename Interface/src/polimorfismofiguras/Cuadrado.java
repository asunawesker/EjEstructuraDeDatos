/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismofiguras;

/**
 *
 * @author asunawesker
 */
public class Cuadrado extends PoligonoRegular{
    
    private static final int NO_LADOS = 2;   

    public Cuadrado(float lado) {
        super(lado, NO_LADOS);
    }    

    @Override
    public String nombre() {
        return "Cuadrado";
    }

    @Override
    public float perimetro() {
        return lado * 4;
    }

    @Override
    public float area() {
        return lado * lado;
    }
    
}

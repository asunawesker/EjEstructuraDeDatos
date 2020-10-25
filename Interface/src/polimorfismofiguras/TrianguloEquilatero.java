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
public class TrianguloEquilatero extends PoligonoRegular{
    
    private static final int NO_LADOS = 3; 

    public TrianguloEquilatero(float lado) {
        super(lado, NO_LADOS);
    }

    @Override
    public String nombre() {
        return "Triángulo equilatero";
    }

    @Override
    public float perimetro() {
        return lado * 3;
    }

    @Override
    public float area() {
        float h = (float) (Math.sqrt(3)/2)*lado;
        return (lado*h)/2; 
    }
    
}

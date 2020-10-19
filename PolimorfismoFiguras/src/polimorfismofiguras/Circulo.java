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
public class Circulo extends FiguraGeometrica{
    
    private float radio;
    
    public Circulo (float radio) {
        this.radio = radio;
    }

    public Circulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
            
    @Override
    public String nombre(){
        return "Circulo";
    }
    
    @Override
    public float perimetro(){
        return (float) (2*Math.PI*radio);
    }

    @Override
    public float area(){
        return (float) (Math.PI * (radio*radio));
    }
}

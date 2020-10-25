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
public class Rectangulo implements FiguraGeometrica{
    
    private float base;
    private float altura;
         
    public Rectangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
            
    @Override
    public String nombre(){
        return "Rectángulo";
    }
    
    @Override
    public float perimetro(){
        return ((base*2)+(altura*2));
    }
    
    @Override
    public float area(){
        return (base * altura);
    }
}

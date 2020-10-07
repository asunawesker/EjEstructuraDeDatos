/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulos;

/**
 *
 * @author asunawesker
 */
public class Isoceles extends Triangulo{

    public Isoceles(float lado_1, float lado_2, float lado_3) {
        super(lado_1, lado_2, lado_3);
    }
        
    @Override
    public float area(){
        float raiz = (float) (Math.sqrt(Math.pow(lado_1,2) - (Math.pow(lado_2,2)/4)));
        return (float) ((lado_2 * raiz)/2);
    }
    
    @Override
    public String toString() {
        return "Triangulo isoceles"; //To change body of generated methods, choose Tools | Templates.
    }
    
}

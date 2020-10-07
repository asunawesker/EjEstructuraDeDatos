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
public class Equilatero extends Triangulo{

    public Equilatero(float lado_1, float lado_2, float lado_3) {
        super(lado_1, lado_2, lado_3);
    }
    
    @Override
    public float area(){
        return (float) ((Math.sqrt(3)/4)*Math.pow(lado_1, 2));
    }
    
    
    @Override
    public String toString() {
        return "Triangulo equilatero"; //To change body of generated methods, choose Tools | Templates.
    }
    
}

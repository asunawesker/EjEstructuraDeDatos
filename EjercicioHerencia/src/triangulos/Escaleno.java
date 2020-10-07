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
public class Escaleno extends Triangulo{

    public Escaleno(float lado_1, float lado_2, float lado_3) {
        super(lado_1, lado_2, lado_3);
    }
    
    private float semiperimetro(){
        float perimetro = super.perimetro();
        return (lado_1 + lado_2 +lado_3)/2;         
    } 
    
    @Override
    public float area(){
        float semiperimetro = semiperimetro();
        float dentroRaiz = semiperimetro * (semiperimetro - lado_1) * (semiperimetro - lado_2) * (semiperimetro - lado_3);
        return (float) (Math.sqrt(dentroRaiz));
    }
    
    @Override
    public String toString() {
        return "Triangulo escaleno"; //To change body of generated methods, choose Tools | Templates.
    }
}

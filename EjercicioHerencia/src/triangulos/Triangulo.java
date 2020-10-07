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
public class Triangulo {
    
    float lado_1, lado_2, lado_3, perimetro;

    public Triangulo(float lado_1, float lado_2, float lado_3) {
        this.lado_1 = lado_1;
        this.lado_2 = lado_2;
        this.lado_3 = lado_3;
    } 

    public float getLado_1() {
        return lado_1;
    }

    public void setLado_1(float lado_1) {
        this.lado_1 = lado_1;
    }

    public float getLado_2() {
        return lado_2;
    }

    public void setLado_2(float lado_2) {
        this.lado_2 = lado_2;
    }

    public float getLado_3() {
        return lado_3;
    }

    public void setLado_3(float lado_3) {
        this.lado_3 = lado_3;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    
    public float perimetro(){
        perimetro = lado_1 + lado_2 + lado_3;
        return perimetro;
    }
    
    public float area(){
        return 0;
    }

    @Override
    public String toString() {
        return "Triangulo"; //To change body of generated methods, choose Tools | Templates.
    }
    
}

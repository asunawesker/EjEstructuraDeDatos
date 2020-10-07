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
public class Main {
    
    public static Triangulo [] triangulo = new Triangulo [3];
    
    public static void main(String[] args) {
        
        Equilatero equilatero = new Equilatero(5,5,5);
        Isoceles isoceles = new Isoceles(3,2,3);
        Escaleno escaleno = new Escaleno(3,4,5);
        
        triangulo [0] = equilatero;
        triangulo [1] = isoceles; 
        triangulo [2] = escaleno;
        
        System.out.println("Perimetro");
        for (Triangulo triangulo1 : triangulo) {
            System.out.println(triangulo1.toString() + " " + triangulo1.perimetro());
        }
        
        System.out.println("Área");
        for (Triangulo triangulo1 : triangulo) {
            System.out.println(triangulo1.toString() + " " + triangulo1.area());
        }
    }
}

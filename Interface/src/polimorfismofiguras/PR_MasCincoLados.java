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
public class PR_MasCincoLados extends PoligonoRegular{  
    
    private float apotema;

    public PR_MasCincoLados(float lado, int numeroLados, float apotema) {
        super(lado, numeroLados);
        this.apotema = apotema;
    }   
            
    @Override
    public float getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public float getApotema() {
        return apotema;
    }

    public void setApotema(float apotema) {
        this.apotema = apotema;
    }
    
    @Override
    public String nombre(){
        return "Polígono";
    }
        
    @Override
    public float perimetro() {
        return lado * numeroLados;
    }

    @Override
    public float area() {
        return (((lado * numeroLados) * apotema)/2);
    }

}

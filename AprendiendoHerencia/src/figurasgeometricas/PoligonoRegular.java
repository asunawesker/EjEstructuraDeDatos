/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author asunawesker
 */
public class PoligonoRegular extends FiguraGeometrica{
    
    protected float lado;
    protected float perimetro;
    protected float apotema;
    protected int numeroLados;
    
    public PoligonoRegular(float lado, float apotema, int numeroLados) {
        this.lado = lado;
        this.apotema = apotema;
        this.numeroLados = numeroLados;
    }
            
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

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
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
        perimetro = lado * numeroLados;
        return perimetro;
    }

    @Override
    public float area() {
        return ((perimetro * apotema)/2);
    }
    
}

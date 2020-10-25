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
public abstract class PoligonoRegular implements FiguraGeometrica {
    
    protected float lado;
    protected int numeroLados;
    
    public PoligonoRegular(float lado, int numeroLados) {
        this.lado = lado;
        this.numeroLados = numeroLados;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }
            
}

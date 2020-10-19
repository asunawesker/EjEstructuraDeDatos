/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author asunawesker
 */
public class Masajista extends SeleccionFutbol {
    
    private String titulacion;
    private int añosExperiencia;
    
    public Masajista() {
        super();
    }

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int añosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }
    
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    @Override
    public void entrenamiento() {
      System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
    }

   public void darMasaje() {
      System.out.println("Da un Masaje");
   }
}

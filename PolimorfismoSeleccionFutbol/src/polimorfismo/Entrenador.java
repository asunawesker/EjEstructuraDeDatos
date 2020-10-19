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
public class Entrenador extends SeleccionFutbol {

    private String idFederacion;

    public Entrenador() {
        super();
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
        
    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    @Override
   public void entrenamiento() {
      System.out.println("Dirige un entrenamiento (Clase Entrenador)");
   }

   @Override
   public void partidoFutbol() {
      System.out.println("Dirige un Partido (Clase Entrenador)");
   }

   public void planificarEntrenamiento() {
      System.out.println("Planificar un Entrenamiento");
   }
            
}

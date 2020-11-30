package lista;

public class Nodo
{
  private Object dato;
  private Nodo enlace;
  
  public Nodo(){
      enlace=null;
  }
  
  public Nodo(Object dato,Nodo enlace)
  {
    setDato(dato);
    setEnlance(enlace);
  }
  
  public void setDato(Object dato){
      this.dato=dato;
  }
  
  public Object getDato(){
      return dato;
  }
  
  public void setEnlance(Nodo enlace){
      this.enlace=enlace;
  }
  
  public Nodo getEnlace(){
      return enlace;
  }
}
package listaenlazadagenerica;

class nodo <T>
{
  private T dato;
  private nodo enlace;
  
  public nodo(){
      enlace=null;
  }
  
  public nodo(T dato,nodo enlace)
  {
    setDato(dato);
    setEnlance(enlace);
  }
  
  public void setDato(T dato){
      this.dato=dato;
  }
  
  public T getDato(){
      return dato;
  }
  
  public void setEnlance(nodo enlace){
      this.enlace=enlace;
  }
  
  public nodo getEnlace(){
      return enlace;
  }
}
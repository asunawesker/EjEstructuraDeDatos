package listaenlazadaobject;

class nodo
{
  private Object dato;
  private nodo enlace;
  
  public nodo(){
      enlace=null;
  }
  
  public nodo(Object dato,nodo enlace)
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
  
  public void setEnlance(nodo enlace){
      this.enlace=enlace;
  }
  
  public nodo getEnlace(){
      return enlace;
  }
}
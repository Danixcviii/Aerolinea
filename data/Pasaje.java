package data;

class pasaje {
  
  public static final String NO_PASAJERO = "Sin Asignar";
  
  public Pasaje(String id,double valor){
    this.id = id;
    this.valor = valor;
    setNombrePasajero(NO_PASAJERO);
    
  }
  
  public void setNombrePasajero(String nombrePasajero){
    this.nombrePasajero = nombrePasajero;
  }
  
  public String getID(){
    return id;
  }
  
  public double getValor(){
    return valor;
  }  
  
  public String getNombrePasajero(){
    return nombrePasajero;
  }
  
  protected String id;
  protected double valor;
  protected String nombrePasajero;
}

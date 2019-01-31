package data;

class Vuelo {

  public Vuelo(String codigo,String fecha,int capacidad,int disponiblesPromo,int disponiblesEcono,intdisponiblesFlexi){
    this.codigo = codigo;
    this.fecha = fecha;
    this.capacidad = capacidad;
    setDisponiblesPromo(disponiblesPromo);
    setDisponiblesEcono(disponiblesEcono):
    setDisponiblesFlexi(disponiblesFlexi);
  }
  
  public void setDisponiblesPromo(int disponiblesPromo){
    this.disponiblesPromo = disponiblesPromo;
  }
  
  public void setDisponiblesEcono(int disponiblesEcono){
    this.disponiblesEcono = disponiblesEcono;
  }
  
  public void setDisponiblesFlexi(int disponiblesFlexi){
    this.disponiblesFlexi = disponiblesFlexi;
  }
  
  public String getCodigo(){
    return codigo;
  }
  
  public String getFecha(){
    return fecha;
  }
  
  public void addPasaje(Pasaje pasaje){
    pasajes.add(pasaje);
    if(pasaje instanceOf Flexi){
      setDisponiblesFlexi(disponiblesFlexi-1);  
    }else if(pasaje instanceOf Econo){
      setDisponiblesEcono(disponiblesEcono-1);
    }else{
      setDisponiblesPromo(disponiblesPromo-1);
    }
  }
    
  private String codigo;
  private String fecha;
  private int capacidad;
  private int disponiblesPromo;
  private int disponiblesEcono;
  private int disponiblesFlexi;
  private ArrayList<Pasaje> pasajes;
}

package data;

class Flexi extedns Pasaje implements Reembolsable{

  public static final double MULTA = 70000;
  public static final string NO_SILLA = "Sin Asignar";
  
  public Flexi (String id,double valor){
    super(id,valor);
    setSilla(NO_SILLA);
  }
  
  public void setSilla(String silla){
    this.silla = silla;
  }
  
  public String getSilla(){
    return silla;
  }
  
  
  public double calcularReembolso(){
    return valor - MULTA;
  }
  
  private String silla;
}

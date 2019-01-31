package data;

class Flexi extedns Pasaje implements Reembolsable{

  public static final double MULTA = 70000;
  
  public Flexi (String silla){
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

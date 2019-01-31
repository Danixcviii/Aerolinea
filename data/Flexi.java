package data;

class Flexi extedns Pasaje implements Reembolsable{

  public static final double MULTA = 70000;
  
  public double calcularReembolso(){
    return valor - MULTA;
  }
  
  private String silla;
}

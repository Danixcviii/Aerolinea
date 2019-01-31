package data;

class Econo extends Pasaje implements Reembolsable{
  
  public static final double MULTA = 100000;
  
  public double calcularReembolso(){
    return valor - MULTA;
  }
}

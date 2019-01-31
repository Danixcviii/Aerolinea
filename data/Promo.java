package data;

class Promo extends Pasaje implements Reembolsable {

  public static final double MULTA = 70000;
  
  public double calcularReembolso(){
    return valor - MULTA;
  }

}

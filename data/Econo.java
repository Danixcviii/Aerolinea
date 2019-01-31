package data;

class Econo extends Pasaje implements Reembolsable{
  
  public static final double MULTA = 100000;
  
  public Econo(String id,double valor){
    super(id,valor);
  }
  
  public double calcularReembolso(){
    return valor - MULTA;
  }
}

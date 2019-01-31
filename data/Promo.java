package data;

class Promo extends Pasaje implements Reembolsable {

  public Promo (String id,double valor){
    super(id,valor);
  }
  
  public double calcularReembolso(){
    return 0;
  }
}

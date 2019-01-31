package data;

class Flexi extedns Pasaje implements Reembolsable{

  public static final double MULTA = 70000;
  
  public Flexi (String id,double valor,String silla){
    super(id,valor);
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

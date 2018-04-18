public class Hotel implements Alquilable {

  private double costo_base = 100;

  private String tipo = "Hotel";

  private String descripcion;



  public Hotel(String descripcion){
   this.descripcion = descripcion;
  }


  public String getDescripcion(){
   return this.descripcion;
  }


  public String getTipo(){
   return this.tipo;
  }


  public double getPresupuesto(){
   return this.costo_base;
  }

}
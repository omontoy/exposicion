public abstract class AlquilableDecorator implements Alquilable {

  private Alquilable alquilable;


  public AlquilableDecorator(Alquilable alquilable){
   this.alquilable = alquilable;
  }


  public Alquilable getAlquilable(){
   return this.alquilable;
  }


  public void setAlquilable(Alquilable alquilable){
   this.alquilable = alquilable;
  }

  
  public String getDescripcion(){
   return getAlquilable().getDescripcion();
  }

  
  public String getTipo(){
   return getAlquilable().getTipo();
  }

  
  public double getPresupuesto(){
   return getAlquilable().getPresupuesto();
  }

}
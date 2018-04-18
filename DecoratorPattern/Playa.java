public class Playa extends AlquilableDecorator {

  public Playa(Alquilable alquilable){
   super(alquilable);
  }


  public String getDescripcion(){
   return getAlquilable().getDescripcion().concat(" (vista al mar)");
  }


  public double getPresupuesto(){
   return getAlquilable().getPresupuesto() + 100;
  }

}
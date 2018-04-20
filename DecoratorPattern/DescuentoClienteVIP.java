/*
ConcreteDecorator: Elemento que añadirá las funcionalidades 
y/o responsabilidades al componente objetivo Hotel.
*/

public class DescuentoClienteVIP extends AlquilableDecorator {

  public DescuentoClienteVIP(Alquilable alquilable){
   super(alquilable);
  }


  public String getDescripcion(){
   return getAlquilable().getDescripcion().concat(" (descuento cliente VIP)");
  }

  
  public double getPresupuesto(){
   return getAlquilable().getPresupuesto() * 0.85;
  }

}
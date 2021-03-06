/*
ConcreteDecorator: Elemento que añadirá las funcionalidades 
y/o responsabilidades al componente objetivo Hotel.
*/

public class RecorridoTuristico extends AlquilableDecorator {

  public RecorridoTuristico(Alquilable alquilable){
   super(alquilable);
  }


  public String getDescripcion(){
   return getAlquilable().getDescripcion().concat(" (Recorrido Turistico)");
  }

  
  public double getPresupuesto(){
   return getAlquilable().getPresupuesto() + 65;
  }

}
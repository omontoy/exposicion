
public class DecoratorPattern {
  public static void main(String[] args) {

          
    // Buscaremos un hotel Dann Carlton con pensión completa

    Alquilable hotel_dann_carlton = new Hotel("Hotel Dann Carlton (Medellín)");

    hotel_dann_carlton = new RecorridoTuristico(hotel_dann_carlton);



    // Visualizamos el resultado

    System.out.println(hotel_dann_carlton.getDescripcion());

    // Que mostrará: "Hotel Dann Carlton (Medellín) (Recorrido Turistico)"



    // Obtenemos el presupuesto

    System.out.println(hotel_dann_carlton.getPresupuesto()+" €");

    // Que mostrará: "165 €"



    // Ahora buscaremos un hotel Decameron en primera linea de playa,

    // con pensión completa y le aplicaremos el descuento VIP



    Alquilable hotel_decameron = new Hotel("Hotel Decameron (Cartagena)");

    hotel_decameron = new Playa(hotel_decameron);

    hotel_decameron = new RecorridoTuristico(hotel_decameron);

    hotel_decameron = new DescuentoClienteVIP(hotel_decameron);



    // Visualizamos el resultado

    System.out.println(hotel_decameron.getDescripcion());

    // Que mostrará: 
    //"Hotel Decameron (Cartagena) (vista al mar) (Recorrido Turistico) (descuento cliente VIP)"



    // Obtenemos el presupuesto

    System.out.println(hotel_decameron.getPresupuesto()+" €");

    // Que mostrará: "225.25 €"

  }     
}
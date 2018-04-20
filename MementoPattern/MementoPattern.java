
public class MementoPattern { // Clase que alberga el main()

  public static void main(String[] args) {

    /*
    Se crea un objeto de Venta y se le 
    introducen propiedades
    */
    Venta v = new Venta();
    v.setNombre("Camila");
    v.setTelefono("316 7985");
    v.setPresupuesto(15000);

    // Se guarda el estado 
    MemoriaVenta m = new MemoriaVenta();
    m.setMemento( v.SalvaMemento() );

    // Se modifica nuevamente el Originator
    v.setNombre("Orlando");
    v.setTelefono("314 5485");
    v.setPresupuesto(18000);

    // Restaura el estado guardado
    v.RestauraMemento( m.getMemento() );
  }

}

/*
Salida del programa 

Nombre: Camila
Telefono: 316 7985
Presupuesto: 15000.0

 Salvando estado --

Nombre: Orlando
Telefono: 314 5485
Presupuesto: 18000.0

 Restaurando estado -- 

Nombre: Camila
Telefono: 316 7985
Presupuesto: 15000.0

*/
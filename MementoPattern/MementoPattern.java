
public class MementoPattern {

  public static void main(String[] args) {

    Venta v = new Venta();
    v.setNombre("Camilo");
    v.setTelefono("316 7985");
    v.setPresupuesto(15000);

    MemoriaVenta m = new MemoriaVenta();
    m.setMemento( v.SalvaMemento() );

    v.setNombre("Andrés");
    v.setTelefono("314 5485");
    v.setPresupuesto(18000);

    v.RestauraMemento( m.getMemento() );
  }

}

public class Venta {  // Clase Originator

   private String nombre;
   private String telefono;
   private double presupuesto;


   // Propiedades del estado con métodos set

   public void setNombre(String nombre) {
      System.out.println("Nombre: " + nombre);
      this.nombre = nombre;
   }

   public void setTelefono(String telefono) {
      System.out.println("Telefono: " + telefono);
      this.telefono = telefono;
   }

   public void setPresupuesto(double presupuesto) {
      System.out.println("Presupuesto: " + presupuesto);
      this.presupuesto = presupuesto;
   }


   // Propiedades del estado con métodos get 

   public String getNombre() { return nombre; }
   public String getTelefono() { return telefono; }
   public double getPresupuesto() { return presupuesto; }


   // Clase que crea el Memento

   public Memento SalvaMemento() {
      System.out.println("\n Salvando estado --\n");
      return new Memento(nombre, telefono, presupuesto);
   }


   // Clase que restaura el Memento

   public void RestauraMemento(Memento memento) {
      System.out.println("\n Restaurando estado -- \n");
      this.setNombre( memento.getNombre() );
      this.setTelefono( memento.getTelefono() );
      this.setPresupuesto( memento.getPresupuesto() );
   }

}
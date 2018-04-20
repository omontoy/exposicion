
public class Memento {

  /* Las mismas propiedades del objeto que 
  vamos a guardar */

  private String nombre;
  private String telefono;
  private double presupuesto;

  
  // Constructor de la clase Memento 

  public Memento(String nombre, String telefono,
    double presupuesto) {

    this.nombre = nombre;
    this.telefono = telefono;
    this.presupuesto = presupuesto;
  }

  // Métodos set del Memento 

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public void setPresupuesto(double presupuesto) {
    this.presupuesto = presupuesto;
  }


  // Métodos get del Memento

  public String getNombre() { return nombre; }

  public String getTelefono() { return telefono; }

  public double getPresupuesto() { return presupuesto; }

}
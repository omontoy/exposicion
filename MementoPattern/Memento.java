
public class Memento {

  private String nombre;
  private String telefono;
  private double presupuesto;

  public Memento(String nombre, String telefono,
    double presupuesto) {

    this.nombre = nombre;
    this.telefono = telefono;
    this.presupuesto = presupuesto;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public void setPresupuesto(double presupuesto) {
    this.presupuesto = presupuesto;
  }


  public String getNombre() { return nombre; }

  public String getTelefono() { return telefono; }

  public double getPresupuesto() { return presupuesto; }

}
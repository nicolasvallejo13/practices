public class Juego
{
  private String nombre;
  private String descripcion;
  private int numeroJugadores;
  private int existencia;
  private int precio;
  public Juego()
  {
  }
  public Juego(String nombre, String descripcion, int numeroJugadores, int existencia, int Precio )
  {
    this.nombre=nombre;
    this.descripcion=descripcion;
    this.numeroJugadores = numeroJugadores;
    this.existencia=existencia;
    this.precio=precio;
  }
  public void setNombre(String nombre)
  {
    this.nombre=nombre;
  }
  public String getNombre()
  {
    return nombre;
  }
  public void setDescripcion(String descripcion)
  {
    this.descripcion=descripcion;
  }
  public String getDescripcion()
  {
    return descripcion;
  }
  public void setNumeroJugadores(int numeroJugadores)
  {
   this.numeroJugadores = numeroJugadores;
  }
  public int getNumeroJugadores()
  {
    return numeroJugadores;
  }
  public void setExistencia(int existencia)
  {
   this.existencia=existencia;
  }
  public int getExistencia()
  {
    return existencia;
  }
  public void setPrecio(int precio)
  {
   this.precio=precio;
  }
  public int getPrecio()
  {
    return precio;
  }
}
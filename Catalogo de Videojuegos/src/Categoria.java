import java.util.ArrayList;
public class Categoria 
{
  private String nombre;
  private String codigo;
  private String descrip2;
  private boolean aptaMenores;
  private ArrayList <Juego> juegos;
  public Categoria()
  {
    this.juegos = new ArrayList<Juego>();
  }
  public Categoria(String nombre,String codigo, String descrip2 , boolean aptaMenores, ArrayList <Juego> juegos)
  {
    this.nombre =nombre;
    this.codigo=codigo;
    this.descrip2=descrip2;
    this.aptaMenores=aptaMenores;
    this.juegos=juegos;
  }
   public void setNombre(String nombre)
  {
    this.nombre=nombre;
  }
  public String getNombre()
  {
    return nombre;
  }
  public void setCodigo(String codigo)
  {
    this.codigo=codigo;
  }
  public String getcodigo()
  {
    return codigo;
  }

  public void setDescrip2(String descrip2)
  {
    this.descrip2=descrip2;
  }
  public String getDescrip2()
  {
    return descrip2;
  }
  public void setAptaMenores(boolean aptaMenores)
  {
    this.aptaMenores=aptaMenores;
  }
  public boolean getAptaMenores()
  {
    return aptaMenores;
  }
  public int getCantidadJuegos()
  {
    return juegos.size();

  }
  public void imprimirJuegos()
  {
    
    for(int i =0; i != juegos.size(); i++)
    {
      
      System.out.println(juegos.get(i).getNombre());
    }
  }
  public void imprimirCategoria()
  {
    System.out.println( nombre+" "+ descrip2+ " código "+ codigo+" apta para menores:"  + aptaMenores  );
  }
}

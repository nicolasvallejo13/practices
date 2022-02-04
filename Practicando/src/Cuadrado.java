public class Cuadrado 
{
    private int lado;
    private String nombre;
   
	public Cuadrado(int lado, String nombre ) {
		
		this.lado = lado;
		this.nombre = nombre;
		
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
}    
}
public class Cuadrado {
	private int lado;
	private String nombre;
	private String color;

	public Cuadrado(int lado, String nombre, String color) {

		this.lado = lado;
		this.nombre = nombre;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
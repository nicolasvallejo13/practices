
public class Rectangulo {

	private int ancho;
	private int largo;
	private String nombre;
	private String color;

	public int getAncho() {
		return ancho;
	}

	public Rectangulo(int ancho, int largo, String nombre, String color) {

		this.ancho = ancho;
		this.largo = largo;
		this.nombre = nombre;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	public void setLarggo(int largo) {
		this.largo = largo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

public class Circulo {
	private int radio;
	private String nombre;
	private String color;

	public Circulo(int radio, String nombre, String color) {

		this.radio = radio;
		this.nombre = nombre;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

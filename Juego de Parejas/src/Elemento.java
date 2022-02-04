
public class Elemento {

	private int codigo;
	private String nombre;
	private String color;
	private int tamano;
	private int coodenadaFila1;
	private int coodenadaFila2;
	private int coordenadaColumna1;
	private int coordenadaColumna2;
	private boolean haSidoEncontrado;
	

	public Elemento(int codigo, String nombre, String color, int tamano) 
	{
		this.codigo = codigo;
		this.nombre = nombre;
		this.color = color;
		this.tamano = tamano;
		haSidoEncontrado = false;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	
	public int getCoodenadaFila1() {
		return coodenadaFila1;
	}

	public void setCoodenadaFila1(int coodenadaFila1) {
		this.coodenadaFila1 = coodenadaFila1;
	}

	public int getCoodenadaFila2() {
		return coodenadaFila2;
	}

	public void setCoodenadaFila2(int coodenadaFila2) {
		this.coodenadaFila2 = coodenadaFila2;
	}

	public int getCoordenadaColumna1() {
		return coordenadaColumna1;
	}

	public void setCoordenadaColumna1(int coordenadaColumna1) {
		this.coordenadaColumna1 = coordenadaColumna1;
	}

	public int getCoordenadaColumna2() {
		return coordenadaColumna2;
	}

	public void setCoordenadaColumna2(int coordenadaColumna2) {
		this.coordenadaColumna2 = coordenadaColumna2;
	}
	

	public boolean isHaSidoEncontrado() {
		return haSidoEncontrado;
	}

	public void setHaSidoEncontrado(boolean haSidoEncontrado) {
		this.haSidoEncontrado = haSidoEncontrado;
	}

	public void imprimirAtributos ()
	{
		System.out.println("\n nombre del elemento: " + nombre + "\n codigo del elemento: " + codigo + "\n color del elemento: " + color + "\n tamaño del elemento: "+ tamano + "\n coordenada en fila1 del Elemento: "+ (coodenadaFila1 ) + "\n coordenada en columna1 del Elemento: "+ (coordenadaColumna1) + "\n coordenada en fila2 del Elemento: "+ (coodenadaFila2 ) + "\n coordenada en columna2 del Elemento: "+ (coordenadaColumna2));
	}
}

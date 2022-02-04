
public class Rectangulo {
	
		private int ancho;
		private int largo;
	    private String nombre;
		public int getAncho() {
			return ancho;
		}
		
		
		public Rectangulo(int ancho, int largo, String nombre) {
			super();
			this.ancho = ancho;
			this.largo = largo;
			this.nombre = nombre;
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
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class BotonNicolas extends Button {
	public int coordenada1;
	public int coordenada2;
	
	public BotonNicolas(int coordenada1, int coordenada2) {
		super();
		this.coordenada1 = coordenada1;
		this.coordenada2 = coordenada2;
	}
	public int getCoordenada1() {
		return coordenada1;
	}
	public void setCoordenada1(int coordenada1) {
		this.coordenada1 = coordenada1;
	}
	public int getCoordenada2() {
		return coordenada2;
	}
	public void setCoordenada2(int coordenada2) {
		this.coordenada2 = coordenada2;
	}
	
	

}

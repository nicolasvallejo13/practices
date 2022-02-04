import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class parte2panel4 extends GridPane {
	private Label nombre;
	private TextField txnombre;
	private Label area;
	private TextField txarea;
	private Label perimetro;
	private TextField txperimetro;
	
	
	public parte2panel4 () {
		this.nombre = new Label("Nombre");
		add (nombre,1,1);
		this.txnombre = new TextField("");
		add(txnombre,2,1);
		this.area = new Label("Área");
		add (area,1,2);
		this.txarea = new TextField("");
		add(txarea,2,2);
		this.perimetro = new Label("Perímetro");
		add (perimetro,1,3);
		this.txperimetro= new TextField("");
		add(txperimetro,2,3);
		
		
	}
	
	
	
	
	
	
	
	
	

}

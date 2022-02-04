
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.layout.GridPane;


public class panel1 extends GridPane {
	
	
	private Label etiqueta1;
	private Label etiqueta2;
	private Label etiqueta3;
	private Label etiqueta4;
	private Label etiqueta5;
	private Label etiqueta6;
	private TextField txLado;
	private TextField txalto;
	private TextField txcolor;
	private TextField txradio;
	private TextField txancho;
	private TextField txnombre;
	
	

	
	
	
	public panel1() {
		
		
		this.etiqueta1 = new Label("Lado: ");
		add (etiqueta1,0,0);
		this.txLado = new TextField("");
		add(txLado,1,0);
		this.etiqueta2 = new Label("alto: ");
		add (etiqueta2,2,0);
		this.txalto = new TextField("");
		add(txalto,3,0);
		this.etiqueta3 = new Label("Color: ");
		add (etiqueta3,4,0);
		this.txcolor = new TextField("");
		add (txcolor,5,0);
		this.etiqueta4 = new Label("Radio: ");
		add (etiqueta4,0,1);
		this.txradio = new TextField("");
		add (txradio,1,1);
		this.etiqueta5 = new Label("Ancho: ");
		add (etiqueta5,2,1);
		this.txancho = new TextField("");
		add (txancho,3,1);
		this.etiqueta6 = new Label("Nombre ");
		add (etiqueta6,4,1);
		this.txnombre = new TextField("");
		add (txnombre,5,1);
		}
	public  int getLado() {
		return (Integer.parseInt(txLado.getText()));
		
	}
	
	public int getAlto() {
		return (Integer.parseInt(txalto.getText()));
	}
	public int getAncho() {
		return (Integer.parseInt(txancho.getText()));
		
	}
	public int getRadio() {
		return (Integer.parseInt(txradio.getText()));
		
	}
	

	public String getNombre() {
	return txnombre.getText();
	}
	
}
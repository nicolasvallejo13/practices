import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class GuardaPuntaje extends GridPane {
	private Label ingreseNombre;
	private TextField textoNombre;
	private Button guardar;
	public GuardaPuntaje( String puntaje) 
	{
		EscribirArchivo escritor = new EscribirArchivo();
		
		ingreseNombre = new Label("Ingrese nombre");
		textoNombre = new TextField("");
		guardar = new Button("Guardar Puntaje");
		
		this.add(ingreseNombre,0,0);
		this.add(textoNombre,0,1);
		this.add(guardar,0,2);
		
		guardar.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				getChildren().remove(ingreseNombre);
				getChildren().remove(textoNombre);
				getChildren().remove(guardar);
				
				escritor.escribirEnArchivoAdicionandoTexto("PuntajesCaeBasuras.txt", textoNombre.getText() , puntaje );
				PuntajeMaximo pMax = new PuntajeMaximo();
				getChildren().add(pMax);
				

			}
		});
		
		
		
		
		
		
	}
	
	
	
	

}

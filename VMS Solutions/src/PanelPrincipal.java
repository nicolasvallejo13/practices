import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class PanelPrincipal extends VBox {

	private CreaClientes creaClientes;
	private Button botonCreaClientes;
	
	

	public PanelPrincipal() {
		
		botonCreaClientes = new Button("Crear Cliente");
		this.setPadding(new Insets(10, 10, 10, 30));
		botonCreaClientes.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				getChildren().removeAll(botonCreaClientes);
				CreaClientes creaClientes1 = new CreaClientes();
				getChildren().add(creaClientes1);
				
			}
		});
		
		
		
		
		this.getChildren().add(botonCreaClientes); 
		
	}

}

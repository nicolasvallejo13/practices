import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Inicio extends Pane {
	private Button caeBasuras;
	private Button juego2;
	private Button juego3;
	private ImageView fondoSi;
	Stage primaryStage;
	
	public Inicio (Stage primaryStage)
	{
		this.primaryStage = primaryStage;
		caeBasuras = new Button ("Cae Basuras");
		caeBasuras.setLayoutX(200);
		juego2 = new Button ("Juego 2");
		juego2.setLayoutX(200);
		juego2.setLayoutY(200);
		juego3 = new Button ("Juego 3");
		juego3.setLayoutX(200);
		juego3.setLayoutY(400);
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("depositphotos_141654620-stock-photo-city-game-background-with-mountains.jpg");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Image fondo = new Image(fis);
		fondoSi = new ImageView(fondo);
		this.getChildren().add(fondoSi);
		
		
		
		caeBasuras.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
					 @Override
					public void handle(ActionEvent e) {
					getChildren().removeAll(caeBasuras, juego2, juego3);
					JuegoCaeBasuras juegoCaeBasuras1 = new JuegoCaeBasuras(Inicio.this.primaryStage);
					//getChildren().add(juegoCaeBasuras1);
					Inicio.this.primaryStage.setScene(new Scene(juegoCaeBasuras1));
					 
					 }
					 }
					);
		
		
		
		
				
				
		
		
		
		
		
		
		
		getChildren().add(caeBasuras);
		getChildren().add(juego2);
		getChildren().add(juego3);
	}
	
	
	

}

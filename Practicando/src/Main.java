 import javafx.application.Application;

import javafx.scene.Scene;

import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage)
	{
		Form formulario = new Form();
		Scene scene = new Scene (formulario, 650,500 );

 

		primaryStage.setScene(scene); 
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
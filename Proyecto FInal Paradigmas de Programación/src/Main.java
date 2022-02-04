import javafx.application.Application;

import javafx.scene.Scene;

import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Inicio inicio1 = new Inicio(primaryStage);
		Scene scene = new Scene(inicio1, 1200, 700);
		primaryStage.setTitle("Proyecto Final Paradigmas de Programaci�n. Nicolas Vallejo. Ana S�tiva. Andr�s Galeano ");
		primaryStage.setScene(scene);
		
		//primaryStage.setFullScreen(true);
		primaryStage.show();
	}

	public static void main(String[] args) {
		//PuntajeMaximo hola = new PuntajeMaximo();
		Application.launch(args);

	}

}
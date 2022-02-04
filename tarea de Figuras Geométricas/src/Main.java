import javafx.application.Application;

import javafx.scene.Scene;

import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Dibujo formulario = new Dibujo();
		Scene scene = new Scene(formulario, 650, 500, false);
		primaryStage.setTitle(" Ejercicio Dibujo con FX ");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
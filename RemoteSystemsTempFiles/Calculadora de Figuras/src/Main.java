import javafx.application.Application;

import javafx.scene.Scene;

import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Calculadora formulario = new Calculadora();
		Scene scene = new Scene(formulario, 650, 500);
		primaryStage.setTitle("Nicolás Vallejo y Ana Sátiva: Calculadora de Figuras Geométricas");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public void start(Stage primaryStage) {
		Tablero Tablero1 = new Tablero();
		Scene scene = new Scene(Tablero1, 650, 500);
		primaryStage.setTitle("Nicol�s Vallejo y Ana S�tiva: Buscaminas");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {

		launch(args);

	}
}

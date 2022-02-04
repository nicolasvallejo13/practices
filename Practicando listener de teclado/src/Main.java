

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Region;
import javafx.scene.paint.ImagePattern;
import javafx.stage.Stage;

public class Main extends Application {

	public void start(Stage primaryStage) {

		
		Tablero Tablero1 = new Tablero();
		
		
		
		Scene scene = new Scene(Tablero1, 650, 500, false);
		primaryStage.setTitle("practicando listener");
		primaryStage.setScene(scene);
		
		ImagePattern pattern = new ImagePattern(image);
		scene.setFill(pattern);
		primaryStage.show();
	}

	public static void main(String[] args) {

		launch(args);

	}
}

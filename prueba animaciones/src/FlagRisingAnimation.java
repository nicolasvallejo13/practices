

	import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.animation.PathTransition;
	  import javafx.application.Application;
	  import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
	  import javafx.scene.layout.Pane;
	  import javafx.scene.shape.Line;
	  import javafx.stage.Stage;
	  import javafx.util.Duration;
	 
 public class FlagRisingAnimation extends Application {
	 @Override // Override the start method in the Application class
	 public void start(Stage primaryStage) {
	 // Create a pane
	 Pane pane = new Pane();
	
	 // Add an image view and add it to pane
	 // Start animation
	 
	  // Create a scene and place it in the stage
	 // Place the scene in the stage
	   // Display the stage
	  
	  
	  FileInputStream fis = null;

		try {
			fis = new FileInputStream("depositphotos_141654620-stock-photo-city-game-background-with-mountains.jpg");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Image fondo = new Image(fis);
		ImageView fondoSi = new ImageView(fondo);

		try {
			fis = new FileInputStream("Caneca Verde.png");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Image caneca = new Image(fis);
		ImageView imagenCaneca = new ImageView(caneca);
		imagenCaneca.setFitHeight(120);
		imagenCaneca.setFitWidth(100);
		Button canecaSi = new Button("", imagenCaneca);

		canecaSi.setLayoutX(550);
		canecaSi.setLayoutY(579);
		canecaSi.setMaxSize(30, 30);
		
		FileInputStream fus = null;
		try {
			fus = new FileInputStream("basurapapel.jpg");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Image basura = new Image(fus);
		ImageView imagenPapel= new ImageView(basura);
		
		
		PathTransition basura1 = new PathTransition(Duration.millis(10000), new Line(100, 200, 100, 0), new Button("OK"));
		basura1.setCycleCount(5);
		basura1.play();
		
		pane.getChildren().add(fondoSi);
		
		//pane.getChildren().add(canecaSi);
		//pane.getChildren().add(new Line(100, 200, 100, 0));

		canecaSi.setOnKeyPressed(e -> {
			switch (e.getCode()) {
			case RIGHT:
				canecaSi.setLayoutX(canecaSi.getLayoutX() + 10);
				break;
			case LEFT:
				canecaSi.setLayoutX(canecaSi.getLayoutX() - 10);
				break;

			}
		});
	
	 
		 Scene scene = new Scene(pane, 700, 700);
		  primaryStage.setTitle("FlagRisingAnimation"); // Set the stage title
		  primaryStage.setScene(scene); 
		
		  ImageView imageView = new ImageView("basurapapel.jpg");
			 pane.getChildren().add(imageView);
			
			 // Create a path transition
			 PathTransition pt = new PathTransition(Duration.millis(8000),  new Line(100, 0, 100, 1000), imageView);
			 // pt.setCycleCount(5);
			  pt.play();
		
		primaryStage.show();
		
		
		
	 }

	  
	  
	  
	  
	  
	 public static void main(String[] args) {
			Application.launch(args);

		}
	 }


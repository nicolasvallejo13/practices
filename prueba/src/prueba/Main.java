package prueba;

  import javafx.application.Application;
  import javafx.scene.Scene;
  import javafx.scene.control.Button;
  import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage)
	{	
		primaryStage.setScene(new Scene(new Button("te amo"), 500, 1000)); 
		primaryStage.show();
		
		Stage stage = new Stage();
		stage.setTitle("second stage!");
		primaryStage.setScene(new Scene(new Button("te mucho"), 1000, 1000)); 
		stage.show();
		
		

	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}

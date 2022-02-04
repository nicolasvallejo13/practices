
import javafx.application.Application;

import javafx.scene.Scene;

import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		PanelPrincipal panelPrincipal = new PanelPrincipal();
		Scene scene = new Scene(panelPrincipal, 1300, 600);
		//primaryStage.setResizable(false);
		primaryStage.setTitle("VMS Solutions ");
		primaryStage.setScene(scene);

		// primaryStage.setFullScreen(true);
		primaryStage.show();
	}

	public static void main(String[] args) {
		
		Application.launch(args);

	}

}
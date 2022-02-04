import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import java.util.ArrayList;

public class Dibujo extends HBox{
	private Rectangle edificio;
	
	

	public Dibujo() {

		edificio = new Rectangle (50,200,50,200);
		Rectangle ventana = new Rectangle(200,50,25,25);
		
		edificio.setFill(Color.GREY);

		getChildren().add(edificio);
		getChildren().add(ventana);

	}

}
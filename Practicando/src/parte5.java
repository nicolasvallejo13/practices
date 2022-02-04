import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class parte5 extends BorderPane{
	public Button Anterior;
	public Button Siguiente;
	
	public parte5() {
		this.Anterior = new Button("Anterior");
		Anterior.setFont(Font.font("Times New Roman", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR, 30));
		this.Siguiente = new Button("Siguiente");
		Siguiente.setFont(Font.font("Times New Roman", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR, 30));
		setLeft(Anterior);
		setRight(Siguiente);
	}
	

}

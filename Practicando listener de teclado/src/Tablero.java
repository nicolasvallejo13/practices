import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;

public class Tablero extends Pane {
public Button boton1;

public Tablero()
{
	boton1 = new Button("OK");
	boton1.setLayoutY(10);
	getChildren().add(boton1);
	boton1.setOnKeyPressed(e -> {
		switch (e.getCode())
		{
		case DOWN: boton1.setLayoutY(boton1.getLayoutY() + 10); break;
		case UP: boton1.setLayoutY(boton1.getLayoutY()-10); break;
		case RIGHT : boton1.setLayoutX(boton1.getLayoutX() +10 ); break;
		case LEFT : boton1.setLayoutX(boton1.getLayoutX() -10 ); break; 
		
		}
	});
}
public void setBackground(BackgroundImage backgroundImage2)
{
	

Image image = new Image("/Practicando listener de teclado/fondo_png_grande_by_moradita49-d5ir8wi.png");
// new BackgroundSize(width, height, widthAsPercentage, heightAsPercentage, contain, cover)
BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
// new BackgroundImage(image, repeatX, repeatY, position, size)
BackgroundImage backgroundImage = new BackgroundImage(image, null, null, null, backgroundSize);
// new Background(images...)
//Background background = new Background(backgroundImage);
this.setBackground(backgroundImage);
}

}

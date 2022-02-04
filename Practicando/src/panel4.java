import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import java.lang.Math;

public class panel4 extends HBox{
	private Shape parte1;
	private GridPane parte2;
	
	public panel4() {
		
		GridPane parte22 = new GridPane();
		parte22.setPadding(new Insets(11, 12, 13, 14));
		parte22.setHgap(60);
		parte22.setVgap(5);
		parte22.setAlignment(Pos.CENTER_RIGHT);
		Label nombre = new Label("Nombre");
		parte22.add (nombre,1,1);
		TextField txnombre = new TextField("");
		parte22.add(txnombre,2,1);
		Label area = new Label("Área");
		parte22.add (area,1,2);
		TextField txarea = new TextField("");
		parte22.add(txarea,2,2);
		Label perimetro = new Label("Perímetro");
		parte22.add (perimetro,1,3);
		TextField txperimetro= new TextField("");
		parte22.add(txperimetro,2,3);
		this.parte2= parte22;
		this.parte1 =  new Ellipse(25, 50, 25, 25);
		getChildren().add(parte1);
		getChildren().add(parte2);
	}
	
	public void crearCuadrado(int i, String n)
	{
		getChildren().remove(parte1);
		getChildren().remove(parte2);
		this.parte1 = new Rectangle(25, 50, i, i);
		GridPane parte22 = new GridPane();
		parte22.setPadding(new Insets(11, 12, 13, 14));
		parte22.setHgap(60);
		parte22.setVgap(5);
		parte22.setAlignment(Pos.CENTER_RIGHT);
		Label nombre = new Label("Nombre");
		parte22.add (nombre,1,1);
		TextField txnombre = new TextField(n);
		parte22.add(txnombre,2,1);
		Label area = new Label("Área");
		parte22.add (area,1,2);
		TextField txarea = new TextField(Integer.toString( ((i)) * (i)));
		parte22.add(txarea,2,2);
		Label perimetro = new Label("Perímetro");
		parte22.add (perimetro,1,3);
		TextField txperimetro= new TextField(Integer.toString( ((i)) * (4)));
		parte22.add(txperimetro,2,3);
		this.parte2= parte22;
		getChildren().add(parte1);
		getChildren().add(parte2);
	}
	public void crearRectangulo(int i, int k , String n)
	{
		getChildren().remove(parte1);
		getChildren().remove(parte2);
		this.parte1 = new Rectangle(25, 50, i, k);
		GridPane parte22 = new GridPane();
		parte22.setPadding(new Insets(11, 12, 13, 14));
		parte22.setHgap(60);
		parte22.setVgap(5);
		parte22.setAlignment(Pos.CENTER_RIGHT);
		Label nombre = new Label("Nombre");
		parte22.add (nombre,1,1);
		TextField txnombre = new TextField(n);
		parte22.add(txnombre,2,1);
		Label area = new Label("Área");
		parte22.add (area,1,2);
		TextField txarea = new TextField(Integer.toString( ((i)) * (k)));
		parte22.add(txarea,2,2);
		Label perimetro = new Label("Perímetro");
		parte22.add (perimetro,1,3);
		TextField txperimetro= new TextField(Integer.toString( ((i) * 2) + (k) * 2));
		parte22.add(txperimetro,2,3);
		this.parte2= parte22;
		getChildren().add(parte1);
		getChildren().add(parte2);
	}
	public void crearCriculo(int i, String n)
	{
		getChildren().remove(parte1);
		getChildren().remove(parte2);
		this.parte1 = new Ellipse(25, 50, i, i);
		GridPane parte22 = new GridPane();
		parte22.setPadding(new Insets(11, 12, 13, 14));
		parte22.setHgap(60);
		parte22.setVgap(5);
		parte22.setAlignment(Pos.CENTER_RIGHT);
		Label nombre = new Label("Nombre");
		parte22.add (nombre,1,1);
		TextField txnombre = new TextField(n);
		parte22.add(txnombre,2,1);
		Label area = new Label("Área");
		parte22.add (area,1,2);
		int resArea = (int)( i * i * Math.PI) ;
		TextField txarea = new TextField(Integer.toString (resArea ));
		parte22.add(txarea,2,2);
		Label perimetro = new Label("Perímetro");
		int resPerimetro = (int)(2*Math.PI)*i;
		parte22.add (perimetro,1,3);
		TextField txperimetro= new TextField(Integer.toString(resPerimetro));
		parte22.add(txperimetro,2,3);
		this.parte2= parte22;
		getChildren().add(parte1);
		getChildren().add(parte2);
	}

	

}

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import java.util.ArrayList;

public class Calculadora extends VBox {

	private PanelQueSeLlena cuadro1;
	private GridPane cuadrado2;
	private PanelQueCrea cuadro4;
	private BorderPane cuadro5;
	private ArrayList<Cuadrado> cuadrados;
	private ArrayList<Rectangulo> rectangulos;
	private ArrayList<Circulo> circulos;
	private int indice;
	private int figuraActual;

	public Calculadora() {

		this.cuadrados = new ArrayList<Cuadrado>();
		this.rectangulos = new ArrayList<Rectangulo>();
		this.circulos = new ArrayList<Circulo>();
		PanelQueSeLlena panel1 = new PanelQueSeLlena();
		panel1.setPadding(new Insets(11, 12, 13, 14));
		panel1.setHgap(5);
		panel1.setVgap(5);
		panel1.setAlignment(Pos.CENTER);
		this.cuadro1 = panel1;

		PanelQueCrea panel4 = new PanelQueCrea();
		panel4.setPadding(new Insets(11, 12, 13, 14));
		// panel4.setHover(5);
		panel4.setAlignment(Pos.CENTER);
		this.cuadro4 = panel4;

		GridPane panel2 = new GridPane();
		Button crearCuadrado = new Button("Crear Cuadrado");
		crearCuadrado.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		crearCuadrado.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Cuadrado elementoAdd = new Cuadrado(cuadro1.getLado(), cuadro1.getNombre(), cuadro1.getColor());
				cuadrados.add(elementoAdd);

				System.out.println(cuadro1.getColor());

				panel4.crearCuadrado(cuadro1.getLado(), cuadro1.getNombre(), cuadro1.getColor());

			}
		});

		Button crearRectangulo = new Button("Crear Rectángulo");
		crearRectangulo.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		crearRectangulo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Rectangulo elementoAdd = new Rectangulo(cuadro1.getAncho(), cuadro1.getAlto(), cuadro1.getNombre(),
						cuadro1.getColor());
				rectangulos.add(elementoAdd);
				panel4.crearRectangulo(cuadro1.getAncho(), cuadro1.getAlto(), cuadro1.getNombre(), cuadro1.getColor());
			}
		});

		Button crearCirculo = new Button("Crear Círculo");
		crearCirculo.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		crearCirculo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Circulo elementoAdd = new Circulo(cuadro1.getRadio(), cuadro1.getNombre(), cuadro1.getColor());
				circulos.add(elementoAdd);
				panel4.crearCriculo(cuadro1.getRadio(), cuadro1.getNombre(), cuadro1.getColor());
			}
		});

		Button verCuadrado = new Button("ver Cuadrado");
		verCuadrado.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		verCuadrado.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				indice = 0;
				figuraActual = 1;
				panel4.crearCuadrado(cuadrados.get(indice).getLado(), cuadrados.get(indice).getNombre(),
						cuadrados.get(indice).getColor());
			}
		});
		Button verRectangulo = new Button("ver Rectángulo");
		verRectangulo.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		verRectangulo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				indice = 0;
				figuraActual = 2;
				panel4.crearRectangulo(rectangulos.get(indice).getAncho(), rectangulos.get(indice).getLargo(),
						rectangulos.get(indice).getNombre(), rectangulos.get(indice).getColor());
			}
		});
		Button verCirculo = new Button("ver Círculo");
		verCirculo.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		verCirculo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				indice = 0;
				figuraActual = 3;
				panel4.crearCriculo(circulos.get(indice).getRadio(), circulos.get(indice).getNombre(),
						circulos.get(indice).getColor());
			}
		});
		panel2.add(crearCuadrado, 0, 0);
		panel2.add(crearRectangulo, 1, 0);
		panel2.add(crearCirculo, 2, 0);
		panel2.add(verCuadrado, 0, 1);
		panel2.add(verRectangulo, 1, 1);
		panel2.add(verCirculo, 2, 1);
		panel2.setAlignment(Pos.CENTER);
		this.cuadrado2 = panel2;

		BorderPane parte5 = new BorderPane();
		Button Anterior = new Button("Anterior");
		Anterior.setFont(Font.font("Times New Roman", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR, 30));
		Anterior.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				indice--;
				if (figuraActual == 1) {
					panel4.crearCuadrado(cuadrados.get(indice).getLado(), cuadrados.get(indice).getNombre(),
							cuadrados.get(indice).getColor());
				} else if (figuraActual == 2) {
					panel4.crearRectangulo(rectangulos.get(indice).getAncho(), rectangulos.get(indice).getLargo(),
							rectangulos.get(indice).getNombre(), rectangulos.get(indice).getColor());
				} else if (figuraActual == 3) {
					panel4.crearCriculo(circulos.get(indice).getRadio(), circulos.get(indice).getNombre(),
							circulos.get(indice).getColor());
				}

			}
		});
		Button Siguiente = new Button("Siguiente");
		Siguiente.setFont(Font.font("Times New Roman", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR, 30));
		Siguiente.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				indice++;
				if (figuraActual == 1) {
					panel4.crearCuadrado(cuadrados.get(indice).getLado(), cuadrados.get(indice).getNombre(),
							cuadrados.get(indice).getColor());
				} else if (figuraActual == 2) {
					panel4.crearRectangulo(rectangulos.get(indice).getAncho(), rectangulos.get(indice).getLargo(),
							rectangulos.get(indice).getNombre(), rectangulos.get(indice).getColor());
				} else if (figuraActual == 3) {
					panel4.crearCriculo(circulos.get(indice).getRadio(), circulos.get(indice).getNombre(),
							circulos.get(indice).getColor());
				}

			}
		});

		parte5.setLeft(Anterior);
		parte5.setRight(Siguiente);
		this.cuadro5 = parte5;

		getChildren().add(cuadro1);
		getChildren().add(cuadrado2);
		getChildren().add(cuadro4);
		getChildren().add(cuadro5);

	}

}
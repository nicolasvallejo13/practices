import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class JuegoCaeBasuras extends Pane {

	private ImageView fondoSi;
	private ImageView canecaSi;
	private PathTransition pt1;
	private PathTransition pt2;
	private PathTransition pt3;
	private PathTransition pt4;
	private PathTransition pt5;
	private Text puntaje;
	private Text textoQueEsPuntaje;
	private ArrayList<ImageView> basuras;
	private ArrayList<ImageView> organicos;
	private PathTransition pt7;
	Stage primaryStage;

	public JuegoCaeBasuras(Stage primaryStage) {
		this.primaryStage = primaryStage;
		fondoSi = null;
		canecaSi = null;
		basuras = new ArrayList<ImageView>();
		organicos = new ArrayList<ImageView>();
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("Fondo.jpg");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Image fondo = new Image(fis);
		fondoSi = new ImageView(fondo);

		try {
			fis = new FileInputStream("Caneca Verde.png");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Image caneca = new Image(fis);

		canecaSi = new ImageView(caneca);
		// canecaSi = imagenCaneca;

		canecaSi.setLayoutX(550);
		canecaSi.setLayoutY(579);
		canecaSi.setFitHeight(140);
		canecaSi.setFitWidth(120);
		textoQueEsPuntaje = new Text(0, 18, "Puntaje");
		textoQueEsPuntaje.setFill(Color.RED);
		textoQueEsPuntaje.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));

		puntaje = new Text(70, 18, "0");
		puntaje.setFill(Color.RED);
		puntaje.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));

		this.getChildren().add(fondoSi);

		Button b = new Button();
		b.setLayoutY(2000);
		this.getChildren().add(b);
		b.setOnKeyPressed((event) -> {
			if (event.getCode() == KeyCode.RIGHT) {
				canecaSi.setLayoutX(canecaSi.getLayoutX() + 10);
				this.getChildren().remove(canecaSi);
				this.getChildren().add(canecaSi);
				// System.out.println("derecha");
			} else if (event.getCode() == KeyCode.LEFT) {
				canecaSi.setLayoutX(canecaSi.getLayoutX() - 10);
				this.getChildren().remove(canecaSi);
				this.getChildren().add(canecaSi);
				// System.out.println("derecha");
			}
		});

		FileInputStream filepapel = null;
		try {
			filepapel = new FileInputStream("Basura Papel.png");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Image filereadypapel = new Image(filepapel);
		ImageView basurapapel = new ImageView(filereadypapel);

		basurapapel.setFitHeight(50);
		basurapapel.setFitWidth(50);
		basuras.add(basurapapel);

		this.getChildren().add(basurapapel);

		int ramdom1 = (int) Math.floor(Math.random() * (1200));
		int ramdom2 = (int) Math.floor(Math.random() * (1200));

		pt1 = new PathTransition(Duration.millis(8000), new Line(ramdom1, 0, ramdom1, 1000), basurapapel);
		pt1.play();
		FileInputStream fileLata = null;
		try {
			fileLata = new FileInputStream("basura_Lata.png");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Image filereadylata = new Image(fileLata);
		ImageView imagenLata = new ImageView(filereadylata);
		imagenLata.setFitHeight(70);
		imagenLata.setFitWidth(40);
		basuras.add(imagenLata);
		getChildren().add(imagenLata);

		this.pt2 = new PathTransition(Duration.millis(15000), new Line(ramdom2, 0, ramdom2, 1000), imagenLata);
		pt2.play();

		FileInputStream fileManzanaPodrida = null;
		try {
			fileManzanaPodrida = new FileInputStream(
					"kisspng-apple-clip-art-rotten-meat-cliparts-5a84992329e808.8904232215186393951717.png");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		Image filereadymanzan = new Image(fileManzanaPodrida);
		ImageView imagenManzana = new ImageView(filereadymanzan);
		imagenManzana.setFitHeight(60);
		imagenManzana.setFitWidth(60);
		organicos.add(imagenManzana);
		ramdom1 = (int) Math.floor(Math.random() * (1200));
		getChildren().add(imagenManzana);

		this.pt5 = new PathTransition(Duration.millis(9000), new Line(ramdom1, 0, ramdom1, 1000), imagenManzana);
		pt5.play();

		FileInputStream fileCarton = null;
		try {
			fileCarton = new FileInputStream("Basura Carton.png");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Image filereadycarton = new Image(fileCarton);
		ImageView imagenCarton = new ImageView(filereadycarton);
		imagenCarton.setFitHeight(60);
		imagenCarton.setFitWidth(60);
		basuras.add(imagenCarton);
		ramdom1 = (int) Math.floor(Math.random() * (1200));

		this.pt3 = new PathTransition(Duration.millis(9000), new Line(ramdom1, 0, ramdom1, 1000), imagenCarton);

		FileInputStream fileQueso = null;
		try {
			fileQueso = new FileInputStream("basura queso,png.png");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		Image filereadyqueso = new Image(fileQueso);
		ImageView imagenQueso = new ImageView(filereadyqueso);
		imagenQueso.setFitHeight(60);
		imagenQueso.setFitWidth(60);
		organicos.add(imagenQueso);
		ramdom1 = (int) Math.floor(Math.random() * (1200));

		PathTransition pt6 = new PathTransition(Duration.millis(6000), new Line(ramdom1, 0, ramdom1, 1000),
				imagenQueso);

		Timeline lanzar2daBasura = new Timeline(new KeyFrame(Duration.millis(10000), (new EventHandler<ActionEvent>() {

			@Override // Override the handle method
			public void handle(ActionEvent e) {
				getChildren().add(imagenCarton);
				getChildren().add(imagenQueso);
				pt3.play();
				pt6.play();
				ImageView basurapapel = new ImageView(filereadypapel);
				int ramdom1 = (int) Math.floor(Math.random() * (1200));

				basurapapel.setFitHeight(50);
				basurapapel.setFitWidth(50);
				basuras.add(basurapapel);
				getChildren().add(basurapapel);
				pt1 = new PathTransition(Duration.millis(12000), new Line(ramdom1, 0, ramdom1, 1000), basurapapel);
				pt1.play();

				int ramdom2 = (int) Math.floor(Math.random() * (1200));
				int ramdom3 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenLata = new ImageView(filereadylata);
				imagenLata.setFitHeight(70);
				imagenLata.setFitWidth(40);
				basuras.add(imagenLata);
				getChildren().add(imagenLata);
				PathTransition pt4 = new PathTransition(Duration.millis(15000), new Line(ramdom2, 0, ramdom3, 1000),
						imagenLata);
				pt4.play();

				int ramdom4 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenManzana = new ImageView(filereadymanzan);
				imagenManzana.setFitHeight(60);
				imagenManzana.setFitWidth(60);
				organicos.add(imagenManzana);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenManzana);

				PathTransition pt5 = new PathTransition(Duration.millis(11000), new Line(ramdom4, 0, ramdom4, 1000),
						imagenManzana);
				pt5.play();

			}
		})));
		lanzar2daBasura.setCycleCount(1);
		lanzar2daBasura.play();

		FileInputStream filePlastico = null;
		try {
			filePlastico = new FileInputStream("Basura Plastico.png");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Image filereadyplastico = new Image(filePlastico);
		ImageView imagenPlastico = new ImageView(filereadyplastico);
		imagenPlastico.setFitHeight(60);
		imagenPlastico.setFitWidth(60);
		basuras.add(imagenPlastico);
		ramdom1 = (int) Math.floor(Math.random() * (1200));

		this.pt4 = new PathTransition(Duration.millis(9000), new Line(ramdom1, 0, ramdom1, 1000), imagenPlastico);

		Timeline lanzar3raBasura = new Timeline(new KeyFrame(Duration.millis(20000), (new EventHandler<ActionEvent>() {

			@Override // Override the handle method
			public void handle(ActionEvent e) {
				getChildren().add(imagenPlastico);
				pt4.play();
				ImageView basurapapel = new ImageView(filereadypapel);
				int ramdom1 = (int) Math.floor(Math.random() * (1200));

				basurapapel.setFitHeight(50);
				basurapapel.setFitWidth(50);
				basuras.add(basurapapel);
				getChildren().add(basurapapel);
				pt1 = new PathTransition(Duration.millis(12000), new Line(ramdom1, 0, ramdom1, 1000), basurapapel);
				pt1.play();

				int ramdom2 = (int) Math.floor(Math.random() * (1200));
				int ramdom3 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenLata = new ImageView(filereadylata);
				imagenLata.setFitHeight(70);
				imagenLata.setFitWidth(40);
				basuras.add(imagenLata);
				getChildren().add(imagenLata);
				PathTransition pt4 = new PathTransition(Duration.millis(15000), new Line(ramdom2, 0, ramdom3, 1000),
						imagenLata);
				pt4.play();

				ImageView imagenCarton = new ImageView(filereadycarton);
				imagenCarton.setFitHeight(60);
				imagenCarton.setFitWidth(60);
				basuras.add(imagenCarton);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenCarton);

				PathTransition pt3 = new PathTransition(Duration.millis(9000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenCarton);
				pt3.play();

				int ramdom4 = (int) Math.floor(Math.random() * (1200));
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenManzana = new ImageView(filereadymanzan);
				imagenManzana.setFitHeight(60);
				imagenManzana.setFitWidth(60);
				organicos.add(imagenManzana);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenManzana);

				PathTransition pt5 = new PathTransition(Duration.millis(15000), new Line(ramdom1, 0, ramdom4, 1000),
						imagenManzana);
				pt5.play();

				ImageView imagenQueso = new ImageView(filereadyqueso);
				imagenQueso.setFitHeight(60);
				imagenQueso.setFitWidth(60);
				organicos.add(imagenQueso);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenQueso);

				PathTransition pt6 = new PathTransition(Duration.millis(9000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenQueso);
				pt6.play();

			}
		})));
		lanzar3raBasura.setCycleCount(1);
		lanzar3raBasura.play();

		FileInputStream fileHuevo = null;
		try {
			fileHuevo = new FileInputStream("Imagen Huevo.png");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Image filereadHuevo = new Image(fileHuevo);
		ImageView imagenHuevo = new ImageView(filereadHuevo);
		imagenHuevo.setFitHeight(60);
		imagenHuevo.setFitWidth(100);
		organicos.add(imagenHuevo);
		ramdom1 = (int) Math.floor(Math.random() * (1200));

		this.pt7 = new PathTransition(Duration.millis(9000), new Line(ramdom1, 0, ramdom1, 1000), imagenHuevo);

		Timeline lanzar4taBasura = new Timeline(new KeyFrame(Duration.millis(24000), (new EventHandler<ActionEvent>() {

			@Override // Override the handle method
			public void handle(ActionEvent e) {
				getChildren().add(imagenHuevo);

				ImageView basurapapel = new ImageView(filereadypapel);
				int ramdom1 = (int) Math.floor(Math.random() * (1200));
				pt7.play();
				basurapapel.setFitHeight(50);
				basurapapel.setFitWidth(50);
				basuras.add(basurapapel);
				getChildren().add(basurapapel);
				pt1 = new PathTransition(Duration.millis(7000), new Line(ramdom1, 0, ramdom1, 1000), basurapapel);
				pt1.play();

				int ramdom2 = (int) Math.floor(Math.random() * (1200));
				int ramdom3 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenLata = new ImageView(filereadylata);
				imagenLata.setFitHeight(70);
				imagenLata.setFitWidth(40);
				basuras.add(imagenLata);
				getChildren().add(imagenLata);
				PathTransition pt4 = new PathTransition(Duration.millis(10000), new Line(ramdom2, 0, ramdom3, 1000),
						imagenLata);
				pt4.play();

				ImageView imagenCarton = new ImageView(filereadycarton);
				imagenCarton.setFitHeight(60);
				imagenCarton.setFitWidth(60);
				basuras.add(imagenCarton);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenCarton);

				PathTransition pt3 = new PathTransition(Duration.millis(8000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenCarton);
				pt3.play();

				int ramdom4 = (int) Math.floor(Math.random() * (1200));
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenManzana = new ImageView(filereadymanzan);
				imagenManzana.setFitHeight(60);
				imagenManzana.setFitWidth(60);
				organicos.add(imagenManzana);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenManzana);

				PathTransition pt5 = new PathTransition(Duration.millis(8000), new Line(ramdom1, 0, ramdom4, 1000),
						imagenManzana);
				pt5.play();

				ImageView imagenQueso = new ImageView(filereadyqueso);
				imagenQueso.setFitHeight(60);
				imagenQueso.setFitWidth(60);
				organicos.add(imagenQueso);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenQueso);

				PathTransition pt6 = new PathTransition(Duration.millis(9000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenQueso);
				pt6.play();

				ImageView imagenPlastico = new ImageView(filereadyplastico);
				imagenPlastico.setFitHeight(60);
				imagenPlastico.setFitWidth(60);
				basuras.add(imagenPlastico);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenPlastico);

				PathTransition ptr = new PathTransition(Duration.millis(10000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenPlastico);
				ptr.play();
			}
		})));
		lanzar4taBasura.setCycleCount(1);
		lanzar4taBasura.play();

		Timeline lanzar5taBasura = new Timeline(new KeyFrame(Duration.millis(30000), (new EventHandler<ActionEvent>() {

			@Override // Override the handle method
			public void handle(ActionEvent e) {

				ImageView basurapapel = new ImageView(filereadypapel);
				int ramdom1 = (int) Math.floor(Math.random() * (1200));
				basurapapel.setFitHeight(50);
				basurapapel.setFitWidth(50);
				basuras.add(basurapapel);
				getChildren().add(basurapapel);
				pt1 = new PathTransition(Duration.millis(7000), new Line(ramdom1, 0, ramdom1, 1000), basurapapel);
				pt1.play();

				int ramdom2 = (int) Math.floor(Math.random() * (1200));
				int ramdom3 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenLata = new ImageView(filereadylata);
				imagenLata.setFitHeight(70);
				imagenLata.setFitWidth(40);
				basuras.add(imagenLata);
				getChildren().add(imagenLata);
				PathTransition pt4 = new PathTransition(Duration.millis(10000), new Line(ramdom2, 0, ramdom3, 1000),
						imagenLata);
				pt4.play();

				ImageView imagenPlastico = new ImageView(filereadyplastico);
				imagenPlastico.setFitHeight(60);
				imagenPlastico.setFitWidth(60);
				basuras.add(imagenPlastico);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenPlastico);

				PathTransition ptr = new PathTransition(Duration.millis(10000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenPlastico);
				ptr.play();

				ImageView imagenCarton = new ImageView(filereadycarton);
				imagenCarton.setFitHeight(60);
				imagenCarton.setFitWidth(60);
				basuras.add(imagenCarton);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenCarton);

				PathTransition pt3 = new PathTransition(Duration.millis(8000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenCarton);
				pt3.play();

				int ramdom4 = (int) Math.floor(Math.random() * (1200));
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenManzana = new ImageView(filereadymanzan);
				imagenManzana.setFitHeight(60);
				imagenManzana.setFitWidth(60);
				organicos.add(imagenManzana);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenManzana);

				PathTransition pt5 = new PathTransition(Duration.millis(8000), new Line(ramdom1, 0, ramdom4, 1000),
						imagenManzana);
				pt5.play();

				ImageView imagenQueso = new ImageView(filereadyqueso);
				imagenQueso.setFitHeight(60);
				imagenQueso.setFitWidth(60);
				organicos.add(imagenQueso);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenQueso);

				PathTransition pt6 = new PathTransition(Duration.millis(9000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenQueso);
				pt6.play();

				ImageView imagenHuevo = new ImageView(filereadHuevo);
				imagenHuevo.setFitHeight(60);
				imagenHuevo.setFitWidth(120);
				organicos.add(imagenHuevo);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenHuevo);

				PathTransition pt7 = new PathTransition(Duration.millis(9000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenHuevo);
				pt7.play();

			}
		})));
		lanzar5taBasura.setCycleCount(1);
		lanzar5taBasura.play();

		Timeline lanzar6taBasura = new Timeline(new KeyFrame(Duration.millis(35000), (new EventHandler<ActionEvent>() {

			@Override // Override the handle method
			public void handle(ActionEvent e) {

				ImageView basurapapel = new ImageView(filereadypapel);
				int ramdom1 = (int) Math.floor(Math.random() * (1200));
				int ramdom2 = (int) Math.floor(Math.random() * (1200));
				basurapapel.setFitHeight(50);
				basurapapel.setFitWidth(50);
				basuras.add(basurapapel);
				getChildren().add(basurapapel);
				pt1 = new PathTransition(Duration.millis(7000), new Line(ramdom1, 0, ramdom2, 1000), basurapapel);
				pt1.play();

				ramdom2 = (int) Math.floor(Math.random() * (1200));

				ImageView imagenLata = new ImageView(filereadylata);
				imagenLata.setFitHeight(70);
				imagenLata.setFitWidth(40);
				basuras.add(imagenLata);
				getChildren().add(imagenLata);
				PathTransition pt4 = new PathTransition(Duration.millis(10000), new Line(ramdom2, 0, ramdom2, 1000),
						imagenLata);
				pt4.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenCarton = new ImageView(filereadycarton);
				imagenCarton.setFitHeight(60);
				imagenCarton.setFitWidth(60);
				basuras.add(imagenCarton);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenCarton);

				PathTransition pt3 = new PathTransition(Duration.millis(8900), new Line(ramdom1, 0, ramdom2, 1000),
						imagenCarton);
				pt3.play();
				ImageView imagenPlastico = new ImageView(filereadyplastico);
				imagenPlastico.setFitHeight(60);
				imagenPlastico.setFitWidth(60);
				basuras.add(imagenPlastico);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenPlastico);

				PathTransition ptr = new PathTransition(Duration.millis(10000), new Line(ramdom1, 0, ramdom2, 1000),
						imagenPlastico);
				ptr.play();

				ramdom2 = (int) Math.floor(Math.random() * (1200));
				int ramdom4 = (int) Math.floor(Math.random() * (1200));
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenManzana = new ImageView(filereadymanzan);
				imagenManzana.setFitHeight(60);
				imagenManzana.setFitWidth(60);
				organicos.add(imagenManzana);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenManzana);

				PathTransition pt5 = new PathTransition(Duration.millis(8000), new Line(ramdom2, 0, ramdom4, 1000),
						imagenManzana);
				pt5.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenQueso = new ImageView(filereadyqueso);
				imagenQueso.setFitHeight(60);
				imagenQueso.setFitWidth(60);
				organicos.add(imagenQueso);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenQueso);

				PathTransition pt6 = new PathTransition(Duration.millis(5000), new Line(ramdom1, 0, ramdom2, 1000),
						imagenQueso);
				pt6.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenHuevo = new ImageView(filereadHuevo);
				imagenHuevo.setFitHeight(60);
				imagenHuevo.setFitWidth(120);
				organicos.add(imagenHuevo);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenHuevo);

				PathTransition pt7 = new PathTransition(Duration.millis(15000), new Line(ramdom1, 0, ramdom2, 1000),
						imagenHuevo);
				pt7.play();

			}
		})));
		lanzar6taBasura.setCycleCount(1);
		lanzar6taBasura.play();

		Timeline lanzar7maBasura = new Timeline(new KeyFrame(Duration.millis(42000), (new EventHandler<ActionEvent>() {

			@Override // Override the handle method
			public void handle(ActionEvent e) {

				ImageView basurapapel = new ImageView(filereadypapel);
				int ramdom1 = (int) Math.floor(Math.random() * (1200));

				basurapapel.setFitHeight(50);
				basurapapel.setFitWidth(50);
				basuras.add(basurapapel);
				getChildren().add(basurapapel);
				pt1 = new PathTransition(Duration.millis(7500), new Line(ramdom1, 0, ramdom1, 1000), basurapapel);
				pt1.play();

				int ramdom2 = (int) Math.floor(Math.random() * (1200));

				ImageView imagenLata = new ImageView(filereadylata);
				imagenLata.setFitHeight(70);
				imagenLata.setFitWidth(40);
				basuras.add(imagenLata);
				getChildren().add(imagenLata);
				PathTransition pt4 = new PathTransition(Duration.millis(9000), new Line(ramdom2, 0, ramdom2, 1000),
						imagenLata);
				pt4.play();

				ImageView imagenPlastico = new ImageView(filereadyplastico);
				imagenPlastico.setFitHeight(60);
				imagenPlastico.setFitWidth(60);
				basuras.add(imagenPlastico);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenPlastico);

				PathTransition ptr = new PathTransition(Duration.millis(6000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenPlastico);
				ptr.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenCarton = new ImageView(filereadycarton);
				imagenCarton.setFitHeight(60);
				imagenCarton.setFitWidth(60);
				basuras.add(imagenCarton);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenCarton);

				PathTransition pt3 = new PathTransition(Duration.millis(8900), new Line(ramdom1, 0, ramdom1, 1000),
						imagenCarton);
				pt3.play();

				ramdom2 = (int) Math.floor(Math.random() * (1200));

				ramdom1 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenManzana = new ImageView(filereadymanzan);
				imagenManzana.setFitHeight(60);
				imagenManzana.setFitWidth(60);
				organicos.add(imagenManzana);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenManzana);

				PathTransition pt5 = new PathTransition(Duration.millis(9000), new Line(ramdom2, 0, ramdom2, 1000),
						imagenManzana);
				pt5.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenQueso = new ImageView(filereadyqueso);
				imagenQueso.setFitHeight(60);
				imagenQueso.setFitWidth(60);
				organicos.add(imagenQueso);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenQueso);

				PathTransition pt6 = new PathTransition(Duration.millis(6900), new Line(ramdom1, 0, ramdom1, 1000),
						imagenQueso);
				pt6.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenHuevo = new ImageView(filereadHuevo);
				imagenHuevo.setFitHeight(60);
				imagenHuevo.setFitWidth(120);
				organicos.add(imagenHuevo);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenHuevo);

				PathTransition pt7 = new PathTransition(Duration.millis(10000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenHuevo);
				pt7.play();

			}
		})));
		lanzar7maBasura.setCycleCount(1);
		lanzar7maBasura.play();

		Timeline lanzar8vaBasura = new Timeline(new KeyFrame(Duration.millis(45000), (new EventHandler<ActionEvent>() {

			@Override // Override the handle method
			public void handle(ActionEvent e) {

				ImageView basurapapel = new ImageView(filereadypapel);
				int ramdom1 = (int) Math.floor(Math.random() * (1200));

				basurapapel.setFitHeight(50);
				basurapapel.setFitWidth(50);
				basuras.add(basurapapel);
				getChildren().add(basurapapel);
				pt1 = new PathTransition(Duration.millis(15500), new Line(ramdom1, 0, ramdom1, 1000), basurapapel);
				pt1.play();

				int ramdom2 = (int) Math.floor(Math.random() * (1200));

				ImageView imagenLata = new ImageView(filereadylata);
				imagenLata.setFitHeight(70);
				imagenLata.setFitWidth(40);
				basuras.add(imagenLata);
				getChildren().add(imagenLata);
				PathTransition pt4 = new PathTransition(Duration.millis(9000), new Line(ramdom2, 0, ramdom2, 1000),
						imagenLata);
				pt4.play();

				ImageView imagenPlastico = new ImageView(filereadyplastico);
				imagenPlastico.setFitHeight(60);
				imagenPlastico.setFitWidth(60);
				basuras.add(imagenPlastico);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenPlastico);

				PathTransition ptr = new PathTransition(Duration.millis(13300), new Line(ramdom1, 0, ramdom1, 1000),
						imagenPlastico);
				ptr.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenCarton = new ImageView(filereadycarton);
				imagenCarton.setFitHeight(60);
				imagenCarton.setFitWidth(60);
				basuras.add(imagenCarton);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenCarton);

				PathTransition pt3 = new PathTransition(Duration.millis(8900), new Line(ramdom1, 0, ramdom1, 1000),
						imagenCarton);
				pt3.play();

				ramdom2 = (int) Math.floor(Math.random() * (1200));
				int ramdom4 = (int) Math.floor(Math.random() * (1200));
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenManzana = new ImageView(filereadymanzan);
				imagenManzana.setFitHeight(60);
				imagenManzana.setFitWidth(60);
				organicos.add(imagenManzana);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenManzana);

				PathTransition pt5 = new PathTransition(Duration.millis(9000), new Line(ramdom2, 0, ramdom2, 1000),
						imagenManzana);
				pt5.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenQueso = new ImageView(filereadyqueso);
				imagenQueso.setFitHeight(60);
				imagenQueso.setFitWidth(60);
				organicos.add(imagenQueso);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenQueso);

				PathTransition pt6 = new PathTransition(Duration.millis(4000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenQueso);
				pt6.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenHuevo = new ImageView(filereadHuevo);
				imagenHuevo.setFitHeight(60);
				imagenHuevo.setFitWidth(120);
				organicos.add(imagenHuevo);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenHuevo);

				PathTransition pt7 = new PathTransition(Duration.millis(4600), new Line(ramdom1, 0, ramdom1, 1000),
						imagenHuevo);
				pt7.play();

			}
		})));
		lanzar8vaBasura.setCycleCount(1);
		lanzar8vaBasura.play();

		Timeline lanzar9naBasura = new Timeline(new KeyFrame(Duration.millis(50000), (new EventHandler<ActionEvent>() {

			@Override // Override the handle method
			public void handle(ActionEvent e) {

				ImageView basurapapel = new ImageView(filereadypapel);
				int ramdom1 = (int) Math.floor(Math.random() * (1200));

				basurapapel.setFitHeight(50);
				basurapapel.setFitWidth(50);
				basuras.add(basurapapel);
				getChildren().add(basurapapel);
				pt1 = new PathTransition(Duration.millis(12500), new Line(ramdom1, 0, ramdom1, 1000), basurapapel);
				pt1.play();

				int ramdom2 = (int) Math.floor(Math.random() * (1200));

				ImageView imagenLata = new ImageView(filereadylata);
				imagenLata.setFitHeight(70);
				imagenLata.setFitWidth(40);
				basuras.add(imagenLata);
				getChildren().add(imagenLata);
				PathTransition pt4 = new PathTransition(Duration.millis(8000), new Line(ramdom2, 0, ramdom2, 1000),
						imagenLata);
				pt4.play();

				ImageView imagenPlastico = new ImageView(filereadyplastico);
				imagenPlastico.setFitHeight(60);
				imagenPlastico.setFitWidth(60);
				basuras.add(imagenPlastico);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenPlastico);

				PathTransition ptr = new PathTransition(Duration.millis(9000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenPlastico);
				ptr.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenCarton = new ImageView(filereadycarton);
				imagenCarton.setFitHeight(60);
				imagenCarton.setFitWidth(60);
				basuras.add(imagenCarton);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenCarton);

				PathTransition pt3 = new PathTransition(Duration.millis(1000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenCarton);
				pt3.play();

				ramdom2 = (int) Math.floor(Math.random() * (1200));

				ramdom1 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenManzana = new ImageView(filereadymanzan);
				imagenManzana.setFitHeight(60);
				imagenManzana.setFitWidth(60);
				organicos.add(imagenManzana);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenManzana);

				PathTransition pt5 = new PathTransition(Duration.millis(11000), new Line(ramdom2, 0, ramdom2, 1000),
						imagenManzana);
				pt5.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenQueso = new ImageView(filereadyqueso);
				imagenQueso.setFitHeight(60);
				imagenQueso.setFitWidth(60);
				organicos.add(imagenQueso);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenQueso);

				PathTransition pt6 = new PathTransition(Duration.millis(7000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenQueso);
				pt6.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenHuevo = new ImageView(filereadHuevo);
				imagenHuevo.setFitHeight(60);
				imagenHuevo.setFitWidth(120);
				organicos.add(imagenHuevo);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenHuevo);

				PathTransition pt7 = new PathTransition(Duration.millis(3000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenHuevo);
				pt7.play();

			}
		})));
		lanzar9naBasura.setCycleCount(1);
		lanzar9naBasura.play();

		Timeline lanzar10maBasura = new Timeline(new KeyFrame(Duration.millis(54000), (new EventHandler<ActionEvent>() {

			@Override // Override the handle method
			public void handle(ActionEvent e) {

				ImageView basurapapel = new ImageView(filereadypapel);
				int ramdom1 = (int) Math.floor(Math.random() * (1200));

				basurapapel.setFitHeight(50);
				basurapapel.setFitWidth(50);
				basuras.add(basurapapel);
				getChildren().add(basurapapel);
				pt1 = new PathTransition(Duration.millis(10500), new Line(ramdom1, 0, ramdom1, 1000), basurapapel);
				pt1.play();

				int ramdom2 = (int) Math.floor(Math.random() * (1200));

				ImageView imagenLata = new ImageView(filereadylata);
				imagenLata.setFitHeight(70);
				imagenLata.setFitWidth(40);
				basuras.add(imagenLata);
				getChildren().add(imagenLata);
				PathTransition pt4 = new PathTransition(Duration.millis(7000), new Line(ramdom2, 0, ramdom2, 1000),
						imagenLata);
				pt4.play();

				ImageView imagenPlastico = new ImageView(filereadyplastico);
				imagenPlastico.setFitHeight(60);
				imagenPlastico.setFitWidth(60);
				basuras.add(imagenPlastico);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenPlastico);

				PathTransition ptr = new PathTransition(Duration.millis(9000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenPlastico);
				ptr.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenCarton = new ImageView(filereadycarton);
				imagenCarton.setFitHeight(60);
				imagenCarton.setFitWidth(60);
				basuras.add(imagenCarton);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenCarton);

				PathTransition pt3 = new PathTransition(Duration.millis(1000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenCarton);
				pt3.play();

				ramdom2 = (int) Math.floor(Math.random() * (1200));

				ramdom1 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenManzana = new ImageView(filereadymanzan);
				imagenManzana.setFitHeight(60);
				imagenManzana.setFitWidth(60);
				organicos.add(imagenManzana);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenManzana);

				PathTransition pt5 = new PathTransition(Duration.millis(7000), new Line(ramdom2, 0, ramdom2, 1000),
						imagenManzana);
				pt5.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenQueso = new ImageView(filereadyqueso);
				imagenQueso.setFitHeight(60);
				imagenQueso.setFitWidth(60);
				organicos.add(imagenQueso);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenQueso);

				PathTransition pt6 = new PathTransition(Duration.millis(7900), new Line(ramdom1, 0, ramdom1, 1000),
						imagenQueso);
				pt6.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenHuevo = new ImageView(filereadHuevo);
				imagenHuevo.setFitHeight(60);
				imagenHuevo.setFitWidth(120);
				organicos.add(imagenHuevo);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenHuevo);

				PathTransition pt7 = new PathTransition(Duration.millis(1000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenHuevo);
				pt7.play();

			}
		})));
		lanzar10maBasura.setCycleCount(1);
		lanzar10maBasura.play();

		Timeline lanzar11vaBasura = new Timeline(new KeyFrame(Duration.millis(58000), (new EventHandler<ActionEvent>() {

			@Override // Override the handle method
			public void handle(ActionEvent e) {

				ImageView basurapapel = new ImageView(filereadypapel);
				int ramdom1 = (int) Math.floor(Math.random() * (1200));

				basurapapel.setFitHeight(50);
				basurapapel.setFitWidth(50);
				basuras.add(basurapapel);
				getChildren().add(basurapapel);
				pt1 = new PathTransition(Duration.millis(9500), new Line(ramdom1, 0, ramdom1, 1000), basurapapel);
				pt1.play();

				int ramdom2 = (int) Math.floor(Math.random() * (1200));

				ImageView imagenLata = new ImageView(filereadylata);
				imagenLata.setFitHeight(70);
				imagenLata.setFitWidth(40);
				basuras.add(imagenLata);
				getChildren().add(imagenLata);
				PathTransition pt4 = new PathTransition(Duration.millis(10000), new Line(ramdom2, 0, ramdom2, 1000),
						imagenLata);
				pt4.play();

				ImageView imagenPlastico = new ImageView(filereadyplastico);
				imagenPlastico.setFitHeight(60);
				imagenPlastico.setFitWidth(60);
				basuras.add(imagenPlastico);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenPlastico);

				PathTransition ptr = new PathTransition(Duration.millis(9000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenPlastico);
				ptr.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenCarton = new ImageView(filereadycarton);
				imagenCarton.setFitHeight(60);
				imagenCarton.setFitWidth(60);
				basuras.add(imagenCarton);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenCarton);

				PathTransition pt3 = new PathTransition(Duration.millis(11700), new Line(ramdom1, 0, ramdom1, 1000),
						imagenCarton);
				pt3.play();

				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenManzana = new ImageView(filereadymanzan);
				imagenManzana.setFitHeight(60);
				imagenManzana.setFitWidth(60);
				organicos.add(imagenManzana);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenManzana);

				PathTransition pt5 = new PathTransition(Duration.millis(9000), new Line(ramdom2, 0, ramdom2, 1000),
						imagenManzana);
				pt5.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenQueso = new ImageView(filereadyqueso);
				imagenQueso.setFitHeight(60);
				imagenQueso.setFitWidth(60);
				organicos.add(imagenQueso);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenQueso);

				PathTransition pt6 = new PathTransition(Duration.millis(8500), new Line(ramdom1, 0, ramdom1, 1000),
						imagenQueso);
				pt6.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenHuevo = new ImageView(filereadHuevo);
				imagenHuevo.setFitHeight(60);
				imagenHuevo.setFitWidth(120);
				organicos.add(imagenHuevo);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenHuevo);

				PathTransition pt7 = new PathTransition(Duration.millis(10550), new Line(ramdom1, 0, ramdom1, 1000),
						imagenHuevo);
				pt7.play();

			}
		})));
		lanzar11vaBasura.setCycleCount(1);
		lanzar11vaBasura.play();

		Timeline lanzar12vaBasura = new Timeline(new KeyFrame(Duration.millis(63000), (new EventHandler<ActionEvent>() {

			@Override // Override the handle method
			public void handle(ActionEvent e) {

				ImageView basurapapel = new ImageView(filereadypapel);
				int ramdom1 = (int) Math.floor(Math.random() * (1200));

				basurapapel.setFitHeight(50);
				basurapapel.setFitWidth(50);
				basuras.add(basurapapel);
				getChildren().add(basurapapel);
				pt1 = new PathTransition(Duration.millis(10000), new Line(ramdom1, 0, ramdom1, 1000), basurapapel);
				pt1.play();

				int ramdom2 = (int) Math.floor(Math.random() * (1200));

				ImageView imagenLata = new ImageView(filereadylata);
				imagenLata.setFitHeight(70);
				imagenLata.setFitWidth(40);
				basuras.add(imagenLata);
				getChildren().add(imagenLata);
				PathTransition pt4 = new PathTransition(Duration.millis(12000), new Line(ramdom2, 0, ramdom2, 1000),
						imagenLata);
				pt4.play();

				ImageView imagenPlastico = new ImageView(filereadyplastico);
				imagenPlastico.setFitHeight(60);
				imagenPlastico.setFitWidth(60);
				basuras.add(imagenPlastico);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenPlastico);

				PathTransition ptr = new PathTransition(Duration.millis(15000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenPlastico);
				ptr.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenCarton = new ImageView(filereadycarton);
				imagenCarton.setFitHeight(60);
				imagenCarton.setFitWidth(60);
				basuras.add(imagenCarton);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenCarton);

				PathTransition pt3 = new PathTransition(Duration.millis(17000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenCarton);
				pt3.play();

				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenManzana = new ImageView(filereadymanzan);
				imagenManzana.setFitHeight(60);
				imagenManzana.setFitWidth(60);
				organicos.add(imagenManzana);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenManzana);

				PathTransition pt5 = new PathTransition(Duration.millis(9000), new Line(ramdom2, 0, ramdom2, 1000),
						imagenManzana);
				pt5.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenQueso = new ImageView(filereadyqueso);
				imagenQueso.setFitHeight(60);
				imagenQueso.setFitWidth(60);
				organicos.add(imagenQueso);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenQueso);

				PathTransition pt6 = new PathTransition(Duration.millis(12000), new Line(ramdom1, 0, ramdom1, 1000),
						imagenQueso);
				pt6.play();
				ramdom2 = (int) Math.floor(Math.random() * (1200));
				ImageView imagenHuevo = new ImageView(filereadHuevo);
				imagenHuevo.setFitHeight(60);
				imagenHuevo.setFitWidth(120);
				organicos.add(imagenHuevo);
				ramdom1 = (int) Math.floor(Math.random() * (1200));
				getChildren().add(imagenHuevo);

				PathTransition pt7 = new PathTransition(Duration.millis(15550), new Line(ramdom1, 0, ramdom1, 1000),
						imagenHuevo);
				pt7.play();

			}
		})));
		lanzar12vaBasura.setCycleCount(1);
		lanzar12vaBasura.play();

		Timeline acabarJuego = new Timeline(new KeyFrame(Duration.millis(75000), (new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				getChildren().remove(canecaSi);

				getChildren().remove(textoQueEsPuntaje);
				getChildren().remove(puntaje);
				Text puntajeFinal = new Text("tu puntaje ha sido: " + puntaje.getText());
				puntajeFinal.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 100));
				puntajeFinal.setLayoutX(10);

				puntajeFinal.setLayoutY(600);
				getChildren().add(puntajeFinal);

				GuardaPuntaje grid = new GuardaPuntaje(puntaje.getText());
				grid.setLayoutX(500);
				getChildren().add(grid);

				Button botonAtras = new Button("Atrás");
				botonAtras.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent e) {
						getChildren().removeAll(puntajeFinal, puntaje);
						Inicio i = new Inicio(JuegoCaeBasuras.this.primaryStage);
						JuegoCaeBasuras.this.primaryStage.setScene(new Scene(i));
						

					}
				});

				getChildren().add(botonAtras);

			}
		})));

		acabarJuego.setCycleCount(1);
		acabarJuego.play();
		EventHandler<ActionEvent> imprimirPuntaje = (e) -> {
			for (int i = 0; i != basuras.size(); i++) {
				System.out.println(canecaSi.getLayoutX());

				int coordenadaCanecaX = (int) canecaSi.getLayoutX();
				int coordenadaBasuraX = (int) basuras.get(i).getTranslateX();
				int coordenadaCanecaY = (int) canecaSi.getLayoutY();
				int coordenadaBasuraY = (int) basuras.get(i).getTranslateY();
				if (coordenadaBasuraY >= 789)
					coordenadaBasuraY = 25;
				boolean cercaniaenX = false;
				if (coordenadaBasuraX < coordenadaCanecaX) {
					if (coordenadaCanecaX - coordenadaBasuraX <= 25) {
						cercaniaenX = true;
					}

				} else {
					if (coordenadaBasuraX - coordenadaCanecaX <= 70) {
						cercaniaenX = true;
					}

				}

				if (cercaniaenX && (coordenadaCanecaY - coordenadaBasuraY) < 15) {

					puntaje.setText(Integer.toString(5 + Integer.parseInt(puntaje.getText())));
					getChildren().remove(basuras.get(i));
					basuras.remove(basuras.get(i));

				}

			}
			for (int i = 0; i != organicos.size(); i++) {
				int coordenadaOrganicoX = (int) organicos.get(i).getTranslateX();
				int coordenadaOrganicoY = (int) organicos.get(i).getTranslateY();
				if (coordenadaOrganicoY >= 620)
					coordenadaOrganicoY = 25;

				int coordenadaCanecaX = (int) canecaSi.getLayoutX();
				int coordenadaCanecaY = (int) canecaSi.getLayoutY();

				boolean cercaniaenXOrganico = false;
				if (coordenadaOrganicoX < coordenadaCanecaX) {
					if (coordenadaCanecaX - coordenadaOrganicoX <= 25) {
						cercaniaenXOrganico = true;
					}

				} else {
					if (coordenadaOrganicoX - coordenadaCanecaX <= 60) {
						cercaniaenXOrganico = true;
					}

				}
				if (cercaniaenXOrganico && (coordenadaCanecaY - coordenadaOrganicoY) < 10) {
					System.out.println("caneca " + coordenadaCanecaY + "caneca " + coordenadaOrganicoY);
					puntaje.setText(Integer.toString(Integer.parseInt(puntaje.getText()) - 10));
					getChildren().remove(organicos.get(i));
					organicos.remove(organicos.get(i));

				}
			}

		};

		Timeline animation = new Timeline(new KeyFrame(Duration.millis(10), imprimirPuntaje));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
		getChildren().add(puntaje);
		getChildren().add(textoQueEsPuntaje);
		this.getChildren().add(canecaSi);

	}

}

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class PanelPrincipal extends VBox {

	private PanelResumen panelResumen;
	private PanelQueRegistra panelRegistro;
	private PanelDeMovimientos panelMovimientos;
	private HBox panelDeSiguienteYAntes;
	private int contador;
	private Text textoDeMovimientos;
	private Text textoDeMovimientosaHacer;

	public PanelPrincipal() {
		textoDeMovimientos = new Text("REGISTRO MOVIMIENTOS DE LA CUENTA");
		textoDeMovimientos.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
		textoDeMovimientosaHacer = new Text("REGISTRAR MOVIMIENTOS EN LA CUENTA");
		textoDeMovimientosaHacer.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 39));

		textoDeMovimientos.setLayoutX(400);

		contador = 0;
		panelMovimientos = new PanelDeMovimientos("Usuarios/Nicolás Vallejo.txt");
		panelRegistro = new PanelQueRegistra("Usuarios/Nicolás Vallejo.txt");
		panelRegistro.setAlignment(Pos.CENTER);
		panelMovimientos.setAlignment(Pos.CENTER);
		panelResumen = new PanelResumen();
		panelResumen.setAlignment(Pos.CENTER);

		Timeline validar = new Timeline(new KeyFrame(Duration.millis(100), (new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				panelMovimientos.setRutaArchivo("Usuarios/" + panelResumen.queArchivoSeSelecciono());
				panelRegistro.setRutaArchivo("Usuarios/" + panelResumen.queArchivoSeSelecciono());
				panelMovimientos.Actualizador(contador);
				panelResumen.cambiaDatos(panelResumen.queArchivoSeSelecciono());
				panelResumen.balanceador("Usuarios/" + panelResumen.queArchivoSeSelecciono());

			}
		})));
		validar.setCycleCount(Timeline.INDEFINITE);
		validar.play();

		panelDeSiguienteYAntes = new HBox();
		panelDeSiguienteYAntes.setPadding(new Insets(10, 10, 10, 200));
		panelDeSiguienteYAntes.setSpacing(350);
		Button siguiente = new Button(" >> ");
		Button anterior = new Button(" <<  ");
		siguiente.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				contador = contador + 7;
				///System.out.println(contador + "  " + (contador + 7));
				panelMovimientos.Actualizador(contador);

			}
		});

		anterior.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				contador = contador - 7;
				//System.out.println(contador + "  " + (contador + 7));
				panelMovimientos.Actualizador(contador);

			}
		});

		panelDeSiguienteYAntes.getChildren().add(anterior);
		panelDeSiguienteYAntes.getChildren().add(siguiente);

		getChildren().add(panelResumen);
		getChildren().add(textoDeMovimientosaHacer);
		getChildren().add(panelRegistro);
		getChildren().add(textoDeMovimientos);
		getChildren().add(panelMovimientos);
		getChildren().add(panelDeSiguienteYAntes);
	}

}

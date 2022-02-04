import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class PanelQueRegistra extends GridPane {

	private TextField conceptoTransaccion;
	private TextField montoTransaccion;
	private HBox botones;
	private String rutaArchivo;

	public PanelQueRegistra(String t) {
		rutaArchivo = t;
		conceptoTransaccion = new TextField("concepto");
		montoTransaccion = new TextField("monto");
		Button credito = new Button("Crédito");
		Button debito = new Button("Débito");
		conceptoTransaccion.setMinSize(200, 20);
		botones = new HBox();
		botones.getChildren().add(credito);
		botones.getChildren().add(debito);
		botones.setSpacing(100);

		EscribirArchivo escritor = new EscribirArchivo();

		credito.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					if (Integer.parseInt(montoTransaccion.getText()) > 0) {
						escritor.escribirEnArchivoAdicionandoTexto(rutaArchivo, conceptoTransaccion.getText(),
								montoTransaccion.getText());
					} else {
						montoTransaccion.setText("Escriba un Monto Válido");
					}
				} catch (Exception e) {
					montoTransaccion.setText("Escriba un Monto Válido");

				}

			}
		});

		debito.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String monto = Integer.toString((Integer.parseInt(montoTransaccion.getText()) * -1));
				try {
					if (Integer.parseInt(montoTransaccion.getText()) > 0) {
						escritor.escribirEnArchivoAdicionandoTexto(rutaArchivo, conceptoTransaccion.getText(), monto);
					} else {
						montoTransaccion.setText("Escriba un Monto Válido");
					}
				} catch (Exception e) {
					montoTransaccion.setText("Escriba un Monto Válido");

				}

			}
		});

		this.add(conceptoTransaccion, 0, 0);
		this.add(montoTransaccion, 0, 1);
		this.add(botones, 0, 2);

	}

	public String getRutaArchivo() {
		return rutaArchivo;
	}

	public void setRutaArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}

}

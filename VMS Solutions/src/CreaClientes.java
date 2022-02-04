import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CreaClientes extends GridPane {
	private Label etiquetaNombre;
	private TextField nombreField;
	private Label etiquetaCedula;
	private TextField cedulaField;
	private Label etiquetaDireccion;
	private TextField direccionField;
	private Label etiquetaCorreo;
	private TextField correoField;
	private Label etiquetaTelefono;
	private TextField telefonoField;
	private Label etiquetaEstatus;
	private ComboBox comboBox;
	private Label etiquetaFecha;
	private TextField fechaField;
	private Label etiquetaQueSeVendio;
	private TextField QueSeVendioField;
	private Label etiquetaObservaciones;
	private TextField observacionesField;
	private Button botonGuardar;

	public CreaClientes() {
		etiquetaNombre = new Label("Nombre:");
		nombreField = new TextField();
		
		etiquetaCedula = new Label("Cedula");
		cedulaField = new TextField();
		
		etiquetaDireccion = new Label("Dirección:");
		direccionField = new TextField();
		
		etiquetaCorreo= new Label("Correo Electrónico:");
		correoField = new TextField();
		
		etiquetaTelefono= new Label("Teléfono:");
		telefonoField = new TextField();
		
		etiquetaEstatus= new Label("Estatus:");
		comboBox = new ComboBox();
		comboBox.setValue("1");
		comboBox.getItems().addAll("1");
		comboBox.getItems().addAll("2");
		comboBox.getItems().addAll("3");
		
		
		etiquetaFecha= new Label("Fecha:");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YY");
		LocalDateTime now = LocalDateTime.now();
		fechaField = new TextField(dtf.format(now) );
		
		etiquetaQueSeVendio= new Label("Que se le ofreció:");
		QueSeVendioField = new TextField();
		
		etiquetaObservaciones= new Label("Observación:");
		observacionesField = new TextField();
		
		botonGuardar = new Button("Guardar.");

		Escribidor escritor = new Escribidor();
		botonGuardar.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			 public void handle(ActionEvent e) {
				 
				  String Status = (String) comboBox.getValue();
				 escritor.escribirEnArchivoAdicionandoTexto( "BaseDeDatos.txt", nombreField.getText(),  cedulaField.getText(), correoField.getText() ,direccionField.getText(), telefonoField.getText(), Status  , fechaField.getText(), QueSeVendioField.getText() , observacionesField.getText() );
				 nombreField.setText(" ");  
				 cedulaField.setText(" ");
				 correoField.setText(" ");
				 direccionField.setText(" "); 
				 telefonoField.setText(" "); 
				 fechaField.setText(" "); 
				 QueSeVendioField.setText(" ");
				 observacionesField.setText(" ");
			 
			 }
			 }
			);
		
		


		this.setHgap(20);
		this.setVgap(20);
		this.add(etiquetaNombre, 0, 1);
		this.add(nombreField, 1, 1);
		this.add(etiquetaCedula, 2, 1);
		this.add(cedulaField, 3, 1);
		this.add(etiquetaDireccion, 4, 1);
		this.add(direccionField, 5, 1);
		this.add(etiquetaCorreo, 6, 1);
		this.add(correoField , 7, 1);
		this.add(etiquetaTelefono, 8, 1);
		this.add(telefonoField , 9, 1);
		this.add(etiquetaEstatus, 0, 2);
		this.add(comboBox , 1, 2);
		this.add(etiquetaFecha, 2, 2);
		this.add(fechaField , 3, 2);
		this.add(etiquetaQueSeVendio, 4, 2);
		this.add(QueSeVendioField, 5, 2);
		this.add(etiquetaObservaciones, 0, 3);
		this.add(observacionesField, 1, 3);
		this.add(botonGuardar, 0, 4);

	}

}

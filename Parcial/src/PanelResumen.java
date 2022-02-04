import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class PanelResumen extends GridPane {

	private ImageView foto;
	private VBox datosCliente;
	private VBox resumenYSeleecionador;
	private ArrayList<String> NombresArchivos;
	private ComboBox comboBox;
	private ImageView FotoNicolas;
	private ImageView FotoAna;
	private ImageView FotoVicky;
	private Text textoNombre;
	private Text textoCodigo;
	private TextField Balance;

	public PanelResumen() {
		resumenYSeleecionador = new VBox();
		NombresArchivos = new ArrayList<>();
		this.setHgap(25);
		this.setVgap(25);

		String sDirectorio = "Usuarios";
		File f = new File(sDirectorio);

		if (f.exists()) {
			System.out.println("existe");
		} else {
			System.out.println("No existe");
		}
		File[] ficheros = f.listFiles();

		for (int x = 0; x < ficheros.length; x++) {
			//System.out.println(ficheros[x].getName());
			NombresArchivos.add(ficheros[x].getName());

		}

		comboBox = new ComboBox();
		for (int t = 0; t < NombresArchivos.size(); t++) {
			comboBox.getItems().addAll(NombresArchivos.get(t));
		}
		comboBox.setValue(NombresArchivos.get(1));

		resumenYSeleecionador.getChildren().add(comboBox);

		FileInputStream fileFotoNicolas = null;
		try {
			fileFotoNicolas = new FileInputStream("IMG-20181116-WA0042 (3).jpg");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Image filereadyFotoNicolas = new Image(fileFotoNicolas);
		FotoNicolas = new ImageView(filereadyFotoNicolas);
		FotoNicolas.setFitHeight(200);
		FotoNicolas.setFitWidth(220);
		FileInputStream fileFotoAna = null;
		try {
			fileFotoAna = new FileInputStream("Screenshot_2018-11-18-14-29-23-966_com.whatsapp.png");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Image filereadyFotoAna = new Image(fileFotoAna);
		FotoAna = new ImageView(filereadyFotoAna);
		FotoAna.setFitHeight(200);
		FotoAna.setFitWidth(220);

		FileInputStream fileFotoVicky = null;
		try {
			fileFotoVicky = new FileInputStream("Screenshot_2018-11-18-14-29-57-372_com.instagram.android.png");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Image filereadyFotoVicky = new Image(fileFotoVicky);
		FotoVicky = new ImageView(filereadyFotoVicky);
		FotoVicky.setFitHeight(200);
		FotoVicky.setFitWidth(220);

		foto = FotoNicolas;

		datosCliente = new VBox();
		textoNombre = new Text("Nicolás Vallejo");
		textoCodigo = new Text("1127620336");

		datosCliente.getChildren().add(textoNombre);
		datosCliente.getChildren().add(textoCodigo);

		datosCliente.setAlignment(Pos.CENTER);
		resumenYSeleecionador.setAlignment(Pos.CENTER);

		Text textoBanalce = new Text("BALANCE DE LA CUENTA");
		textoBanalce.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 19));
		resumenYSeleecionador.getChildren().add(textoBanalce);
		Balance = new TextField("");
		resumenYSeleecionador.getChildren().add(Balance);

		this.add(datosCliente, 1, 0);
		this.add(resumenYSeleecionador, 3, 0);

	}

	public String queArchivoSeSelecciono() {

		String resultado = (String) comboBox.getValue();
		if (resultado == null) {
			return NombresArchivos.get(1);
		}
		return resultado;

	}

	public void cambiaDatos(String i) {
		if (i.equals("Ana Sátiva.txt")) {

			this.getChildren().remove(foto);
			datosCliente.getChildren().remove(textoNombre);
			datosCliente.getChildren().remove(textoCodigo);
			foto = FotoAna;

			String[] splitedLine = null;
			FileReader lectorArchivo = null;
			try {
				lectorArchivo = new FileReader("Usuarios/" + i);

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
			BufferedReader buffer = new BufferedReader(lectorArchivo);
			try {
				splitedLine = buffer.readLine().split(",");
			} catch (IOException e) {
				e.printStackTrace();
			}

			textoNombre = new Text(splitedLine[0]);
			textoCodigo = new Text("NRO cuenta:" + splitedLine[1]);
			textoNombre.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 17));
			datosCliente.getChildren().add(textoNombre);
			datosCliente.getChildren().add(textoCodigo);
			this.add(foto, 0, 0);
		} else if (i.equals("Victoria García.txt")) {
			datosCliente.getChildren().remove(textoNombre);
			datosCliente.getChildren().remove(textoCodigo);
			this.getChildren().remove(foto);
			foto = FotoVicky;
			String[] splitedLine = null;
			FileReader lectorArchivo = null;
			try {
				lectorArchivo = new FileReader("Usuarios/" + i);

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
			BufferedReader buffer = new BufferedReader(lectorArchivo);
			try {
				splitedLine = buffer.readLine().split(",");
			} catch (IOException e) {
				e.printStackTrace();
			}

			textoNombre = new Text(splitedLine[0]);
			textoCodigo = new Text("NRO cuenta:" + splitedLine[1]);
			textoNombre.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 17));

			datosCliente.getChildren().add(textoNombre);
			datosCliente.getChildren().add(textoCodigo);

			this.add(foto, 0, 0);

		} else {
			datosCliente.getChildren().remove(textoNombre);
			datosCliente.getChildren().remove(textoCodigo);
			this.getChildren().remove(foto);
			foto = FotoNicolas;

			String[] splitedLine = null;
			FileReader lectorArchivo = null;
			try {
				lectorArchivo = new FileReader("Usuarios/" + i);

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
			BufferedReader buffer = new BufferedReader(lectorArchivo);
			try {
				splitedLine = buffer.readLine().split(",");
			} catch (IOException e) {
				e.printStackTrace();
			}

			textoNombre = new Text(splitedLine[0]);
			textoCodigo = new Text("NRO cuenta:" + splitedLine[1]);
			textoNombre.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 17));
			datosCliente.getChildren().add(textoNombre);
			datosCliente.getChildren().add(textoCodigo);
			this.add(foto, 0, 0);

		}

	}

	public void balanceador(String l) {

		ArrayList<String> lineas = new ArrayList<String>();
		int cuentas = 0;

		FileReader lectorArchivo = null;
		try {
			lectorArchivo = new FileReader(l);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		BufferedReader buffer = new BufferedReader(lectorArchivo);
		try {
			buffer.readLine();
		} catch (IOException e) {

			e.printStackTrace();
		}

		while (true) {
			try {

				String linea = buffer.readLine();
				if (linea != null) {

					// String readLine = buffer.readLine();
					lineas.add(linea);

				} else {
					break;
				}

			} catch (IOException e) {

				break;
			}
		}
		String[] splitedLine = null;
		for (int i = 0; i < lineas.size(); i++) {
			splitedLine = lineas.get(i).split(",");
			cuentas = cuentas + Integer.parseInt(splitedLine[0]);

		}
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
		String resultado = nf.format(cuentas);
		Balance.setText(resultado);
		cuentas = 0;

	}

}

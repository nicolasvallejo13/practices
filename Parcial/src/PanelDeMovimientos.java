import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class PanelDeMovimientos extends GridPane {
	private String rutaArchivo;
	private Label etiqueta1;
	private Label etiqueta2;
	private Label etiqueta3;
	private Label etiqueta4;
	private TextField monto1;
	private TextField monto2;
	private TextField monto3;
	private TextField monto4;
	private TextField fecha1;
	private TextField fecha2;
	private TextField fecha3;
	private TextField fecha4;
	private Label etiqueta5;
	private Label etiqueta6;
	private Label etiqueta7;
	private Label etiqueta8;
	private TextField monto5;
	private TextField monto6;
	private TextField monto7;
	private TextField monto8;
	private TextField fecha5;
	private TextField fecha6;
	private TextField fecha7;
	private TextField fecha8;
	private ArrayList<String> lineas;

	public PanelDeMovimientos(String i) {
		rutaArchivo = i;
		lineas = new ArrayList<String>();
		FileReader lectorArchivo = null;
		try {
			lectorArchivo = new FileReader(rutaArchivo);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		BufferedReader buffer = new BufferedReader(lectorArchivo);
		try {
			buffer.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (true) {
			try {

				String linea = buffer.readLine();
				if (linea != null) {
					//System.out.println("primero");
					// String readLine = buffer.readLine();
					lineas.add(linea);

				} else {
					break;
				}

			} catch (IOException e) {
				//System.out.println("segundo");
				e.printStackTrace();
				break;
			}
		}

		
		String[] splitedLine = null;
		splitedLine = lineas.get(0).split(",");
		etiqueta1 = new Label(splitedLine[0]);
		monto1 = new TextField(splitedLine[1]);
		fecha1 = new TextField(splitedLine[2]);

		splitedLine = lineas.get(1).split(",");
		etiqueta2 = new Label(splitedLine[0]);
		monto2 = new TextField(splitedLine[1]);
		fecha2 = new TextField(splitedLine[2]);

		splitedLine = lineas.get(2).split(",");
		etiqueta3 = new Label(splitedLine[0]);
		monto3 = new TextField(splitedLine[1]);
		fecha3 = new TextField(splitedLine[2]);

		splitedLine = lineas.get(3).split(",");
		etiqueta4 = new Label(splitedLine[0]);
		monto4 = new TextField(splitedLine[1]);
		fecha4 = new TextField(splitedLine[2]);

		splitedLine = lineas.get(4).split(",");
		etiqueta5 = new Label(splitedLine[0]);
		monto5 = new TextField(splitedLine[1]);
		fecha5 = new TextField(splitedLine[2]);

		splitedLine = lineas.get(5).split(",");
		etiqueta6 = new Label(splitedLine[0]);
		monto6 = new TextField(splitedLine[1]);
		fecha6 = new TextField(splitedLine[2]);

		splitedLine = lineas.get(6).split(",");
		etiqueta7 = new Label(splitedLine[0]);
		monto7 = new TextField(splitedLine[1]);
		fecha7 = new TextField(splitedLine[2]);

		splitedLine = lineas.get(7).split(",");
		etiqueta8 = new Label(splitedLine[0]);
		monto8 = new TextField(splitedLine[1]);
		fecha8 = new TextField(splitedLine[2]);

		this.setHgap(20);
		this.setVgap(20);
		this.add(etiqueta1, 0, 1);
		this.add(monto1, 1, 1);
		this.add(fecha1, 2, 1);
		this.add(etiqueta2, 0, 2);
		this.add(monto2, 1, 2);
		this.add(fecha2, 2, 2);
		this.add(etiqueta3, 0, 3);
		this.add(monto3, 1, 3);
		this.add(fecha3, 2, 3);
		this.add(etiqueta4, 0, 4);
		this.add(monto4, 1, 4);
		this.add(fecha4, 2, 4);

		this.add(etiqueta5, 3, 1);
		this.add(monto5, 4, 1);
		this.add(fecha5, 5, 1);

		this.add(etiqueta6, 3, 2);
		this.add(monto6, 4, 2);
		this.add(fecha6, 5, 2);
		this.add(etiqueta7, 3, 3);
		this.add(monto7, 4, 3);
		this.add(fecha7, 5, 3);
		this.add(etiqueta8, 3, 4);
		this.add(monto8, 4, 4);
		this.add(fecha8, 5, 4);
	}

	public void Actualizador(int contador) {
		lineas = new ArrayList<String>();

		this.getChildren().removeAll(etiqueta1, etiqueta2, etiqueta3, etiqueta4, etiqueta5, etiqueta6, etiqueta7,
				etiqueta8, monto1, monto2, monto3, monto4, monto5, monto6, monto7, monto8, fecha1, fecha2, fecha3,
				fecha4, fecha5, fecha6, fecha7, fecha8);

		if (contador < 0) {
			etiqueta1 = new Label("0000");
			monto1 = new TextField("No hay más Transacciones");
			fecha1 = new TextField("dale click al botón >> para ver las transacciones");
			fecha1.setMinSize(400, 80);
			this.add(etiqueta1, 0, 1);
			this.add(monto1, 1, 1);
			this.add(fecha1, 2, 1);

		} else {

			FileReader lectorArchivo = null;
			try {
				lectorArchivo = new FileReader(rutaArchivo);
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
			BufferedReader buffer = new BufferedReader(lectorArchivo);
			try {
				buffer.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			while (true) {
				try {

					String linea = buffer.readLine();
					if (linea != null) {

						// String readLine = buffer.readLine();
						lineas.add(linea);

					} else {
						DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YY HH:mm:ss");
						LocalDateTime now = LocalDateTime.now();

						for (int i = 0; i < 500; i++) {
							lineas.add("000000, No hay más movimientos," + dtf.format(now));
						}
						break;
					}

				} catch (IOException e) {
					//System.out.println("segundo");
					e.printStackTrace();
					break;
				}
			}
			

			
			String[] splitedLine = null;
			
			splitedLine = lineas.get(contador).split(",");
			
			etiqueta1 = new Label(splitedLine[1]);
			monto1 = new TextField(splitedLine[0]);
			
			fecha1 = new TextField(splitedLine[2]);

			splitedLine = lineas.get(contador + 1).split(",");
			etiqueta2 = new Label(splitedLine[1]);
			monto2 = new TextField(splitedLine[0]);
			fecha2 = new TextField(splitedLine[2]);

			splitedLine = lineas.get(contador + 2).split(",");
			etiqueta3 = new Label(splitedLine[1]);
			monto3 = new TextField(splitedLine[0]);
			fecha3 = new TextField(splitedLine[2]);

			splitedLine = lineas.get(contador + 3).split(",");
			etiqueta4 = new Label(splitedLine[1]);
			monto4 = new TextField(splitedLine[0]);
			fecha4 = new TextField(splitedLine[2]);

			splitedLine = lineas.get(contador + 4).split(",");
			etiqueta5 = new Label(splitedLine[1]);
			monto5 = new TextField(splitedLine[0]);
			fecha5 = new TextField(splitedLine[2]);

			splitedLine = lineas.get(contador + 5).split(",");
			etiqueta6 = new Label(splitedLine[1]);
			monto6 = new TextField(splitedLine[0]);
			fecha6 = new TextField(splitedLine[2]);

			splitedLine = lineas.get(contador + 6).split(",");
			etiqueta7 = new Label(splitedLine[1]);
			monto7 = new TextField(splitedLine[0]);
			fecha7 = new TextField(splitedLine[2]);

			splitedLine = lineas.get(contador + 7).split(",");
			etiqueta8 = new Label(splitedLine[1]);
			monto8 = new TextField(splitedLine[0]);
			fecha8 = new TextField(splitedLine[2]);
			
			monto1.setMaxSize(80, 60);
			monto2.setMaxSize(80, 60);
			monto3.setMaxSize(80, 60);
			monto4.setMaxSize(80, 60);
			monto5.setMaxSize(80, 60);
			monto6.setMaxSize(80, 60);
			monto7.setMaxSize(80, 60);
			monto8.setMaxSize(80, 60);
			this.add(etiqueta1, 0, 1);
			this.add(monto1, 1, 1);
			this.add(fecha1, 2, 1);
			this.add(etiqueta2, 0, 2);
			this.add(monto2, 1, 2);
			this.add(fecha2, 2, 2);
			this.add(etiqueta3, 0, 3);
			this.add(monto3, 1, 3);
			this.add(fecha3, 2, 3);
			this.add(etiqueta4, 0, 4);
			this.add(monto4, 1, 4);
			this.add(fecha4, 2, 4);

			this.add(etiqueta5, 3, 1);
			this.add(monto5, 4, 1);
			this.add(fecha5, 5, 1);

			this.add(etiqueta6, 3, 2);
			this.add(monto6, 4, 2);
			this.add(fecha6, 5, 2);
			this.add(etiqueta7, 3, 3);
			this.add(monto7, 4, 3);
			this.add(fecha7, 5, 3);
			this.add(etiqueta8, 3, 4);
			this.add(monto8, 4, 4);
			this.add(fecha8, 5, 4);

		}

	}

	public String getRutaArchivo() {
		return rutaArchivo;
	}

	public void setRutaArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}

}

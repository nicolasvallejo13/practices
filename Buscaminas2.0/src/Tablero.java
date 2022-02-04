import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Tablero extends HBox {
	private GridPane tablero;
	boolean[][] matrizDelBooleanos = null;

	public Tablero() {
		this.tablero = new GridPane();
		int largo = 1;
		int ancho = 1;
		String[] splitedLine = null;
		String[] segundaLinea = null;

		FileReader lectorArchivo = null;
		try {
			lectorArchivo = new FileReader("TableroBsucaMinas3.txt");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		BufferedReader buffer = new BufferedReader(lectorArchivo);

		try {
			String readLine = buffer.readLine();

			splitedLine = readLine.split(" ");
			largo = Integer.parseInt(splitedLine[0]);
			ancho = Integer.parseInt(splitedLine[1]);

			matrizDelBooleanos = new boolean[ancho][largo];
			for (int h = 0; h < largo; h++) {
				String nea1 = buffer.readLine();
				String[] lineaDividida = nea1.split("");
				for (int t = 0; t < ancho; t++) {

					if (lineaDividida[t].equals("#")) {
						matrizDelBooleanos[h][t] = false;

					} else {
						matrizDelBooleanos[h][t] = true;
					}

				}
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

		for (int i = 0; i != largo; i++) {
			for (int j = 0; j != ancho; j++) {
				FileInputStream fis = null;
				try {
					fis = new FileInputStream("9ca42d9427bef501dd921475bbe7f507.png");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Image imagenmina = new Image(fis);
				ImageView nombre = new ImageView(imagenmina);
				nombre.setFitHeight(20);
				nombre.setFitWidth(20);

				BotonNicolas boton = new BotonNicolas(i, j);
				boton.setGraphic(nombre);
				boton.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {

						System.out.println(boton.coordenada1 + " " + boton.coordenada2);
						if ( matrizDelBooleanos[boton.coordenada2][boton.coordenada1])
						{
							FileInputStream vicky =null;
							try {
								vicky  = new FileInputStream("42-426801_emoticones-de-whatsapp-explosion.png");
							} catch (FileNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							Image imagebien = new Image(vicky);
							ImageView yuyu = new ImageView(imagebien);
							yuyu.setFitHeight(20);
							yuyu.setFitWidth(20);
							
							boton.setGraphic(yuyu);
						}
						else
						{
							FileInputStream vicky =null;
							try {
								vicky  = new FileInputStream("Carita_feliz_alegre_amarilla.png");
							} catch (FileNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							Image imagebien = new Image(vicky);
							ImageView yuyu = new ImageView(imagebien);
							yuyu.setFitHeight(20);
							yuyu.setFitWidth(20);
							
							boton.setGraphic(yuyu);
						}

						

					}
				});

				tablero.add(boton, i, j);

			}
		}

		getChildren().add(tablero);
	}

	public String[] dimensionesTabla(String rutaArchivo) {

		FileReader lectorArchivo = null;
		try {
			lectorArchivo = new FileReader(rutaArchivo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader buffer = new BufferedReader(lectorArchivo);

		try {
			String readLine = buffer.readLine();

			while (readLine != null) {

				// System.out.println(readLine);

				String[] splitedLine = readLine.split(" ");
				return splitedLine;

				/*
				 * for (int x=0; x < splitedLine.length ; x ++) { String caracter =
				 * splitedLine[x]; if (caracter.equals("*")) { System.out.print("B"); }else {
				 * System.out.print("-"); } } System.out.println("");
				 */

				// readLine = buffer.readLine();

			}

		} catch (IOException e) {

			e.printStackTrace();
		}
		return null;

	}
}
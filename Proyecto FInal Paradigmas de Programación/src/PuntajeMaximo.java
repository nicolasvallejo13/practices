import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class PuntajeMaximo extends GridPane {

	private Text jugado1;
	private Text jugado2;
	private Text jugado3;
	private Text puntjaejugado1;
	private Text puntjaejugado2;
	private Text puntjaejugado3;
	private ArrayList<String> lineas;

	public PuntajeMaximo() {
		String[] splitedLine = null;
		String[] primerpuesto = { "nadie", "0" };
		String[] segundopuesto = { "nadie", "-5" };
		;
		String[] tercerpuesto = { "nadie", "-10" };
		;
		lineas = new ArrayList<String>();
		FileReader lectorArchivo = null;
		try {
			lectorArchivo = new FileReader("PuntajesCaeBasuras.txt");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		BufferedReader buffer = new BufferedReader(lectorArchivo);
		// for(int i =0; true; i++)
		while (true) {
			try {

				String linea = buffer.readLine();
				if (linea != null) {
					System.out.println("primero");
					// String readLine = buffer.readLine();
					lineas.add(linea);

				} else {
					break;
				}

			} catch (IOException e) {
				System.out.println("segundo");
				e.printStackTrace();
				break;
			}
		}

		for (int i = 0; i != lineas.size(); i++) {
			System.out.println(lineas.get(i));

			splitedLine = lineas.get(i).split(",");
			int puntajeComparando = Integer.parseInt(splitedLine[1]);
			int puntajePrimero = Integer.parseInt(primerpuesto[1]);
			int puntajeSegundo = Integer.parseInt(segundopuesto[1]);
			int puntajeTercero = Integer.parseInt(tercerpuesto[1]);

			if (puntajeComparando >= puntajePrimero) {

				tercerpuesto = segundopuesto;
				segundopuesto = primerpuesto;
				primerpuesto = lineas.get(i).split(",");

			} else if (puntajeComparando < puntajePrimero && puntajeComparando >= puntajeSegundo) {
				tercerpuesto = segundopuesto;
				segundopuesto = lineas.get(i).split(",");

			} else if (puntajeComparando < puntajeSegundo && puntajeComparando >= puntajeTercero) {
				tercerpuesto = lineas.get(i).split(",");
			}

		}

		jugado1 = new Text(primerpuesto[0]);
		puntjaejugado1 = new Text(primerpuesto[1]);
		jugado2 = new Text(segundopuesto[0]);
		puntjaejugado2 = new Text(segundopuesto[1]);
		jugado3 = new Text(tercerpuesto[0]);
		puntjaejugado3 = new Text(tercerpuesto[1]);
		
		Text higscor = new Text("HIGH SCORES");
		
		jugado1.setFont(Font.font("Arial", FontWeight.BOLD,  60));
		puntjaejugado1.setFont(Font.font("Arial", FontWeight.BOLD,  60));
		jugado2.setFont(Font.font("Arial", FontWeight.BOLD,  60));
		puntjaejugado2.setFont(Font.font("Arial", FontWeight.BOLD,  60));
		jugado3.setFont(Font.font("Arial", FontWeight.BOLD,  60));
		puntjaejugado3.setFont(Font.font("Arial", FontWeight.BOLD,  60));
		higscor.setFont(Font.font("Times New Roman", FontWeight.BOLD,FontPosture.ITALIC, 60));
		higscor.setFill(Color.RED);
		
		

		this.setHgap(20);
		this.setVgap(20);
		this.add(higscor,0,0);
		this.add(jugado1, 0, 1);
		this.add(puntjaejugado1, 1, 1);
		this.add(jugado2, 0, 2);
		this.add(puntjaejugado2, 1, 2);
		this.add(jugado3, 0, 3);
		this.add(puntjaejugado3, 1, 3);

	}
}

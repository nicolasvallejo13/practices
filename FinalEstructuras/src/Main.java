import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		MatrizDeAdyacencia matriz = new MatrizDeAdyacencia();
		FileReader lectorArchivo = null;
		try {
			lectorArchivo = new FileReader("wikiElec.ElecBs3.txt");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		BufferedReader buffer = new BufferedReader(lectorArchivo);
		int i = 0;
		int t = 0;
		int w = 0;
		int idVotado = 0;
		String[] lineas = null;
		while (true) {
			t = 0;
			try {
				String linea;
				linea = buffer.readLine();
				lineas = linea.split("	");
			} catch (Exception e) {
				break;

			}
			if (lineas[0].equals("E") && lineas[1].equals("1")) {

				try {
					buffer.readLine();
					buffer.readLine();
					String linea;
					linea = buffer.readLine();
					lineas = linea.split("	");
					idVotado = Integer.parseInt(lineas[1]);

				} catch (Exception e) {
					break;

				}

				i++;
				// System.out.println(i);

				String[] sublineas = null;
				while (true) {

					try {
						String linea;
						linea = buffer.readLine();
						lineas = linea.split("	");
						if (lineas[0].equals("V")) {
							t++;
							// System.out.println(t);
							matriz.añadirVotos(idVotado,
									new Voto(Integer.parseInt(lineas[2]), Integer.parseInt(lineas[1])));
						} else {
							break;
						}
					} catch (Exception e) {
						break;

					}

				}

			}

		}
		int mayorVotado = 0;
		int idMayoyVotado = 0;
		int mayorVotadoEnContra =0;
		int idMayorOposicionado = 0;
		for (int h = 0; h < 10000; h++) {
			if (matriz.imprimirPuntajeAFavorNodo(h) > mayorVotado) {
				mayorVotado = matriz.imprimirPuntajeAFavorNodo(h);
				idMayoyVotado = h;
			}
			
			if (matriz.imprimirVotosEnOposicion(h) > mayorVotadoEnContra) {
				mayorVotadoEnContra = matriz.imprimirVotosEnOposicion(h);
				idMayorOposicionado = h;
			}
			
			

			System.out.println((h + 1) + " F " + matriz.imprimirPuntajeAFavorNodo(h) +" C " + matriz.imprimirVotosEnOposicion(h));

		}

		System.out.println(
				"el id del Usuario con más votos a favor " + (idMayoyVotado+1)  + " con un puntaje total de " + mayorVotado);
		System.out.print("el id del Usuario con más votos en contra es  " +(idMayorOposicionado+1)  + " con una cantidad de votos en contra: " + mayorVotadoEnContra );

	}
}
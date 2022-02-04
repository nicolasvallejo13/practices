import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
	private ArrayList<Elemento> elementos;
	private int[][] tablero;
	private int cantidadDeCasillas;

	public void crearTablero() {
		Scanner sc = new Scanner(System.in);
		int cantidadDeFilas = 0;
		int cantidadDeColumnas = 0;
		boolean cantidadDeCasillasEstaMalPorqueDeberiaSerPar = true;

		while (cantidadDeCasillasEstaMalPorqueDeberiaSerPar) {
			System.out.print("ingrese Cantidad de Filas para el tablero");
			cantidadDeFilas = sc.nextInt();
			System.out.print("ingrese cantidad de columnas  para el tablero");
			cantidadDeColumnas = sc.nextInt();
			if (((cantidadDeFilas * cantidadDeColumnas) % 2 == 0) && (cantidadDeFilas * cantidadDeColumnas) > 1) {
				cantidadDeCasillasEstaMalPorqueDeberiaSerPar = false;

			} else {
				System.out.println(
						"la cantidad de casillas en el tablero debe ser par y diferente a cero  (carita triste) ¡intenta de nuevo! \n");
			}
		}
		this.tablero = new int[cantidadDeFilas][cantidadDeColumnas];
		System.out.println(
				"el tablero tendrá " + (cantidadDeFilas * cantidadDeColumnas) + " casillas, por lo tanto tendrá "
						+ (cantidadDeFilas * cantidadDeColumnas) / 2 + " elementos que procederemos a crear \n ");
		cantidadDeCasillas = cantidadDeFilas * cantidadDeColumnas;
	}

	public void crearElementos() {
		int auxiliar1 = 0;
		int auxiliar2 = 0;
		int auxiliar3 = 0;
		int auxiliar4 = 0;
		Elemento elementoAdd;

		String nombre = null;
		int codigo = 0;
		String color = null;
		int tamano = 0;
		elementos = new ArrayList<Elemento>();
		Scanner sc = new Scanner(System.in);
		for (int w = 0; w != (cantidadDeCasillas / 2); w++) {
			boolean coordenada1Ocupada = true;
			boolean coordenada2Ocupada = true;
			boolean nombreElementoDiferenteAElemento = true;
			System.out.print("\n ingrese el código del elemento " + (elementos.size() + 1));
			codigo = sc.nextInt();
			while (nombreElementoDiferenteAElemento) {
				System.out.print("ingrese nombre del elemento " + (elementos.size() + 1));
				nombre = sc.next();
				if (nombre.equalsIgnoreCase("elemento")) {
					System.out.print(
							"el nombre del elemento no puede ser igual a elemento (carita triste) ¡intenta de nuevo! \n");
				} else {
					nombreElementoDiferenteAElemento = false;
				}
			}

			System.out.print("ingrese color del elemento " + (elementos.size() + 1));
			color = sc.next();
			System.out.print("ingrese tamaño del elemento (número entero) " + (elementos.size() + 1));
			tamano = sc.nextInt();
			elementoAdd = new Elemento(codigo, nombre, color, tamano);

			while (coordenada1Ocupada) {
				boolean Libre = true;
				auxiliar1 = (int) Math.floor(Math.random() * (tablero.length));
				auxiliar3 = (int) Math.floor(Math.random() * (tablero[0].length));
				if (elementos.size() > 0) {
					for (int qe = 0; qe != elementos.size(); qe++) {
						if ((auxiliar1 == elementos.get(qe).getCoodenadaFila1()
								&& auxiliar3 == elementos.get(qe).getCoordenadaColumna1())
								|| (auxiliar1 == elementos.get(qe).getCoodenadaFila2()
										&& auxiliar3 == elementos.get(qe).getCoordenadaColumna2())) {
							Libre = false;
						}
					}
				} else {
					elementoAdd.setCoodenadaFila1(auxiliar1);
					elementoAdd.setCoordenadaColumna1(auxiliar3);
					coordenada1Ocupada = false;
				}

				if (Libre) {
					elementoAdd.setCoodenadaFila1(auxiliar1);
					elementoAdd.setCoordenadaColumna1(auxiliar3);
					coordenada1Ocupada = false;
				}
			}

			while (coordenada2Ocupada) {
				boolean Libre = true;
				auxiliar2 = (int) Math.floor(Math.random() * (tablero.length));
				auxiliar4 = (int) Math.floor(Math.random() * (tablero[0].length));
				if (elementos.size() > 0) {
					for (int qe = 0; qe != elementos.size(); qe++) {
						if ((auxiliar2 == elementos.get(qe).getCoodenadaFila1()
								&& auxiliar4 == elementos.get(qe).getCoordenadaColumna1())
								|| (auxiliar2 == elementos.get(qe).getCoodenadaFila2()
										&& auxiliar4 == elementos.get(qe).getCoordenadaColumna2())
								|| ((auxiliar2 == auxiliar1) && (auxiliar3 == auxiliar4))) {
							Libre = false;
						}

					}
				} else {
					if ((auxiliar2 != auxiliar1) && (auxiliar3 != auxiliar4)) {
						elementoAdd.setCoodenadaFila2(auxiliar2);
						elementoAdd.setCoordenadaColumna2(auxiliar4);
						coordenada2Ocupada = false;
					} else {
						Libre = true;
					}

				}
				if (Libre) {
					elementoAdd.setCoodenadaFila2(auxiliar2);
					elementoAdd.setCoordenadaColumna2(auxiliar4);
					coordenada2Ocupada = false;
				}

			}
			elementos.add(elementoAdd);
			elementoAdd.imprimirAtributos();

		}
	}

	public void Jugar() {
		for (int i = 0; i != tablero.length; i++) {
			System.out.print("\n");
			for (int j = 0; j != tablero[i].length; j++) {
				for (int k = 0; k != elementos.size(); k++) {
					if (elementos.get(k).getCoodenadaFila1() == i && elementos.get(k).getCoordenadaColumna1() == k) {
						if (elementos.get(k).isHaSidoEncontrado()) {
							System.out.print(elementos.get(k).getNombre());
						} else {
							System.out.print("  elemento  ");
						}
					}

				}

			}

		}
		Scanner sc = new Scanner(System.in);
		boolean sigueJugando = true;
		while (sigueJugando) {
			System.out.println("\n ingrese la fila del primer posible elemetno que desee verificar");
			int fila1 = sc.nextInt();
			System.out.println("ingrese la columna del primer po elemetno que desee verificar");
			int columna1 = sc.nextInt();
			System.out.println("ingrese la fila del segundo posible elemetno que desee verificar");
			int fila2 = sc.nextInt();
			System.out.println("ingrese la columna del primer elemetno que desee verificar");
			int columna2 = sc.nextInt();

			for (int i = 0; i != elementos.size(); i++) {
				if ((fila1 == elementos.get(i).getCoodenadaFila1()
						&& columna1 == elementos.get(i).getCoordenadaColumna1()
						&& fila2 == elementos.get(i).getCoodenadaFila2()
						&& columna2 == elementos.get(i).getCoordenadaColumna2())
						|| (fila2 == elementos.get(i).getCoodenadaFila1()
								&& columna2 == elementos.get(i).getCoordenadaColumna1()
								&& fila1 == elementos.get(i).getCoodenadaFila2()
								&& columna1 == elementos.get(i).getCoordenadaColumna2())) {
					System.out.println("has encontrado un elemento");
					elementos.get(i).imprimirAtributos();
					elementos.get(i).setHaSidoEncontrado(true);

				}
			}
			for (int i = 0; i != tablero.length; i++) {
				System.out.print("\n");
				for (int j = 0; j != tablero[i].length; j++) {
					
					for (int k = 0; k != elementos.size(); k++) {
						if (elementos.get(k).getCoodenadaFila1() == i && elementos.get(k).getCoordenadaColumna1() == k ){
							if (elementos.get(k).isHaSidoEncontrado()) {
								System.out.print(elementos.get(k).getNombre());
							} else {
								System.out.print("  elemento  ");
								

							}
							}
						

					}

				}

			}
			for (int i = 0 ;  i!=  elementos.size() ;i ++ )
			{
				if (elementos.get(i).isHaSidoEncontrado()  )
				{
					
				}
			}

		}
	}

}

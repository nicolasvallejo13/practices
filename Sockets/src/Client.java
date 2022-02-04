import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		String HOST = "127.0.0.1";
		Scanner lectorConsola = new Scanner(System.in);
		int puerto = 5000;
		DataInputStream in;
		DataOutputStream out;
		int CiudadClienteNuevo = 0;
		System.out.println(
				"Bienvenido al cajero del Banco XYZ  ¿ya eres cliente de nuestro banco? 1 para sí o cualquier otro número para volverte cliente de nuestro banco");
		int esCliente = lectorConsola.nextInt();
		if (esCliente == 1) {
			System.out.println("Bienvenido, ¿ nos podrías indicar tu id de Cliente?");
			int idCliente = lectorConsola.nextInt();
			System.out.println(
					"¿ Qué deseas realizar el día de hoy? 1 para consignar dinero a tu cuenta, 2 para retirar dinero de tu ceunta o cualquier otro número para consultar tu saldo");
			int seleccion = lectorConsola.nextInt();
			if (seleccion == 1) {
				System.out.println("¿Cuánto dinero vas a consignar?");
				int cantidadConsignacion = lectorConsola.nextInt();
				try {

					Socket sc = new Socket(HOST, puerto);
					in = new DataInputStream(sc.getInputStream());
					out = new DataOutputStream(sc.getOutputStream());
					out.writeUTF("2");
					out.writeUTF(Integer.toString(idCliente));
					out.writeUTF(Integer.toString(cantidadConsignacion));
					String mensaje = in.readUTF();
					System.out.println(mensaje);
					sc.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			} else if (seleccion == 2) {

				System.out.println("¿Cuánto dinero vas a retirar?");
				int cantidadRetiro = lectorConsola.nextInt() * -1;

				try {

					Socket sc = new Socket(HOST, puerto);
					in = new DataInputStream(sc.getInputStream());
					out = new DataOutputStream(sc.getOutputStream());
					out.writeUTF("2");
					out.writeUTF(Integer.toString(idCliente));
					out.writeUTF(Integer.toString(cantidadRetiro));
					String mensaje = in.readUTF();
					System.out.println(mensaje);
					sc.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			} else {
				try {

					Socket sc = new Socket(HOST, puerto);
					in = new DataInputStream(sc.getInputStream());
					out = new DataOutputStream(sc.getOutputStream());
					out.writeUTF("4");
					out.writeUTF(Integer.toString(idCliente));
					// out.writeUTF(Integer.toString(cantidadConsignacion));
					// out.writeUTF(Integer.toString(CiudadClienteNuevo));
					String mensaje = in.readUTF();
					System.out.println(mensaje);
					sc.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}

		} else {
			System.out.println("Gracias por querer ser parte de nuestro banco, por favor indícanos tu primer nombre");
			String NombreDeClienteNuevo = lectorConsola.next();
			System.out.println(
					NombreDeClienteNuevo + " ¿nos podrías indicar tu número de teléfono? (máximo 10 dígitos) ");
			long TelefonoDeClienteNuevo = lectorConsola.nextLong();
			System.out.println(NombreDeClienteNuevo
					+ " ¿nos podrías indicar en qué país de encuentras?  1 para Colombia, 2 para Estados Unidos, 3 para Chile, 4 para España o 5 para Venezuela");
			int PaisClienteNuevo = lectorConsola.nextInt();
			if (PaisClienteNuevo == 1) {
				System.out.println(NombreDeClienteNuevo
						+ " ¿nos podrías indicar en qué ciudad de encuentras?  1 para Bogotá, 2 para Medellín, 3 para Cali, 4 para Barranquilla o 5 para Pasto");
				CiudadClienteNuevo = lectorConsola.nextInt();

			} else if (PaisClienteNuevo == 2) {
				System.out.println(NombreDeClienteNuevo
						+ " ¿nos podrías indicar en qué ciudad de encuentras?  6 para New York, 7 para Miami, 8 para Los Angeles, 9 para Orlando o 10 para Boston");
				CiudadClienteNuevo = lectorConsola.nextInt();
			} else if (PaisClienteNuevo == 3) {
				System.out.println(NombreDeClienteNuevo
						+ " ¿nos podrías indicar en qué ciudad de encuentras?  11 para Santiago, 12 para Viña del Mar, 13 para Valparaiso, 14 para Chillán o 15 para Antofagasta");
				CiudadClienteNuevo = lectorConsola.nextInt();
			} else if (PaisClienteNuevo == 4) {
				System.out.println(NombreDeClienteNuevo
						+ " ¿nos podrías indicar en qué ciudad de encuentras?  16 para Madrid, 17 para Barcelona, 18 para Sevilla, 19 para Bilbao o 20 para Málaga");
				CiudadClienteNuevo = lectorConsola.nextInt();
			} else if (PaisClienteNuevo == 5) {
				System.out.println(NombreDeClienteNuevo
						+ " ¿nos podrías indicar en qué ciudad de encuentras?  21 para Caracas, 22 para San Cristóbal, 23 para Maracaibo, 24 para Valencia o 25 para Puerto La Cruz");
				CiudadClienteNuevo = lectorConsola.nextInt();
			}
			// System.out.println(NombreDeClienteNuevo +" "+ TelefonoDeClienteNuevo +" " +
			// PaisClienteNuevo + " " + CiudadClienteNuevo );

			try {
				Socket sc = new Socket(HOST, puerto);

				in = new DataInputStream(sc.getInputStream());
				out = new DataOutputStream(sc.getOutputStream());

				out.writeUTF("1");
				out.writeUTF(NombreDeClienteNuevo);
				out.writeUTF(Long.toString(TelefonoDeClienteNuevo));
				out.writeUTF(Integer.toString(PaisClienteNuevo));
				out.writeUTF(Integer.toString(CiudadClienteNuevo));
				String mensaje = in.readUTF();
				System.out.println(mensaje);

				sc.close();

			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} 

	}

}

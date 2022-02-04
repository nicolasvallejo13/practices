import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Escribidor {

	public void escribirEnArchivoAdicionandoTexto (String fileName, String nombre, String cedula, String direccion, String correo, String telefono, String estatus, String fecha, String queSeOfrecio, String observaciones) {
		
		FileWriter escritorArchivo;
		try {
			

			
			escritorArchivo = new FileWriter(fileName, true);
			
			escritorArchivo.append(nombre + '~'  + cedula + '~' + direccion + '~' + correo + '~' + telefono + '~' + estatus + '~' + fecha + '~' + queSeOfrecio + '~' + observaciones);
			escritorArchivo.append(System.lineSeparator()); 
			escritorArchivo.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}

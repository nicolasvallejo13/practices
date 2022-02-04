import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
	
	
	
	
	
	public void escribirEnArchivoAdicionandoTexto (String fileName, String nombre, String puntaje) {
		
		FileWriter escritorArchivo;
		try {
			
			escritorArchivo = new FileWriter(fileName, true);
			escritorArchivo.append(System.lineSeparator()); 
			escritorArchivo.append(nombre + ',' + puntaje);
			
			escritorArchivo.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}

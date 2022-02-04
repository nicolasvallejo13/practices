import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EscribirArchivo {
	
	
	
	
	
	public void escribirEnArchivoAdicionandoTexto (String fileName, String concepto, String monto) {
		
		FileWriter escritorArchivo;
		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YY HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();

			
			escritorArchivo = new FileWriter(fileName, true);
			
			escritorArchivo.append(monto + ',' + concepto + ',' + dtf.format(now));
			escritorArchivo.append(System.lineSeparator()); 
			escritorArchivo.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}

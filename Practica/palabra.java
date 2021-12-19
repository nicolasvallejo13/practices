import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class palabra {
	String nombre;
	String tipo;
	String ejemplo; 
	String traduccion;
	String numberOfMeanings;
	
	
	
	public palabra ( String nombre, String tipo, String ejemplo, String traduccion, String numberOfMeanings)
	{
		this.nombre = nombre;
		this.tipo = tipo;
		this.ejemplo = ejemplo;
		this.traduccion = traduccion;
		this.numberOfMeanings = numberOfMeanings;
		
	}

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getEjemplo() {
		return ejemplo;
	}



	public void setEjemplo(String ejemplo) {
		this.ejemplo = ejemplo;
	}



	public String getTraducción() {
		return traduccion;
	}



	public void setTraducción(String traducción) {
		this.traduccion = traducción;
	}



	public void guardarPalabra ()
	{
		conexion conexion1 = new conexion();
		Connection cn = null;
		Statement stm = null;
		boolean  rs = true;
		try {
			cn = conexion1.conectar();
			stm = cn.createStatement(); 
			String sentenciaSql = "INSERT INTO table1 (word, typeOfWOrd, numberOfMeanings, exampleOfTheWord, translation, vocabularyScore) VALUES   (  \'" + nombre +"\',\'"+ tipo +" \', "+ numberOfMeanings +" , \'"+ ejemplo +" \', \'"+ traduccion +" \',"+" 0 )";
			//String sentenciaSql = "INSERT INTO table1 (word, typeOfWOrd, numberOfMeanings, exampleOfTheWord, translation, vocabularyScore) VALUES   ( 'ailment' ,'noun', 1, 'Kellys grandmother is afflicted by an unknown ailment.' , 'enfermedad', 0)";
			System.out.print(sentenciaSql );
			rs = stm.execute(sentenciaSql);
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
	}

}
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class app  {
	Scanner sc = new Scanner (System.in);
	
	int respuesta1;
	
	public app () 
	{
		
	}
	
	public void startApp ()
	{
		while (true)
		{
			System.out.print( " /n Bienvenido a Vocabulary ingrese 1 para agregar palabra, ingrese 2 para practicar ");
			int respuesta1 = sc.nextInt();
			System.out.print("usted ha elegido el número " + respuesta1 + " ");
			if(respuesta1 == 1)
			{
				System.out.print("por favor escriba la palabra a Agregar" );
				String respuesta2 = sc.next();
				System.out.print("por favor escriba la cantidad de significaods que tiene la palabra a Agregar" );
				String respuesta3 = sc.next();
				System.out.print("por favor escriba el tipo de palabra " );
				String respuesta4 = sc.next();
				System.out.print("por favor escriba el ejemplo de la palabra" );
				String respuesta5 = sc.next();
				System.out.print("por favor escriba la traducción de la palabra" );
				String respuesta6 = sc.next();
				
				palabra palabraNueva = new palabra ( respuesta2, respuesta4, respuesta5 , respuesta6, respuesta3); 
				palabraNueva.guardarPalabra();
				
				
				
			}
			if (respuesta1 == 2)
			{
				
				 conexion conexion1 = new conexion();
					Connection cn = null;
					Statement stm = null;
					ResultSet rs = null;
					try {
						cn = conexion1.conectar();
						stm = cn.createStatement();
						rs = stm.executeQuery("SELECT * FROM table1");
						
						while (rs.next()) {
							int id = rs.getInt(1);
							String usuario = rs.getString(2);
							String clave = rs.getString(3);
							int numberOfMeanings = rs.getInt(4);
							String ejemplo = rs.getString(5);
							String traduccion= rs.getString(6);
							int vocabScore = rs.getInt(7);
							
							
							
							System.out.println(id + " - " + usuario + " - " + clave + " - " + numberOfMeanings + " - " + ejemplo + " - " + traduccion + " - " + vocabScore);
						}
						
					} catch (SQLException e) {
						e.printStackTrace();
						
					}
				
				
			}else 
			{
				System.out.print("ingrese un comando válido" );
			}
		}
		
		
		
		
		
	}

	
	
	

}

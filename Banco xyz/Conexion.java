import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private static Connection conn;
	private static String driver = "com.mysql.jdbc.Driver";
	private static String usuario = "root";
	private static String password = "";
	private static String url = "jdbc:mysql://localhost:3306/aaa";
	
	
			public Conexion() {
				conn = null; 
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url, usuario, password);
					if (conn != null )
					{
						//System.out.println("conexión a la bd establecida");
					}
					
		
					
				}catch (ClassNotFoundException | SQLException e ) {
					//System.out.println("Error al conectar " + e );
					
					
				}
				
			}
			public Connection getConnection() {
				return conn;
			}
			
			public void desconectar() {
				conn = null;
				if (conn == null )
				{
					//System.out.println("conexión terminada");
				}
			
			}
}

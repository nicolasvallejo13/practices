import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.util.Scanner;

public class Servidor {
	
	public static void main(String [] args) { 
		
	
	ServerSocket servidor = null; 
	Socket sc = null ;
	DataInputStream in;
	DataOutputStream out;
	 int Puerto = 5000; 
	 Conexion conn ;
	 
	
		   Cls_clientes CP = new Cls_clientes();
		   
	   
	
	 
	 
	 
	 
	
	try {
		servidor = new ServerSocket (Puerto);
		//System.out.println("servidor iniciado");
		
		while (true) {
			sc = servidor.accept();
			//System.out.println("cliente conectado");
			in  = new DataInputStream(sc.getInputStream());
			out = new DataOutputStream(sc.getOutputStream());
			
			String clienteNuevoOClienteViejo = in.readUTF();
			//System.out.println(clienteNuevoOClienteViejo);
			if ( Integer.parseInt(clienteNuevoOClienteViejo) == 1 )
			{
				String NombreClienteNuevo = in.readUTF();
				//System.out.println(NombreClienteNuevo);
				String aaa = in.readUTF();
				long TelefonoClienteNuevo = Long.parseLong(aaa);
				//System.out.println(TelefonoClienteNuevo);
				String bbb = in.readUTF();
				int PaisClienteNuevo = Integer.parseInt(bbb);
				//System.out.println(PaisClienteNuevo);
				String ccc = in.readUTF();
				int CiudadClienteNuevo = Integer.parseInt(ccc);
				//System.out.println(CiudadClienteNuevo);
				conn = new Conexion();
				Connection reg = conn.getConnection();
				
				out.writeUTF("te hemos agregado en la base de datos de nuestro banco");
					
				CP.insertDatos(NombreClienteNuevo, TelefonoClienteNuevo, PaisClienteNuevo, CiudadClienteNuevo, 00);
					
			
				
				
				
				
				
			}
		
			
			//
			
			sc.close();
			//System.out.println("clietne desconectado");
			
			
		
		}
			
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
	}
	
}

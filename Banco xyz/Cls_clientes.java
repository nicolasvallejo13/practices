

import com.mysql.jdbc.PreparedStatement;
import  com.* ; 


public class Cls_clientes {
	
	private final String SQL_INSERT = "INSERT INTO cliente (nombre,telefono,idPais,idCiudad,saldo) values (?,?,?,?,?) ";
	private java.sql.PreparedStatement PS; 
	private Conexion CN;
	
	public Cls_clientes () {
		PS = null;
		CN = new Conexion();
		
	}
		
	
	
	public int insertDatos (String nom, float tel, int idPai, int idCiuda, int sald) {
		int res =99;
		try {
			
			PS =  CN.getConnection().prepareStatement(SQL_INSERT);
			
			PS.setString(1, nom);
			PS.setFloat(2, tel);
			PS.setInt(3, idPai);
			PS.setInt(4, idCiuda);
			PS.setInt(5, sald);
			 res = PS.executeUpdate();
			if (res > 0) {
				//System.out.println("registro guardado");
				return  res;
			}
			
			
		} catch (Exception e) {
			//System.out.println("error al guardar datos en base de datos " + e.getMessage());
			return 0;
		}finally {
			PS = null;
			CN.desconectar();
		}
		return  res;
	

}
}

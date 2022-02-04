
import com.mysql.jdbc.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import com.*;

public class Cls_clientes {

	private final String SQL_INSERT = "INSERT INTO cliente (nombre,telefono,idPais,idCiudad,saldo) values (?,?,?,?,?) ";
	private final String SQL_SELECT = "SELECT * FROM cliente";
	private java.sql.PreparedStatement PS;
	private Conexion CN;
	private ResultSet RS;

	public Cls_clientes() {
		PS = null;
		CN = new Conexion();
	}

	public int insertDatos(String nom, float tel, int idPai, int idCiuda, int sald) {
		int res = 99;
		try {

			PS = CN.getConnection().prepareStatement(SQL_INSERT);
			PS.setString(1, nom);
			PS.setFloat(2, tel);
			PS.setInt(3, idPai);
			PS.setInt(4, idCiuda);
			PS.setInt(5, sald);
			res = PS.executeUpdate();
			if (res > 0) {
				// System.out.println("registro guardado");
				return 1;
			}
		} catch (Exception e) {
			// System.out.println("error al guardar datos en base de datos " +
			// e.getMessage());
			return 0;
		} finally {
			PS = null;
			CN.desconectar();
		}
		return res;
	}

	public int getDatosSaldo(int idCliente) {
		int saldo;
		try {
			PS = CN.getConnection().prepareStatement(SQL_SELECT);
			RS = PS.executeQuery();
			ArrayList<Integer> saldos = new ArrayList<Integer>();
			while (RS.next()) {
				saldos.add(RS.getInt(6));
			}
			saldo = saldos.get(idCliente - 1);
		} catch (SQLException e) {
			System.out.println("error al listar los datos :" + e.getMessage());
			saldo = 88888;
		} finally {
			PS = null;
			RS = null;
			CN.desconectar();
		}
		return saldo;

	}

	public int updateDatos(int id, int sald) {
		int res = 99;
		// String SQL ="UPDATE cliente SET saldo " +Integer.toString(sald)+"WHERE
		// idCliente=" +Integer.toString(id);
		String idCliente = Integer.toString(id);
		String saldoNuevo = Integer.toString(sald);
		String primeraPartedelQuery = "UPDATE cliente SET saldo = saldo +  ";
		String segundaPartedelQuery = " WHERE idCliente= ";
		String SQL = primeraPartedelQuery + saldoNuevo + segundaPartedelQuery + idCliente;
		// System.out.println(SQL);
		try {
			PS = CN.getConnection()
					.prepareStatement(primeraPartedelQuery + saldoNuevo + segundaPartedelQuery + idCliente);
			res = PS.executeUpdate();
			if (res > 0) {
				// System.out.println("registro guardado");
				return 1;
			}
		} catch (Exception e) {
			System.out.println("error al guardar datos en base de datos " + e.getMessage());
			return 0;
		} finally {
			PS = null;
			CN.desconectar();
		}
		return res;
	}
}

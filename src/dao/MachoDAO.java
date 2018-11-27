package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.Conexion;
import modelo.macho;

public class MachoDAO {
	
	private Connection connection;
	private PreparedStatement statement;
	private boolean estadoOperacion;
	
	//Guardar
	public boolean guardar(macho ovigen) throws SQLException {
		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();
		
		try {
			connection.setAutoCommit(false);
			sql = "INSERT INTO machos (id_mach, nom_mach, num_mach, sex_mach, edad_mach, fecha_nac, fecha_reg, fecha_actu) VALUES(?,?,?,?,?,?,?,?)";
			statement = connection.prepareStatement(sql);
			
			statement.setString(1, null);
			statement.setString(2, ovigen.getNom_mach());
			statement.setInt(3, ovigen.getNum_mach());
			statement.setString(4, ovigen.getSex_mach());
			statement.setString(5, ovigen.getEdad_mach());
			statement.setDate(6, ovigen.getFecha_nac());
			statement.setDate(7, ovigen.getFecha_reg());
			statement.setDate(8, ovigen.getFeha_actu());
			
			estadoOperacion = statement.executeUpdate() > 0;
			
			connection.commit();
			statement.close();
			connection.close();
			
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}
							
		return estadoOperacion;
	}
	
	//Modificar
	public boolean modificar(macho ovigen) throws SQLException {
		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();
		
		try {
			connection.setAutoCommit(false);
			sql = "UPDATE machos SET nom_mach=?, edad_mach=?, fecha_actu=? WHERE id=?";
			statement = connection.prepareStatement(sql);
			
			statement.setString(1, ovigen.getNom_mach());
			statement.setString(2, ovigen.getEdad_mach());
			statement.setDate(3, ovigen.getFeha_actu());
			statement.setInt(5, ovigen.getId_mach());
			
			estadoOperacion = statement.executeUpdate() > 0;
			
			connection.commit();
			statement.close();
			connection.close();
			
		}catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();				
		}
		return estadoOperacion;
	}
	
	//Eliminar
	public boolean eliminar(int id_mach) throws SQLException {
		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();
		
		try {
			connection.setAutoCommit(false);
			sql = "DELETE FROM machos WHERE id=?";
			statement = connection.prepareStatement(sql);
			
			statement.setInt(1, id_mach);
			
			estadoOperacion = statement.executeUpdate() > 0;
			
			connection.commit();
			statement.close();
			connection.close();
			
		}catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();				
		}
		return estadoOperacion;
	}
	
	//Listar Todos los Machos
	public java.util.List<macho> obtenerMachos() throws SQLException {
		ResultSet resultSet = null;
		java.util.List<macho> listaMachos = new ArrayList<>();
		
		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();
		
		try {
			sql = "SELECT * FROM machos";
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				macho m = new macho();
				m.setId_mach(resultSet.getInt(1));
				m.setNom_mach(resultSet.getString(2));
				m.setNum_mach(resultSet.getInt(3));
				m.setSex_mach(resultSet.getString(4));
				m.setEdad_mach(resultSet.getString(5));
				m.setFecha_nac(resultSet.getDate(6));
				m.setFecha_reg(resultSet.getDate((7)));
				m.setFeha_actu(resultSet.getDate(8));
				
				listaMachos.add(m);
				
			}
			
		}catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}
		
		return listaMachos;
	}
	
	//Listar Macho
	public macho obtenerMacho(int id_mach) throws SQLException {
		ResultSet resultSet = null;
		macho m = new macho();
		
		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();
		
		try {
			sql = "SELECT * FROM machos WHERE id=?";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id_mach);
			
			resultSet = statement.executeQuery(sql);
			
			if(resultSet.next()) {
			
				m.setId_mach(resultSet.getInt(1));
				m.setNom_mach(resultSet.getString(2));
				m.setNum_mach(resultSet.getInt(3));
				m.setSex_mach(resultSet.getString(4));
				m.setEdad_mach(resultSet.getString(5));
				m.setFecha_nac(resultSet.getDate(6));
				m.setFecha_reg(resultSet.getDate((7)));
				m.setFeha_actu(resultSet.getDate(8));
				
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return m;
	}
	
	//Obtener Conexion Pool
	private Connection obtenerConexion() throws SQLException {
		return Conexion.getConnection();
	}

}

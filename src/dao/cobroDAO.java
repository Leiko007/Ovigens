package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexion.Conexion;
import modelo.cobro;

public class cobroDAO {
	
	private Connection connection;
	private PreparedStatement statement;
	private boolean estadoOperacion;
	
	//Guardar
	public boolean guardar(cobro ovigen) throws SQLException {
		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();
		
		try {
			connection.setAutoCommit(false);
			sql = "INSERT INTO cobros (id_cob, fecha_cob, nom_cob, dir_cob, cuit_cob, tel_cob, obs_cob) VALUES(?,?,?,?,?,?,?)";
			statement = connection.prepareStatement(sql);
			
			statement.setString(1, null);
			statement.setDate(2, ovigen.getFecha_cob());
			statement.setString(3, ovigen.getNom_cob());
			statement.setString(4, ovigen.getDir_cob());
			statement.setInt(5, ovigen.getCuit_cob());
			statement.setInt(6, ovigen.getTel_cob());
			statement.setString(7, ovigen.getObs_cob());
			
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
	
	//Obtener Conexion Pool
		private Connection obtenerConexion() throws SQLException {
			return Conexion.getConnection();
		}

}

package db;

import java.sql.*;


public class Conexao {
	private Connection con;

	public Connection conectar() {

		try {
			String d = "jdbc:mysql://localhost/curso_java_web?user=root&password=";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.con = DriverManager.getConnection(d);
			return this.con;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  null;

	}
	
	
	public void desconectar(){
		try {
			this.con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

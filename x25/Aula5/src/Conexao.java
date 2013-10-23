import java.sql.*;

class Conexao {
	public static void main(String[] args) {
		try {

			String d = "jdbc:mysql://localhost/curso_java?user=root&password=";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn = DriverManager.getConnection(d);
			
			System.out.println("Sucesso de conexao");
			
			String sql = "INSERT INTO usuarios ( nome,login,senha) VALUES (?,?,?)";
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.setString(1,"Rosimarival");
					ps.setString(2,"rose");
					ps.setString(3,"123456");
					ps.execute();

			
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery("Select * from usuarios");


			while(rs.next()){
			    System.out.println(rs.getString("id"));
			    System.out.println(rs.getString("nome"));
			}
			
			System.out.println("---------------");
			
			String sql2 = "Select * from usuarios  where id=?";
					PreparedStatement ps2 = conn.prepareStatement(sql2);
					ps2.setInt(1,10);
					ResultSet rs2 = ps2.executeQuery();
			while(rs2.next()){
			    System.out.println(rs2.getString("id"));
			    System.out.println(rs2.getString("nome"));
			}		
					
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
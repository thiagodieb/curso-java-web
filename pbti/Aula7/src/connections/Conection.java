package connections;
import java.sql.Connection;
import java.sql.DriverManager;


public class Conection {
	
	private static Connection conn;
	
	public static Connection getConection(){

		if(Conection.conn == null){
			String d = "jdbc:mysql://localhost/aula6?user=root&password=";
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				Conection.conn = DriverManager.getConnection(d);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}

}

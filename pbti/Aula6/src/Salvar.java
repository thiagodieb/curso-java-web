
import db.Conexao;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class Salvar extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Conexao c = new Conexao();
		String sql = "insert into alunos  (id,nome,login,senha) values (null,?,?,?)";
		
		
		try {
			
			PreparedStatement stmt = c.conectar().prepareStatement(sql);
			stmt.setString(1,"Cremilda");
			stmt.setString(2, "crecre");
			stmt.setString(3, "1010");
			stmt.execute();
			
			response.getWriter().println("Sucesso ao salvar!");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	
	}
	 

}

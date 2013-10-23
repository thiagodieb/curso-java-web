import java.io.*; 
import java.sql.*; 
import javax.servlet.*;
import javax.servlet.http.*; 
public class Inserir extends HttpServlet {
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
 		try {
 			String d ="jdbc:mysql://localhost/curso_java_web?user=root&password=";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con =  DriverManager.getConnection(d);
 			String sql = "insert into alunos  (id,nome,login,senha) values (null,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
 			stmt.setString(1, request.getParameter("nome"));
			stmt.setString(2, request.getParameter("email"));
			stmt.setString(3, request.getParameter("senha"));
 			stmt.execute();
			stmt.close();
			response.getWriter().write("Gravado com Sucesso");
			con.close();
		} catch (Exception e) { 
			e.printStackTrace();
		}
	} 
}



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
public class Exemplo1 extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession  s = request.getSession(true);
			String nome = request.getParameter("nome");
			int idade = Integer.parseInt(request.getParameter("idade"));
			Pessoa p = new Pessoa(nome,idade);
			s.setAttribute("pessoa",p);
			response.sendRedirect("Exemplo2");

	}
 

}

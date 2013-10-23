

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
public class Exemplo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession  s = request.getSession(true);
		Pessoa crecre = (Pessoa) s.getAttribute("pessoa");
		response.getWriter().println("Nome:"+crecre.getNome());
		response.getWriter().println("Idade:"+crecre.getIdade());
	
	}

	 
}

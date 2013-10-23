

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
public class VerificarSistema extends HttpServlet {
	  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("user");
		String senha = request.getParameter("pass");
		
		if(usuario.equals("java") && senha.equals("101010")){
			HttpSession s = request.getSession(true);
			s.setAttribute("logado","true");
			
			response.sendRedirect("exercicio3/sistema.html");
		}else{
			response.sendRedirect("exercicio3");
		}
	
	}

}

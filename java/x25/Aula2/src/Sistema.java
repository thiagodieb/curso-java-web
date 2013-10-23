

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
public class Sistema extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s = request.getSession(true);
		
		if(s.getAttribute("logado") != null && s.getAttribute("logado").equals("true") ){
			response.getWriter().print("sistema");
		}else{
			response.sendRedirect("/Aula2/exercicio3");
		}
		
		
		
	
	}
 

}

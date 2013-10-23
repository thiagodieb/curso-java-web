

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ExemploMetodos extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Enumeration en = request.getParameterNames();
		response.getWriter().print("<html><head><title>Exemplo de Metodos</title></head><body>");
		while (en.hasMoreElements()) {
			String nomeParametro = (String) en.nextElement();
			response.getWriter().print(nomeParametro+":");
			response.getWriter().println(request.getParameter(nomeParametro)+"<br/>");

		}
		
		Enumeration en2 = request.getHeaderNames();
		while (en2.hasMoreElements()) {
			String nomeHeader = (String) en2.nextElement();
			response.getWriter().print(nomeHeader+":");
			response.getWriter().println(request.getHeader(nomeHeader)+"<br/>");

		}
		response.getWriter().print("</body></html>");	
		response.setContentType("text/html");
		response.sendRedirect("http://dieb.com.br");
		
	}

}

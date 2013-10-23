
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Exemplo extends HttpServlet {
	protected void service(HttpServletRequest request,
						 HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Exemplo de servlet "+ nome)	;
		out.println("</body>");
		out.println("</html>");
		
		
	}

}

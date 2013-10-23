import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Exemplo extends HttpServlet {
	
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Exemplo de servlet");
		out.println("</body>");
		out.println("</html>");
	}
	
}

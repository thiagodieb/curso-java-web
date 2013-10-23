import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class CapturandoCookie extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Cookie[] cs = request.getCookies(); 
		
		for (Cookie cookies : cs) {
			out.print(cookies.getName()+ ":");
			out.println(cookies.getValue());
			
		}
		
		
		out.println("Cookies capturando...");
	}
}
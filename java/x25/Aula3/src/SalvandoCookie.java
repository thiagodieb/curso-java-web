import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class SalvandoCookie extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Cookie cookie = new Cookie("name_user", "Cremilda");
		Cookie cookie2 = new Cookie("validacao", "true");
		cookie.setMaxAge(3*60);
		response.addCookie(cookie);
		response.addCookie(cookie2);
		out.println("Cookies gerado...");
				
		
	}
}
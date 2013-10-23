

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class MeusCookies extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Cookie cookie = new Cookie("name_user","Cremilda");
		cookie.setMaxAge(60);
		response.addCookie(cookie);
		out.println("Cookies gerado...");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Cookie[] cs = request.getCookies();
 		for (Cookie cookies : cs) {
			out.println(cookies.getValue());
		}
 		out.println("Cookies capturados...");
	}

}

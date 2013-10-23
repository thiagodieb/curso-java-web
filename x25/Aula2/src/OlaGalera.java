import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class OlaGalera extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>\n" + "<head><title>Hello WWW</title></head>" +
				"<body>Post.......</body></html>");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>\n" + "<head><title>Hello WWW</title></head>" +
				"<body>GEt..........</body></html>");
	}
}
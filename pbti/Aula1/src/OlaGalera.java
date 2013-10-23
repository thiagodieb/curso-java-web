import java.io.*;
import java.util.Enumeration;
 
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;

public class OlaGalera extends HttpServlet {

	
 	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
 		PrintWriter out = arg1.getWriter();
		out.println("<html>\n" + "<head><title>Ola Galera</title></head>\n<body>\n"); 
		super.service(arg0, arg1);
	}	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h1>Envio Get</h1>\n" + "</body></html>");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		Enumeration e = request.getParameterNames();
		while (e.hasMoreElements()) {
			String parameter = (String) e.nextElement();
			out.println(parameter+": "+ request.getParameter(parameter));
		}

		out.println("<h1>Envio Post</h1>\n" + "</body></html>");
	}
}
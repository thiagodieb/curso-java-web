import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class CapturandoSession extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		out.println(session.getAttribute("logado"));
	}
}
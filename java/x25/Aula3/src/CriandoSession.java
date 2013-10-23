import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class CriandoSession extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(true);
		session.setAttribute("logado", "Cremilda.Silva");

	}
}
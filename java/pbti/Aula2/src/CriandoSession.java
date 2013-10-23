

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
public class CriandoSession extends HttpServlet {
    
    public CriandoSession() {
        super();
     }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		Pessoa c = new Pessoa();
		c.nome = "Cremilda Santos";
		c.idade = 58;
		session.setAttribute("logado", c);

	}
 
}

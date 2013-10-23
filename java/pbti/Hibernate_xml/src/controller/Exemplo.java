package controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import org.hibernate.*;
import conexao.ConexaoHibernate;
 
public class Exemplo extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionFactory s = ConexaoHibernate.createSession();
		Session conexao = s.openSession();
		response.getWriter().write("Conectou");
		conexao.close();
	}

	 
}

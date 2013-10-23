

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ListaProduto extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession s = request.getSession(true);
		Object j = s.getAttribute("Produtos");
		
		if(j != null){
			ArrayList lista = (ArrayList) j;
			Iterator i = lista.iterator();
			while (i.hasNext()) {
				Produto p = (Produto) i.next();
				response.getWriter().println("<p>"+p.nome+"  |  "+p.quantidade+"</p>");
			}	
		}else{
			response.getWriter().println("<p>Não há produtos</p>");
		}
	
	}

}

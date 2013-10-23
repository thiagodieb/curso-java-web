

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
public class SalvaProduto extends HttpServlet {
 
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String p = request.getParameter("produto");
		Integer q = Integer.parseInt(request.getParameter("quantidade"));
		if(p != null && q != null){

			HttpSession s = request.getSession(true);
			Object j = s.getAttribute("Produtos");
			ArrayList lista;
			if(j != null){
				lista = (ArrayList) j;
			}else{
				lista = new ArrayList();
			}

			lista.add(new Produto(p,q));
			s.setAttribute("Produtos",lista);
			
			response.sendRedirect("/Aula2/exercicio");

			
		}else{
			response.sendRedirect("/Aula2/exercicio/erro.html");
		}
		
	
	}

}



import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdicionarProduto extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nomeProduto = request.getParameter("produto");
		String quantidadeProduto = request.getParameter("quantidade");
		if(quantidadeProduto != null && nomeProduto != null){
		
			Produto p = new Produto(nomeProduto,Integer.parseInt(quantidadeProduto));
			
			HttpSession s = request.getSession(true);
			ArrayList carrinho = (ArrayList) s.getAttribute("carrinho");
		
			if(carrinho == null){
				carrinho = new ArrayList();
			}
			
			carrinho.add(p);
			
			s.setAttribute("carrinho", carrinho);
			
			response.sendRedirect("/Aula3/exercicio2/adicionarProduto.jsp");
		}else{
			response.sendRedirect("/Aula3/exercicio2");	
		}
		
	}

}

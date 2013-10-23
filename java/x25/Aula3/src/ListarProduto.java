

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
public class ListarProduto extends HttpServlet {
	  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession s = request.getSession(true);
		
		ArrayList carrinho = (ArrayList)s.getAttribute("carrinho");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><head><title>Lista de Produtos</title></head><body>");
		out.write("<table border='1'>");
		
		out.write("<tr>");
		out.write("<td>Produto</td>");
		out.write("<td>Quantidade</td>");
		out.write("</tr>");
		
		Iterator i  = carrinho.iterator();
		while(i.hasNext()){
			Produto p = (Produto) i.next();
			out.write("<tr>");
			out.write("<td>"+p.getNome()+"</td>");
			out.write("<td>"+p.getQuatidade()+"</td>");
			out.write("</tr>");
 		}
		
		out.write("</table></body></html>");
		
		
		
		
		
		System.out.println(carrinho);
	
	
	}
 
}

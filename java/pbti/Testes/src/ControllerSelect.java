
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;

import beans.Aluno;
import beans.Curso;

public class ControllerSelect extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try {
			Conexao c = new Conexao();
			Session session = c.conectar();
 
			 List<Aluno> lista = new ArrayList<Aluno>(); 
 			   Query query = session.createQuery("from Aluno");
			   lista = query.list(); 
			   
			   Iterator i = lista.iterator();
			   while (i.hasNext()) {
					Aluno aluno = (Aluno) i.next();
					response.getWriter().print(aluno.getNome()+"<br/>");
					response.getWriter().print(aluno.getCurso().getNome());
					response.getWriter().print("<br/>");
				}
				   
			   System.out.println(lista);
			c.desconectar();
			response.getWriter().print("sucesso");
		} catch (Throwable e) {
			e.printStackTrace();
			response.getWriter().print(e);
		}

	}
}

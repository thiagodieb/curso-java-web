

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import db.Conexao;
import beans.*;

/**
 * Servlet implementation class ExemploConsulta
 */
public class ExemploConsulta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExemploConsulta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session s = Conexao.getSession(); 
		response.getWriter().write("OK, conectou");
		Transaction t =  s.beginTransaction();
		Query q =  s.createQuery("from Curso");
		ArrayList<Curso> cursos = (ArrayList<Curso>) q.list();
		
		for (Curso c : cursos) {
			response.getWriter().write("Nome: "+c.getNome());
			response.getWriter().write("Turmas: "+c.getTurmas());
			response.getWriter().write("Ementa: "+c.getEmenta().getDescricao());
			
		}
				 
		t.commit();
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

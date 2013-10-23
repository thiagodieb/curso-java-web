

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import beans.Curso;

import db.Conexao;

/**
 * Servlet implementation class ConsultaCurso
 */
public class ConsultaCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaCurso() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		Session s = Conexao.getSession(); 
		
		String d = request.getParameter("id");
		
		if(d == null){
			Query q = s.createQuery("from Curso");
			List<Curso> listagem = (List<Curso>) q.list();
			for (Curso curso : listagem) {
				response.getWriter().write("Nome:"+curso.getNome()+"<br/>");
			}	
		}else{
			Integer id = Integer.parseInt(d);
			Query q = s.createQuery("from Curso where id=:IDCURSO");
			Curso curso = (Curso) q.setInteger("IDCURSO", id).uniqueResult();
			response.getWriter().write("Nome:"+curso.getNome()+"<br/>");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

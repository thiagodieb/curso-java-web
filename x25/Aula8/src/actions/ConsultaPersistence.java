package actions;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import beans.Curso;

 
public class ConsultaPersistence extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("from Curso");
		Curso curso  = (Curso) q.getResultList().get(0);
		List<Curso> cursos  = (List<Curso>) q.getResultList();
		response.getWriter().print(curso.getNome());
		response.getWriter().print(curso.getTurmas());
		response.getWriter().print(curso.getTurmas().get(0).getId());
	
	}

}

package actions;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import beans.Curso;
 
public class ConsultaJPA extends HttpServlet {
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		AnnotationConfiguration an = new AnnotationConfiguration();
		SessionFactory sf = an.configure().buildSessionFactory();
		Session s = sf.openSession();
		Query c = s.createQuery("from Curso");
		Curso curso = (Curso)c .setMaxResults(1).uniqueResult();
		response.getWriter().print(curso.getNome());
		response.getWriter().print(curso.getTurmas());
		response.getWriter().print(curso.getTurmas().get(0).getId());
		response.getWriter().print("OK!");
		s.close();
	
	
	}
 

}

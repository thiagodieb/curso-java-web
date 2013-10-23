package actions;

import java.io.IOException;

import javax.persistence.Transient;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class ConexaoHibernateJpa extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		AnnotationConfiguration an = new AnnotationConfiguration();
		SessionFactory  sf = an.configure().buildSessionFactory();
		Session s = sf.openSession();
		response.getWriter().write("conexao ok!");
		s.close();

		
		
		
	}

}

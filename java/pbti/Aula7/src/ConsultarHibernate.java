

import java.io.IOException;
import java.util.Iterator;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Curso;

public class ConsultarHibernate extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Configuration con = new Configuration();
		SessionFactory  sf = con.configure().buildSessionFactory();
		Session s = sf.openSession();
			response.getWriter().write("conexao ok!");
			Transaction t = s.getTransaction();
			t.begin();
				//Query q = s.createQuery("select nome from Curso");
				//s.createSQLQuery();
				Query q = s.createQuery("from Curso");
				List listaDeCursos = q.list();
				t.commit();
				Iterator i = listaDeCursos.iterator();
				while (i.hasNext()) {
					Curso curso = (Curso) i.next();
					response.getWriter().write(curso.getNome()+" |  "+curso.getCargaHoraria()+" | "+curso.getCoordenador().getNome()+"<br/>");
					//response.getWriter().write(i.next()+"<br/>");
				}
//				for (Curso curso : listaDeCursos) {
//					
//				}
				 
		s.close();
		
	}

}

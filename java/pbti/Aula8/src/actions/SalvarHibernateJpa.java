package actions;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import beans.*;

public class SalvarHibernateJpa extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		AnnotationConfiguration an = new AnnotationConfiguration();
		SessionFactory  sf = an.configure().buildSessionFactory();
		Session s = sf.openSession();
		response.getWriter().write("conexao ok!");
		Transaction  t = s.beginTransaction();
			Curso curso = new Curso();
			//curso.setIdCurso(1);
			curso.setNome("Curso Oracle");
			Coordenador co = new Coordenador();
			co.setNome("Joaquim da Silva");
			co.setCurriculo("Nada a declarar....");
			curso.setCo(co);
			s.save(curso);
			
			Turma turma = new Turma();
			turma.setCursoX(curso);
			turma.setNome("Turma da PBTI");
			s.save(turma);
			
			
			
		t.commit();
		s.close();

	
	}

}



import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import beans.Aluno;
import beans.Curso;
import beans.Endereco;
import beans.Turma;
 
public class Listagem extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.getTransaction();
		t.begin();
		List<Aluno> alunos = s.createQuery("from Aluno").list();
		Iterator it =  alunos.iterator();
		while(it.hasNext()){
			Aluno a = (Aluno)it.next();
			response.getWriter().println("<b>Nome:</b>"+a.getNome()+"<br/>");
			response.getWriter().println("<b>Logadouro:</b>"+a.getEndereco().getLogadouro()+"<br/>");
			response.getWriter().println("<b>cpf:</b>"+a.getEndereco().getAluno().getCpf()+"<br/>");
			response.getWriter().println("<b>turmas:</b>"+a.getTurmas()+"<br/>");
			response.getWriter().println("<hr/>");
		}
		response.getWriter().println("<p>------</p>");
		
		List<Curso> cursos = s.createQuery("from Curso").list();
		Iterator it2 =  cursos.iterator();
		while(it2.hasNext()){
			Curso a = (Curso)it2.next();
			response.getWriter().println("<b>turmas:</b>"+a.getTurmas()+"<br/>");
			response.getWriter().println("<hr/>");
		}
		response.getWriter().println("<p>------</p>");

		List<Turma> turmas = s.createQuery("from Turma").list();
		Iterator ss =  turmas.iterator();
		while(ss.hasNext()){
			Turma a = (Turma) ss.next();
			response.getWriter().println("<b>turma:</b>"+a.getNome()+"<br/>");
			response.getWriter().println("<b>turma:</b>"+a.getAlunos()+"<br/>");

			response.getWriter().println("<hr/>");
		}
	
		
		t.commit();
	
	}

	 

}

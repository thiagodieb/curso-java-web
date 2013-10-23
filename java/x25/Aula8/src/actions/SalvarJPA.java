package actions;

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

import beans.*;
 
public class SalvarJPA extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AnnotationConfiguration an = new AnnotationConfiguration();
		
		SessionFactory sf = an.configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Curso curso = new Curso();
		curso.setNome("Curso completo java Web");
		Turma turma = new Turma();
		turma.setCurso(curso);
		
		List<Turma> turmas = new ArrayList<Turma>();
		turmas.add(turma);
		curso.setTurmas(turmas);
		
		s.save(curso);
		
		Aluno aluno1 = new Aluno();
		aluno1.setNomeAluno("Cremilda");
		Aluno aluno2 = new Aluno();
		aluno2.setNomeAluno("Perolina");
		
		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(aluno1);
		alunos.add(aluno2);
		
		turma.setAlunos(alunos);
		
		
		response.getWriter().print("OK!");
		t.commit();
		s.close();
	
	}
 

}

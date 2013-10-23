

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
 
import beans.*; 

public class Cadastro extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AnnotationConfiguration ann = new AnnotationConfiguration();
		ann.addAnnotatedClass(Curso.class);
		ann.addAnnotatedClass(Turma.class);
		ann.addAnnotatedClass(Endereco.class);
		ann.addAnnotatedClass(Aluno.class);
		ann.addAnnotatedClass(Pessoa.class);
		ann.addAnnotatedClass(PessoaFisica.class);

		
		SessionFactory sf = ann.configure().buildSessionFactory();
	    

		Session s = sf.openSession();
		Transaction t = s.getTransaction();
		t.begin();
 		Curso c = new Curso();
		s.save(c);
		
		Endereco e = new Endereco("Rua arara","Aguas Claras","DF","Taguatinga");
		Aluno a = new Aluno("Thiago dieb","000000000",e);
		Turma turma = new Turma("Java Web", new Date(), new Date(), c);
		Turma turma2 = new Turma("Java", new Date(), new Date(), c);
		s.save(turma);
		s.save(turma2);
		//a.setId(11L);
		s.merge(a);
		response.getWriter().print("ID:"+a.getId());
		ArrayList array = new ArrayList();
		array.add(turma);
		array.add(turma2);
		a.setTurmas(new HashSet(array));
		PessoaFisica p = new PessoaFisica("Thiago Dieb","00514893176");
		s.save(p);
		Pessoa p2  = new Pessoa("Ticiane");
		//s.save(a);
		s.save(p2);
		a.setCpf("2ssss2020202");
		a.setNome("NNDD");
		s.persist(a);
		//a = (Aluno) s.merge(a);
		t.commit();
		Aluno b = (Aluno) s.get(Aluno.class, 1L);
		response.getWriter().print("ID:"+a.getId());
		response.getWriter().print("ID:"+b.getId());
		
	}

}

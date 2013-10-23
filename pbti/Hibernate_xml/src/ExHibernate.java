	

import java.io.IOException;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import beans.*;

public class ExHibernate extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Configuration cf = new Configuration();
		SessionFactory sf = cf.configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.getTransaction();
		
		response.getWriter().write("Conectou   |   ");
		
		t.begin();
		Curso c = new Curso();
		c.setNome("Java Web");
		c.setCargaHoraria(10);
		
		Turma turma1 = new Turma("101",new Date(),new Date());
		Turma turma2 = new Turma("103",new Date(),new Date());
		turma1.setCurso(c);
		turma2.setCurso(c);
				
		Aluno aluno = new Aluno("Dieb","0000",10,null,new Endereco("longe","aguas claras","Brasili","DF",null));
		aluno.getEndereco().setAluno(aluno);
		ArrayList  turmas  = new ArrayList(); 
		turmas.add(turma1);
		turmas.add(turma2);
		aluno.setTurmas(new HashSet(turmas));
		

		s.save(aluno);
		s.save(turma1);
		s.save(turma2);
		s.save(c);
		
		t.commit(); 
		
		response.getWriter().write("Salvou");
		s.close();
	}
 
}

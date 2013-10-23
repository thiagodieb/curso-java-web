

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;
import antlr.collections.List;
import beans.Coordenador;
import beans.Curso;
import beans.Turma;
 
public class SalvarHibernate extends HttpServlet {
	 
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try{
		Configuration con = new Configuration();
		SessionFactory  sf = con.configure().buildSessionFactory();
		Session s = sf.openSession();
			response.getWriter().write("conexao ok!");
			Transaction t = s.getTransaction();
			t.begin();
				Turma turma = new Turma();
				turma.setNome("turma de janeiro");
				
				ArrayList turmas = new ArrayList();
				turmas.add(turma);
				
				Curso c = new Curso();
				c.setCargaHoraria(10);
				c.setNome("Curso de Java Web");
				Coordenador co = new Coordenador();
				co.setNome("Rosimarival");
				c.setCoordenador(co);
				co.setCurso(c);
				//turma.setCurso(c);
				s.save(c);
				c.setNome("Cremilda");
				c.setTurmas(new HashSet(turmas));
				//s.save(turma);

			t.commit();
			
		s.close();
		}catch(Exception e){
			response.getWriter().write(e.getMessage());	
		}
		}
 

}


import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.*;
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
import beans.Pessoa;
import beans.PessoaFisica;
import beans.Turma;

/**
 * Servlet implementation class Teste2
 */
public class Teste2 extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	 
		 EntityManager entityManager = null;
 		      //Obtém o factory a partir da unidade de persistência.
		 EntityManagerFactory   factory = Persistence.createEntityManagerFactory("curso");
 		      //Cria um entity manager.
		 entityManager = factory.createEntityManager();
		      //Fecha o factory para liberar os recursos utilizado.
//		      
//		Session s = sf.openSession();
//		Transaction t = s.getTransaction();
//		t.begin();
		Endereco e = new Endereco("Rua arara", "Aguas Claras", "DF",
				"Taguatinga");
		Aluno a = new Aluno("Ticiane dieb", "000000000222", e);
		 
		 EntityTransaction t =  entityManager.getTransaction();
		 t.begin();
		 a = entityManager.merge(a);
		 a.setCpf( "aaaa");
		 entityManager.merge(a);
		 //entityManager.remove(a);
		 t.commit();
		 
//		s.save(a);
//		s.clear();
//		a.setCpf("1111");
//		response.getWriter().print("ID:" + a.getId());
//		t.commit();
		//Aluno b = (Aluno) s.get(Aluno.class, 1L);
		//response.getWriter().print("ID:" + b.getId());

	}

}

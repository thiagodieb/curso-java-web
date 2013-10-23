

import java.io.IOException;

import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import db.Conexao;
import beans.*;

/**
 * Servlet implementation class ExemploOneToOne
 */
public class ExemploAssociacao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExemploAssociacao() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session s = Conexao.getSession(); 
		Transaction t = s.beginTransaction();
		response.getWriter().write("OK, conectou");
			Ementa em =  new Ementa();
			Turma tu = new Turma();
			tu.setHorario(10);
			tu.setProfessor("Dieb");
			Turma tu2 = new Turma();
			tu2.setHorario(9);
			tu2.setProfessor("Rogerio");
			
			em.setDescricao("Curso muito bom com professor dieb....");
			Aluno l1 = new Aluno(0, "Cremilda", 18, null);
			Aluno l2 = new Aluno(0, "Rosimarival", 78, null);
			
			List alunos = new ArrayList();
			alunos.add(l1);
			alunos.add(l2);
			tu2.setAlunos(new HashSet(alunos));
			
			List turmas = new ArrayList();
			turmas.add(tu);
			turmas.add(tu2);
			
			List turmas2 = new ArrayList();
			turmas2.add(tu2);
			
			l1.setTurmas(new HashSet(turmas2));
			l2.setTurmas(new HashSet(turmas2));
			
			Curso c = new Curso(0, "Java Web", 52, em,new HashSet(turmas));
			em.setCurso(c);
			s.save(tu);
			s.save(tu2);
			s.save(l1);
			s.save(l2);
		s.save(c);
		s.save(em);
	
		t.commit();
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}



import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import db.Conexao;

import beans.Curso;
 
public class ExemploHibernate extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session s = Conexao.getSession(); 
		response.getWriter().write("OK, conectou");
		Transaction t =  s.getTransaction();
		try{
		t.begin();
			Curso curso = new Curso();
			curso.setNome("Java Web - Completo");
			curso.setCargaHoraria(200);
			s.save(curso);
		t.commit();
		}catch(Exception e){
			t.rollback();
			e.printStackTrace();
		}
		System.out.println(t);
		s.close();
		
	}

	 
}

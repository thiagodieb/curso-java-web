

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.*;
 
public class Listar extends HttpServlet {
	 

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Configuration cf = new Configuration();
		SessionFactory sf = cf.configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.getTransaction();
		t.begin();
		Query consulta;
		if(request.getParameter("id") != null){
			int id = Integer.parseInt(request.getParameter("id"));
			consulta = s.createQuery("from Curso where id = ?");
			consulta.setInteger(0, id);
			Curso c = (Curso) consulta.uniqueResult();
		}else{
			consulta = s.createQuery("from Curso");
		}
		List lista = consulta.list();
		
		Iterator it = lista.iterator();
		while (it.hasNext()) {
			Curso curso = (Curso) it.next();
			response.getWriter().write(curso.getNome()+"<br/>");
			response.getWriter().write(curso.getTurmas() +"<br/>");
			Iterator i = curso.getTurmas().iterator();
			while (i.hasNext()) {
				Turma t2 = (Turma) i.next();
				response.getWriter().write("<b>"+t2.getId()+"<b/>");
				response.getWriter().write("<b>"+t2.getCurso().getNome()+"<b/> <hr/>");
				response.getWriter().write("<b>"+t2.getAlunos()+"<b/> <hr/>");
			}

		}
		response.getWriter().write("<hr/>");

		Query consulta2 = s.createQuery("from Aluno");
		lista =null;
		lista = consulta2.list();
		t.commit();
		
		it = lista.iterator();
		
		while (it.hasNext()) {
			Aluno alun = (Aluno) it.next();
			response.getWriter().write("<b>"+alun.getNome()+"<b/>");
			response.getWriter().write("<b>"+alun.getTurmas()+"<b/>");
			//response.getWriter().write("<b>"+alun.getEndereco().getLogadouro()+"<b/><br/>");
		}
		
		s.close();
	}
 
}

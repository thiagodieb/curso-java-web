

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Curso;

import com.sun.j3d.utils.universe.ConfiguredUniverse;

public class ConexaoHibernate extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		Configuration con = new Configuration();
		SessionFactory  sf = con.configure().buildSessionFactory();
		Session s = sf.openSession();
			response.getWriter().write("conexao ok!");
		
			s.close();
		 
	}



}

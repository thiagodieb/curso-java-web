
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import beans.Aluno;
import beans.Curso;
 
public class Controler extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {
			Conexao c = new Conexao();
			Session session = c.conectar();
			
			Set listAlunos = new  HashSet();
			Curso curso = new Curso();
			curso.setDuracao("10");
			curso.setNome("Java Web");
			curso.setTurno("Vespertino");
			
			Aluno aluno = new Aluno();
			aluno.setNome("Thiwago Dieb");
			aluno.setLogin("diweb");
			aluno.setSenha("10w010");
			aluno.setCurso(curso);

			//listAlunos.add(aluno);  
			//curso.setAlunos(listAlunos); 
			session.save(curso);
			session.save(aluno); 
			
			c.desconectar();
			response.getWriter().print("sucesso");
		} catch (Throwable e) {
			e.printStackTrace();
			 response.getWriter().print(e);
		}
	}

}

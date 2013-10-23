package exercicio2;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
public class CadastrarAluno extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("/Aula4/exercicio2/cadastro_aluno.jsp");
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String matricula = request.getParameter("matricula");
		String turma = request.getParameter("turma");
		int serie = Integer.parseInt(request.getParameter("serie"));
		
		Aluno aluno = new Aluno(nome,matricula,serie,turma);
		
		HttpSession s = request.getSession(true);
		ArrayList lista;
		lista = (ArrayList) s.getAttribute("dados");
		if(lista == null)
			lista = new ArrayList();
		lista.add(aluno);
		s.setAttribute("dados", lista);
		System.out.println((ArrayList) s.getAttribute("dados"));
		response.sendRedirect("/Aula4/exercicio2/visualiza_aluno.jsp");
	
	}

}







package exercicio2;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CadastrarAluno extends HttpServlet {
	public CadastrarAluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession s = request.getSession(true);
		
		Object sessionAlunos = s.getAttribute("Alunos");
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		Aluno aluno = capturarDados(request);
		
		if (sessionAlunos != null) {
			alunos = (ArrayList<Aluno>) sessionAlunos;
		}
		
		alunos.add(aluno);
		s.setAttribute("Alunos", alunos);
		response.sendRedirect("/Aula3/exercicio2/listaAlunos.jsp");
	}

	private Aluno capturarDados(HttpServletRequest request) {

		Aluno aluno = new Aluno(request.getParameter("nome"),
				request.getParameter("matricula"),
				request.getParameter("turma"), Integer.parseInt(request
						.getParameter("serie")), new ArrayList<Pontuacao>());
		return aluno;

	}

}

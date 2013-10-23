package exercicio2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CadastrarNota extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CadastrarNota() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s = request.getSession(true);
		ArrayList<Aluno> alunos = (ArrayList<Aluno>) s.getAttribute("Alunos");
		
		if(alunos != null){
			Pontuacao p = criarNota(request);
			Aluno aluno = buscaAluno(alunos,request.getParameter("matricula"));
			
			if(aluno != null){
				aluno.pontuacao.add(p)	;
				response.sendRedirect("/Aula3/exercicio2/listaAlunos.jsp");
			}else{
				response.sendRedirect("/Aula3/exercicio2/error.jsp");	
			}
		}else{
			response.sendRedirect("/Aula3/exercicio2/error.jsp");
		}
		
	}
	private Pontuacao criarNota(HttpServletRequest request){
		Pontuacao p = new Pontuacao(
					Double.parseDouble(request.getParameter("nota")),
					request.getParameter("materia"));
		return p;
	
	}
	
	public static Aluno buscaAluno(ArrayList<Aluno> alunos, String matricula){
		Iterator lista = alunos.iterator();
		while (lista.hasNext()) {
			Aluno aluno = (Aluno) lista.next();
			if(aluno.matricula.equals(matricula)){
				return aluno;
			}
			
		}
		return null;
	}

}

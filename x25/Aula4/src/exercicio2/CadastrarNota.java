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
	 
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String matricula = request.getParameter("matricula");
		double ponto = Double.parseDouble(request.getParameter("ponto"));
		String materia = request.getParameter("materia");
		
		HttpSession s = request.getSession(true);
		ArrayList lista = (ArrayList) s.getAttribute("dados");
		
		Nota nota = new Nota(materia,ponto);
		
		if(lista != null){
			Aluno aluno = buscaAluno(lista, matricula);
			aluno.getNotas().add(nota);
			response.sendRedirect("/Aula4/exercicio2/visualiza_aluno.jsp");
		}else{
			response.sendRedirect("/Aula4/exercicio2");
		}	
	}
	
	public static Aluno buscaAluno(ArrayList lista, String matricula){
		Aluno aluno = null;
		Iterator i = lista.iterator();
		while(i.hasNext()){
			aluno = (Aluno)i.next();
			if(aluno.getMatricula().equals(matricula)){
				return aluno;
			}
		}
		return aluno;
	}

}









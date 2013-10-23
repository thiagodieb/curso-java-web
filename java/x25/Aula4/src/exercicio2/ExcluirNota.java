package exercicio2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
public class ExcluirNota extends HttpServlet {
	 
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String materia = request.getParameter("materia");
		String matricula = request.getParameter("matricula");
		
		HttpSession s = request.getSession(true);
		ArrayList lista = (ArrayList) s.getAttribute("dados");
		if(lista != null){
			Aluno aluno = CadastrarNota.buscaAluno(lista, matricula);
			excluirNota(aluno.getNotas(), materia);
			response.sendRedirect("/Aula4/exercicio2/visualiza_aluno.jsp");
		}else{
			response.sendRedirect("/Aula4/exercicio2");
		}	
	}
	
	public static boolean excluirNota(ArrayList<Nota> notas, String materia){
		Nota nota = null;
		Iterator i = notas.iterator();
		while(i.hasNext()){
			nota = (Nota)i.next();
			if(nota.getMateria().equals(materia)){
				i.remove();
				return true;
			}
		}
		return false;
	}

}









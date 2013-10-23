
import dao.AlunoDao;
import db.Conexao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Aluno;
 
public class Consulta extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		AlunoDao alunoDao = new AlunoDao();
		List<Aluno> lista = alunoDao.listar();
		Iterator i = lista.iterator();
		while (i.hasNext()) {
			Aluno aluno = (Aluno) i.next();
			response.getWriter().write(aluno.getNome()+"<br/>");
			if(Integer.parseInt(id) == aluno.getId()){
				alunoDao.excluir(aluno);
			}
			
		}
	
	}
 

}

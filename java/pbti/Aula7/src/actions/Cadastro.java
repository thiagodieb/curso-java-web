package actions;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.*;
import beans.*;

public class Cadastro extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = 0;
		if(request.getParameter("id") != null){
			id = Integer.parseInt(request.getParameter("id")); 
		}
		
		Livro livro = new Livro(id, 
				request.getParameter("titulo"),
				request.getParameter("descricao"),
				request.getParameter("isbn"),
				Integer.parseInt(request.getParameter("paginas")),
				null);
		
		CategoriaDao cDao = new CategoriaDao();
		LivroDao lDao = new LivroDao();
		try {
			Categoria categoria = cDao.getObjectById(Integer.parseInt(request.getParameter("categoria")));
			livro.setCategoria(categoria);
			if(id != 0){
				lDao.update(livro);
			}else{
				lDao.add(livro);	
			}
		} catch (NumberFormatException | SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect("/Aula7/exercicio");		
	}

}

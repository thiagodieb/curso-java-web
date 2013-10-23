package actions;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDao;

import beans.Usuario;
 
public class Controladora extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.exe(request, response);
	} 
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.exe(request, response);
	}

	private void exe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri = request.getRequestURI();
		int last = uri.lastIndexOf('/');
		String action = uri.substring(last+1);
		RequestDispatcher rd = null;
		
		
		if(action.equals("cadastrar.do")){
				rd = request.getRequestDispatcher("/formularioUsuario.jsp");	
		}else if(action.equals("salvar.do")){
			Usuario u = new Usuario(0, request.getParameter("nome"),
					request.getParameter("login"),
					request.getParameter("senha"));
			UsuarioDao uDao = new UsuarioDao();
			uDao.add(u);
			List<Usuario> listagem = uDao.list();
			request.setAttribute("list",listagem);
			rd = request.getRequestDispatcher("/listaUsuario.jsp");
			
		}
		rd.forward(request, response);
	}

}

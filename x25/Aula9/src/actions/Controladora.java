package actions;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDao;

import beans.Usuario;
public class Controladora extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.exec(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.exec(request, response);
	}
	
	private void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri = request.getRequestURI();
		int last  = uri.lastIndexOf('/');
		String action = uri.substring(last+1);
		response.getWriter().print(action);
		
		RequestDispatcher rd = null;
		UsuarioDao uDao = new UsuarioDao();		
		if(action.equals("cadastrar.crecre")){
				rd = request.getRequestDispatcher("/formulario.jsp");
		}else if(action.equals("salvar.crecre")){
			Usuario u = new Usuario(0,
					request.getParameter("nome"),
					request.getParameter("login"),
					request.getParameter("senha"));
			uDao.add(u);
			request.setAttribute("msg","Salvo com sucesso");
			//rd = request.getRequestDispatcher("listar.crecre");
			rd = request.getRequestDispatcher("/formulario.jsp");
		}else if(action.equals("listar.crecre")){
			request.setAttribute("listagem",uDao.list());
			rd = request.getRequestDispatcher("/lista.jsp");
		}else{
			rd = request.getRequestDispatcher("/error.jsp");
		}
		rd.forward(request, response);
		
	}

}






import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class ValidaSession
 */
public class ValidaSession implements Filter {

      
	 
	public void destroy() {
		// TODO Auto-generated method stub
	}
 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest res = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		HttpSession s = res.getSession(true);
		
		if(s.getAttribute("logado") != null && s.getAttribute("logado").equals("true") ){
			chain.doFilter(request, response);
		}else{
			resp.sendRedirect("/Aula2/exercicio3");
		}
		
	}
 
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}



import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
 
public class TesteFilter implements Filter {
	private long start;
	

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		this.start = System.currentTimeMillis();
	}
	
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chart) throws IOException, ServletException {
	  
		long end = System.currentTimeMillis();
		 System.out.println((end - this.start));
		 
	}

}

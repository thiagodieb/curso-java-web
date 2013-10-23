package org.apache.jsp.exemplo2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.*;
import dao.*;
import java.util.*;
import java.sql.*;

public final class cadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=US-ASCII");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=US-ASCII\">\n");
      out.write("<title>Cadastro</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<form action=\"\" method=\"POST\">\n");
      out.write("\t\tNome:<input type=\"text\" name=\"nome\"><br />\n");
      out.write("\t\tTurno:<input type=\"text\" name=\"turno\"><br />\n");
      out.write("\t\tConteudo:<textarea name=\"conteudo\"></textarea><br /> \n");
      out.write("\t\tDuracao:<input type=\"text\" name=\"duracao\"><br /> \n");
      out.write("\t\t<input type=\"submit\"><br />\n");
      out.write("\t</form>\n");
      out.write("\t");

		CursoDao dao = new CursoDao();
		if (request.getMethod() == "POST") {
	
      out.write('\n');
      out.write('	');
      beans.Curso cursoDaCremilda = null;
      synchronized (_jspx_page_context) {
        cursoDaCremilda = (beans.Curso) _jspx_page_context.getAttribute("cursoDaCremilda", PageContext.PAGE_SCOPE);
        if (cursoDaCremilda == null){
          cursoDaCremilda = new beans.Curso();
          _jspx_page_context.setAttribute("cursoDaCremilda", cursoDaCremilda, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("cursoDaCremilda"), request);
      out.write('\n');
      out.write('	');

		
			try {
				dao.add(cursoDaCremilda);
				out.print("Sucesso!");
			} catch (Exception e) {
				out.print("Ocorreu problemas");
				out.print(e.getMessage());
				e.printStackTrace();
			}
		}
		
		
		try {
			List cursos = dao.getObject();
			Iterator it = cursos.iterator();
			while(it.hasNext()){
				Curso c = (Curso) it.next();
				out.print(c.getResultadocompleto());
				out.print("<a href='detalhes.jsp?id="+c.getId()+"'>Detalhes</a>");
				out.print("<hr/>");
			}
			
		} catch (Exception e) {
			out.print("Nenhum valor");
			out.print(e.getMessage());
			e.printStackTrace();
		}
				
	
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

package org.apache.jsp.exercicio2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import exercicio2.*;

public final class visualiza_005faluno_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Visualizar Alunos</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
 ArrayList lista = (ArrayList) session.getAttribute("dados");
	if(lista != null){

      out.write("\n");
      out.write("<table border=\"1\">\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>Matricula</td>\n");
      out.write("\t\t<td>Nome</td>\n");
      out.write("\t\t<td>Serie</td>\n");
      out.write("\t\t<td>Turma</td>\n");
      out.write("\t\t<td>Acoes</td>\n");
      out.write("\t</tr>\n");
      out.write("\t");

	Iterator i = lista.iterator();
	while(i.hasNext()){
		Aluno aluno = (Aluno) i.next();
	
      out.write("\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>");
      out.print(aluno.getMatricula());
      out.write("</td>\n");
      out.write("\t\t<td>");
      out.print(aluno.getNome());
      out.write("</td>\n");
      out.write("\t\t<td>");
      out.print(aluno.getSerie());
      out.write("</td>\n");
      out.write("\t\t<td>");
      out.print(aluno.getTurma());
      out.write("</td>\n");
      out.write("\t\t<td><a href=\"/Aula4/exercicio2/cadastro_nota.jsp?matricula=");
      out.print(aluno.getMatricula());
      out.write("\">Cadastrar Notas</a> | <a href=\"/Aula4/exercicio2/visualiza_nota.jsp?matricula=");
      out.print(aluno.getMatricula());
      out.write("\"> Visualizar Notas </a></td>\n");
      out.write("\t</tr>\n");
      out.write("\t");

	}
	
      out.write("\n");
      out.write("</table>\n");
 } 
      out.write("\n");
      out.write("\n");
      out.write("<a href=\"/Aula4/exercicio2/cadastro_aluno.jsp\" > Cadatrar Aluno</a>\n");
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

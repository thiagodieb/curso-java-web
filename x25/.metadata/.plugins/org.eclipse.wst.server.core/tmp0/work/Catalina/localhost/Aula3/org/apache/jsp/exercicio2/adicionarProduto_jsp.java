package org.apache.jsp.exercicio2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adicionarProduto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Adicionar Produto</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<form action=\"/Aula3/AdicionarProduto\" method=\"POST\">\n");
      out.write("\t<fieldset>\n");
      out.write("\t\t<legend>\tSelecione seu produto</legend>\n");
      out.write("\t\t<label>Produtos</label>\n");
      out.write("\t\t\t<select name=\"produto\">\n");
      out.write("\t\t\t\t<option>Camarao</option>\n");
      out.write("\t\t\t\t<option>Peixe</option>\n");
      out.write("\t\t\t\t<option>Carne</option>\n");
      out.write("\t\t\t\t<option>Ave</option>\n");
      out.write("\t\t\t\t<option>Porco</option>\n");
      out.write("\t\t\t</select>\n");
      out.write("\t\t<label>Quantidade</label>\n");
      out.write("\t\t<input type=\"text\" name=\"quantidade\"/>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t<input type=\"submit\" />\n");
      out.write("\t\t</p>\n");
      out.write("\t</fieldset>\n");
      out.write("\t\n");
      out.write("</form>\n");
      out.write("<a href=\"/Aula3/ListarProduto\"> Visualizar Lista de Produtos</a>\n");
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
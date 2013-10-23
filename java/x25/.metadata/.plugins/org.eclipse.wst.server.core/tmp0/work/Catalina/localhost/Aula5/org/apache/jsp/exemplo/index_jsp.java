package org.apache.jsp.exemplo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html>\n");
      out.write("<head></head>\n");
      out.write("<body>\n");
      out.write("\t<form action=\"\" method=\"POST\">\n");
      out.write("\t\t<input type=\"text\" name=\"nome\"/>\n");
      out.write("\t\t<input type=\"text\" name=\"login\"/> \n");
      out.write("\t\t<input type=\"password\" name=\"senha\"/> \n");
      out.write("\t\t<input type=\"submit\"/>\n");
      out.write("\t</form>\n");
      out.write("\t\n");
      out.write("\t");

		if (request.getMethod() == "POST") {
			try {
				String d = "jdbc:mysql://localhost/curso_java?user=root&password=";
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				Connection con = DriverManager.getConnection(d);
				String sql = "insert into alunos  (id,nome,login,senha) values (null,?,?,?)";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, request.getParameter("nome"));
				stmt.setString(2, request.getParameter("login"));
				stmt.setString(3, request.getParameter("senha"));
				stmt.execute();
				out.write("<h2>Salvo com sucesso!</h2>");
			} catch (Exception e) {
				out.write("Erro");
			}
		}
	
      out.write('\n');
      out.write('\n');
      out.write('	');

		try {
			String d2 = "jdbc:mysql://localhost/curso_java?user=root&password=";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con2 = DriverManager.getConnection(d2);
			PreparedStatement stmt = con2
					.prepareStatement("select * from alunos");
			ResultSet res = stmt.executeQuery();
			while (res.next()) {
				out.write("Nome: " + res.getString("nome"));
				out.write(" Login: " + res.getString("login"));
				out.write("<hr/>");
			}
		} catch (Exception e) {
			out.write("Erro");
		}
	
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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

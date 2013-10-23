package org.apache.jsp.exercicio;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.*;
import dao.*;
import java.util.*;
import beans.*;
import dao.*;
import java.util.*;
import beans.*;
import dao.*;
import java.util.*;
import beans.*;
import dao.*;
import java.util.*;
import beans.*;
import dao.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/exercicio/cadastro.jsp");
    _jspx_dependants.add("/exercicio/select_categoria.jsp");
    _jspx_dependants.add("/exercicio/pesquisa.jsp");
    _jspx_dependants.add("/exercicio/listagem.jsp");
  }

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
      out.write("<title>Gerenciar Livros</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write('\n');

Livro l  = new Livro();
if(request.getParameter("id") != null){
	int id = Integer.parseInt(request.getParameter("id"));
	LivroDao lDao = new LivroDao();
	l = lDao.getObjectById(id);
}

      out.write("\n");
      out.write("<form action=\"/Aula6/Cadastro\" method=\"POST\">\n");
      out.write("\t<fieldset>\n");
      out.write("\t\t<legend>Cadastro de Livros</legend>\n");
      out.write("\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(l.getId() != 0 ? l.getId() : 0);
      out.write("\">\n");
      out.write("\t\t<table>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td><label>Titulo:</label> <input type=\"text\" name=\"titulo\" value=\"");
      out.print(l.getTitulo() != null ? l.getTitulo() : "");
      out.write("\"></td>\n");
      out.write("\t\t\t\t<td rowspan=\"4\"><label>Descricao:</label> <textarea name=\"descricao\">");
      out.print(l.getDescricao() != null ? l.getDescricao() : "");
      out.write("</textarea></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td><label>ISBN:</label> <input type=\"text\" name=\"isbn\" value=\"");
      out.print(l.getIsbn() != null ? l.getIsbn() : "");
      out.write("\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td><label>Paginas:</label> <input type=\"text\" name=\"paginas\" value=\"");
      out.print(l.getPaginas() != 0 ? l.getPaginas() : "");
      out.write("\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td><label>Categoria:</label> ");
      out.write("\n");
      out.write("<select name=\"categoria\">\n");

CategoriaDao c = new CategoriaDao();
List<Categoria> categorias = c.list();
int id = 0;
if(l.getCategoria() != null){
	id = l.getCategoria().getId();	
}
 
for(Categoria categoria: categorias){
      out.write("\n");
      out.write("\t<option value=\"");
      out.print(categoria.getId());
      out.write('"');
      out.write(' ');
      out.print(id == categoria.getId() ? "selected" : "" );
      out.write('>');
      out.print(categoria.getNome());
      out.write("</option>\n");
}
      out.write("\n");
      out.write("</select>\n");
      out.write("</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t<input type=\"submit\">\n");
      out.write("\t</fieldset>\n");
      out.write("</form>");
      out.write('\n');
      out.write("\n");
      out.write("<form action=\"\" method=\"POST\">\n");
      out.write("\t<fieldset>\n");
      out.write("\t\t<label>Titulo/ISBN:</label>\n");
      out.write("\t\t<input name=\"busca\" type=\"text\" size=\"100px\">\n");
      out.write("\t\t<input type=\"submit\">\n");
      out.write("\t</fieldset>\n");
      out.write("</form>");
      out.write('\n');
      out.write('\n');

LivroDao lDao = new LivroDao();
List<Livro> livros = null;
if(request.getMethod().equals( "POST") && request.getParameter("busca") != null){
	String busca  = request.getParameter("busca");
	livros = lDao.find(busca);
}else{
	livros = lDao.list();	
}


if(livros != null){

      out.write("\n");
      out.write("<table borde=\"1\">\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>Titulo</td>\n");
      out.write("\t\t<td>ISBN</td>\n");
      out.write("\t\t<td>Categoria</td>\n");
      out.write("\t\t<td>Paginas</td>\n");
      out.write("\t\t<td>Acoes</td>\n");
      out.write("\t</tr>\n");
      out.write("\t");
 for(Livro livro: livros){ 
      out.write("\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>");
      out.print(livro.getTitulo());
      out.write("</td>\n");
      out.write("\t\t<td>");
      out.print(livro.getIsbn());
      out.write("</td>\n");
      out.write("\t\t<td>");
      out.print(livro.getCategoria().getNome());
      out.write("</td>\n");
      out.write("\t\t<td>");
      out.print(livro.getPaginas());
      out.write("</td>\n");
      out.write("\t\t<td><a href=\"/Aula6/Excluir?id=");
      out.print(livro.getId());
      out.write("\"><button>Excluir</button></a> | <a href=\"/Aula6/exercicio?id=");
      out.print(livro.getId());
      out.write("\"><button>Editar</button></a></td>\n");
      out.write("\t</tr>\n");
      out.write("\t");
 } 
      out.write("\t\n");
      out.write("</table>\n");
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

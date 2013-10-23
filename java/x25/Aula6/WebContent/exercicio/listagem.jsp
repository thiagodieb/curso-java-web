<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" import="beans.*,dao.*,java.util.*"%>
<%
LivroDao lDao = new LivroDao();
List<Livro> livros = null;
if(request.getMethod().equals( "POST") && request.getParameter("busca") != null){
	String busca  = request.getParameter("busca");
	livros = lDao.find(busca);
}else{
	livros = lDao.list();	
}


if(livros != null){
%>
<table borde="1">
	<tr>
		<td>Titulo</td>
		<td>ISBN</td>
		<td>Categoria</td>
		<td>Paginas</td>
		<td>Acoes</td>
	</tr>
	<% for(Livro livro: livros){ %>
	<tr>
		<td><%=livro.getTitulo()%></td>
		<td><%=livro.getIsbn()%></td>
		<td><%=livro.getCategoria().getNome()%></td>
		<td><%=livro.getPaginas()%></td>
		<td><a href="/Aula6/Excluir?id=<%=livro.getId()%>"><button>Excluir</button></a> | <a href="/Aula6/exercicio?id=<%=livro.getId()%>"><button>Editar</button></a></td>
	</tr>
	<% } %>	
</table>
<% } %>
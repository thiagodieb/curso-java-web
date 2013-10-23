<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" import="beans.*,dao.*,java.util.*"%>
<%
Livro l  = new Livro();
if(request.getParameter("id") != null){
	int id = Integer.parseInt(request.getParameter("id"));
	LivroDao lDao = new LivroDao();
	l = lDao.getObjectById(id);
}
%>
<form action="/Aula6/Cadastro" method="POST">
	<fieldset>
		<legend>Cadastro de Livros</legend>
		<input type="hidden" name="id" value="<%=l.getId() != 0 ? l.getId() : 0%>">
		<table>
			<tr>
				<td><label>Titulo:</label> <input type="text" name="titulo" value="<%=l.getTitulo() != null ? l.getTitulo() : ""%>"></td>
				<td rowspan="4"><label>Descricao:</label> <textarea name="descricao"><%=l.getDescricao() != null ? l.getDescricao() : ""%></textarea></td>
			</tr>
			<tr>
				<td><label>ISBN:</label> <input type="text" name="isbn" value="<%=l.getIsbn() != null ? l.getIsbn() : ""%>"></td>
			</tr>
			<tr>
				<td><label>Paginas:</label> <input type="text" name="paginas" value="<%=l.getPaginas() != 0 ? l.getPaginas() : ""%>"></td>
			</tr>
			<tr>
				<td><label>Categoria:</label> <%@ include file="select_categoria.jsp" %></td>
			</tr>
		</table>
		<input type="submit">
	</fieldset>
</form>
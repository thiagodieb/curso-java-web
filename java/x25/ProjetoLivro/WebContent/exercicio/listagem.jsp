<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" import="beans.*,dao.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Gerenciar Livros</title>
</head>
<body>
<%@ include file="pesquisa.jsp" %>
<%
List<Livro> livros = (List<Livro>) request.getAttribute("listaLivro");
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
		<td><a href="excluir?id=<%=livro.getId()%>"><button>Excluir</button></a> | <a href="editar?id=<%=livro.getId()%>"><button>Editar</button></a></td>
	</tr>
	<% } %>	
</table>
<% } %>
<a href="cadastrar"><button>Cadastrar</button></a>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" import="beans.*,dao.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Gerenciar Livros</title>
</head>
<body>

<form action="salvar" method="POST">
	<fieldset>
		<legend>Cadastro de Livros</legend>
		<input type="hidden" name="livro.id" value="${livro.id}">
		<table>
			<tr>
				<td><label>Titulo:</label> <input type="text" name="livro.titulo" value="${livro.titulo}"></td>
				<td rowspan="4"><label>Descricao:</label> <textarea name="livro.descricao">${livro.descricao}</textarea></td>
			</tr>
			<tr>
				<td><label>ISBN:</label> <input type="text" name="livro.isbn" value="${livro.isbn}"></td>
			</tr>
			<tr>
				<td><label>Paginas:</label> <input type="text" name="livro.paginas" value="${livro.paginas}"></td>
			</tr>
			<tr>
				<td><label>Categoria:</label> <%@ include file="select_categoria.jsp" %></td>
			</tr>
		</table>
		<input type="submit">
	</fieldset>
</form>
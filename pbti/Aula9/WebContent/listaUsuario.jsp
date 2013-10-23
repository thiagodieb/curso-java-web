<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" import="java.util.*, beans.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Listagem de usuarios</title>
</head>
<body>
<table border="1">
	<tr>
		<td>Nome</td>
		<td>Login</td>
		<td>Senha</td>
	</tr>
	<% List<Usuario> usuarios = (List<Usuario>) request.getAttribute("list"); %>
	<% for(Usuario usuario: usuarios) {%>
	<tr>
		<td><%=usuario.getNome()%></td>
		<td><%=usuario.getLogin()%></td>
		<td><%=usuario.getSenha()%></td>
	</tr>
	<% } %>
	
</table>

</body>
</html>
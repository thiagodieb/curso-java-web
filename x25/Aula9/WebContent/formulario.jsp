<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Formulario</title>
</head>
<body>
<%=request.getAttribute("msg") != null ? request.getAttribute("msg") : "" %>
<form action="salvar.crecre" method="POST">
	<label>Nome</label>
	<input type="text" name="nome"><br/>
	<label>Login</label>
	<input type="text" name="login"><br/>
	<label>Senha</label>
	<input type="password" name="senha"><br/>
	<input type="submit">
</form>

<a href="listar.crecre">Listagem</a>
</body>
</html>


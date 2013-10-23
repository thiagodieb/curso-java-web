<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" import="beans.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Cadastro</title>
</head>
<body>
<form action="" method="POST">
	Nome:<input type="text" name="nome"><br/>
	Turno:<input type="text" name="turno"><br/>
	Conteudo:<textarea name="conteudo"></textarea><br/>
	Duracao<input type="text" name="duracao"><br/>
	<input type="submit"><br/>
</form>
<%
	if(request.getMethod() == "POST"){
%>
<jsp:useBean id="cursoDaCremilda" class="beans.Curso" scope="session"/>
<jsp:setProperty property="*" name="cursoDaCremilda"/>
<%
out.print("Suecesso!");
}
%>
</body>
</html>
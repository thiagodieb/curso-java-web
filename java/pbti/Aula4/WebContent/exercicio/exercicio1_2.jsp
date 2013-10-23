<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Exercicio 1 e 2</title>
</head>
<body>
<form method="POST">
	Peso : <input type="text" name="peso"><br/>
	Altura : <input type="text" name="altura"><br/>
	<input type="submit">
</form>

<% if(request.getMethod().equals("POST")){ %>

<jsp:useBean id="calculo" class="exercicio.CalculoImc"></jsp:useBean>
<jsp:setProperty property="*" name="calculo"/>
Altura : <jsp:getProperty property="altura" name="calculo"/>
Peso : <jsp:getProperty property="peso" name="calculo"/>
IMC: <jsp:getProperty property="calculoimc" name="calculo"/>

<% } %>
</body>
</html>
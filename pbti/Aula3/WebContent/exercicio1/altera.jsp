<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" import="tratamento.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Exercicio 1</title>
</head>
<body>
<%

String valor = request.getParameter("valor");
if(valor != null){
	out.println("Primeira Forma");
	out.println(valor.toUpperCase());
	out.println(valor.toLowerCase());
	out.println(new StringBuffer(valor).reverse().toString());
	
	out.println("Segunda Forma");
	new AlteraString(valor,out);
}
%>
</body>
</html>
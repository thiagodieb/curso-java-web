<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" import="beans.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Leitura</title>
</head>
<body>
<%
	Curso c = (Curso) session.getAttribute("Curso");
	if(c != null){
		out.write("Nome:"+c.getNome()+"<br/>");
		out.write("Turno:"+c.getTurno()+"<br/>");
		out.write("Conteudo:"+c.getConteudo()+"<br/>");
		out.write("Duracao:"+c.getDuracao()+"<br/>");
	}
%>

</body>
</html>
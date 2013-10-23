<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII" import="beans.*,dao.*,java.util.*,java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Detalhes</title>
</head>
<body>
	<%
		CursoDao dao = new CursoDao();
		if (request.getParameter("id") != null) {
			try {
				Curso curso = dao.getObjectById(Integer.parseInt(request
						.getParameter("id")));
				out.print(curso.getNome()+"<br/>");
				out.print(curso.getConteudo()+"<br/>");
				out.print(curso.getTurno()+"<br/>");
				out.print(curso.getDuracao()+"<br/>");
				
			} catch (Exception e) {
				out.print("Nenhum valor");
				out.print(e.getMessage());
				e.printStackTrace();
			}
		}
	%>
</body>
</html>
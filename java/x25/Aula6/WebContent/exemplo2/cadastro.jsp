<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII" import="beans.*,dao.*,java.util.*,java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Cadastro</title>
</head>
<body>
	<form action="" method="POST">
		Nome:<input type="text" name="nome"><br />
		Turno:<input type="text" name="turno"><br />
		Conteudo:<textarea name="conteudo"></textarea><br /> 
		Duracao:<input type="text" name="duracao"><br /> 
		<input type="submit"><br />
	</form>
	<%
		CursoDao dao = new CursoDao();
		if (request.getMethod() == "POST") {
	%>
	<jsp:useBean id="cursoDaCremilda" class="beans.Curso" scope="page" />
	<jsp:setProperty property="*" name="cursoDaCremilda" />
	<%
		
			try {
				dao.add(cursoDaCremilda);
				out.print("Sucesso!");
			} catch (Exception e) {
				out.print("Ocorreu problemas");
				out.print(e.getMessage());
				e.printStackTrace();
			}
		}
		
		/*
		try {
			//List cursos = dao.getObject();
			/Iterator it = cursos.iterator();
			while(it.hasNext()){
				Curso c = (Curso) it.next();
				out.print(c.getResultadocompleto());
				out.print("<a href='detalhes.jsp?id="+c.getId()+"'>Detalhes</a>");
				out.print("<hr/>");
			}
			
		} catch (Exception e) {
			out.print("Nenhum valor");
			out.print(e.getMessage());
			e.printStackTrace();
		}
		*/		
	%>
</body>
</html>
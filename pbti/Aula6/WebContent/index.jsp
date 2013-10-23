<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII" import="java.sql.*,dao.*,java.util.*, beans.*" %>
<html>
<head></head>
<body>
	<form action="salvar.jsp" method="POST">
		<input type="text" name="nome"> 
		<input type="text" name="login"> 
		<input type="password" name="senha"> 
		<input type="submit">
	</form>
	
	
	<jsp:useBean id="aluno" class="beans.Aluno"></jsp:useBean>
	<jsp:getProperty property="listar" name="aluno"/>

<%
	AlunoDao d = new AlunoDao();
	Iterator i = d.listar().iterator();
	while(i.hasNext()){
		Aluno n = (Aluno) i.next();
		out.write(n.getNome());
	}
%>

</body>
</html>
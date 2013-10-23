<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" import="java.util.*, exercicio2.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Visualizar Alunos</title>
</head>
<body>
<% ArrayList lista = (ArrayList) session.getAttribute("dados");
	if(lista != null){
%>
<table border="1">
	<tr>
		<td>Matricula</td>
		<td>Nome</td>
		<td>Serie</td>
		<td>Turma</td>
		<td>Acoes</td>
	</tr>
	<%
	Iterator i = lista.iterator();
	while(i.hasNext()){
		Aluno aluno = (Aluno) i.next();
	%>
	<tr>
		<td><%=aluno.getMatricula()%></td>
		<td><%=aluno.getNome()%></td>
		<td><%=aluno.getSerie()%></td>
		<td><%=aluno.getTurma()%></td>
		<td><a href="/Aula4/exercicio2/cadastro_nota.jsp?matricula=<%=aluno.getMatricula()%>">Cadastrar Notas</a> | <a href="/Aula4/exercicio2/visualiza_nota.jsp?matricula=<%=aluno.getMatricula()%>"> Visualizar Notas </a></td>
	</tr>
	<%
	}
	%>
</table>
<% } %>

<a href="/Aula4/exercicio2/cadastro_aluno.jsp" > Cadatrar Aluno</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII" import="java.util.*, exercicio2.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Listagem de Aluno</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<td>Matricula</td>
				<td>Nome</td>
				<td>Serie</td>
				<td>Turma</td>
				<td>Acoes</td>
			</tr>
		</thead>

		<%
			ArrayList<Aluno> alunos  =  (ArrayList<Aluno>) session.getAttribute("Alunos");
			if (alunos != null) {
			 Iterator lista = alunos.iterator();
			
		%>
		<tbody>
			<%
			Aluno aluno = null;
 			while(lista.hasNext()){
 				aluno = (Aluno) lista.next();
 				out.print("<tr>");
 				out.print("<td>"+aluno.matricula+"</td>");
				out.print("<td>"+aluno.nome+"</td>");
				out.print("<td>"+aluno.serie+"</td>");
				out.print("<td>"+aluno.turma+"</td>");
				out.print("<td><a href='/Aula3/exercicio2/cadastroNota.jsp?matricula="+aluno.matricula+"'>cadastrar Nota <a/> | <a href='/Aula3/exercicio2/visualizarNota.jsp?matricula="+aluno.matricula+"'>visualizar Notas <a/></td>");
				out.print("</tr>");
			}	
			%>
		</tbody>
		<%
			}
		%>
	</table>
	<a href="/Aula3/exercicio2/cadastroAluno.jsp" >Cadastro de Aluno</a>
</body>
</html>
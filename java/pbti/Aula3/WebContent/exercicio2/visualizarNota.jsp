<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII" import="java.util.*, exercicio2.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Lista de Notas</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<td>Matricula</td>
				<td>Materia</td>
				<td>Nota</td>
			</tr>
		</thead>

		<%
		
			ArrayList<Aluno> alunos  =  (ArrayList<Aluno>) session.getAttribute("Alunos");
			String matricula = request.getParameter("matricula");
			if (alunos != null) {
			Aluno aluno = CadastrarNota.buscaAluno(alunos, matricula);
			Iterator lista = aluno.pontuacao.iterator();
		%>
		<tbody>
			<%
			while(lista.hasNext()){
 				Pontuacao p = (Pontuacao) lista.next();
 				if(p != null){
	 				out.print("<tr>");
	 				out.print("<td>"+matricula+"</td>");
					out.print("<td>"+p.materia+"</td>");
					out.print("<td>"+p.nota+"</td>");
					out.print("</tr>");
 				}
			}	
			%>
		</tbody>
		<%
			}
		%>
	</table>
	<a href="/Aula3/exercicio2/listaAlunos.jsp" >Listagem de Aluno</a>
</body>
</html>
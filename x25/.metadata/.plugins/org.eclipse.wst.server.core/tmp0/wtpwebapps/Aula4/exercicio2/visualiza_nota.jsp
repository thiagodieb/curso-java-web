<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" import="java.util.*, exercicio2.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Visualizar Notas</title>
</head>
<body>
<% 
String matricula = request.getParameter("matricula");
ArrayList lista = (ArrayList) session.getAttribute("dados");
	if(lista != null){
	Aluno aluno =  CadastrarNota.buscaAluno(lista, matricula);
	ArrayList<Nota> notas = aluno.getNotas();
	if(notas != null){
%>
<table border="1">
	<tr>
		<td>Matricula</td>
		<td>Nota</td>
		<td>Materia</td>
		<td>Acoes</td>
	</tr>
	<%
	Iterator i = notas.iterator();
	while(i.hasNext()){
		Nota nota = (Nota) i.next();
	%>
	<tr>
		<td><%=matricula%></td>
		<td><%=nota.getPonto()%></td>
		<td><%=nota.getMateria()%></td>
		<td><a href="/Aula4/ExcluirNota?materia=<%=nota.getMateria()%>&matricula=<%=matricula%>">Excluir Notas</a> </td>
	</tr>
	<%
	}
	%>
</table>
<% } 
}%>

<a href="/Aula4/exercicio2/visualiza_aluno.jsp" > Voltar</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Cadastrar Alunos</title>
</head>
<body>
<form action="/Aula4/CadastrarAluno" method="POST">
	<fieldset>
		<legend>Cadastro de Aluno</legend>
		
		Nome: <input name="nome" type="text"> <br/>
		Matricula: <input name="matricula" type="text"> <br/>
		Turma: <input name="turma" type="text"> <br/>
		Serie: <input name="serie" type="text"> <br/>
		<input type="submit">
	</fieldset>
</form>
</body>
</html>
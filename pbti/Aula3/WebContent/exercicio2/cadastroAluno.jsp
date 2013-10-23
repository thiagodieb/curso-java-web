<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Cadastro Aluno</title>
</head>
<body>
<form action="/Aula3/CadastrarAluno" method="POST">
	<fieldset>
		<legend>Cadastro de Aluno</legend>
		<label>Nome</label><input type="text" name="nome"/><br/>
		<label>Matricula</label><input type="text" name="matricula"/><br/>
		<label>Turma</label><input type="text" name="turma"/><br/>
		<label>Serie</label><input type="text" name="serie"/><br/>
		<input type="submit"/>
	</fieldset>
</form>
</body>
</html>
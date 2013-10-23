<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Cadastro de Notas</title>
</head>
<body>
<form action="/Aula4/CadastrarNota" method="POST">
	<fieldset>
		<legend>Cadastro de Nota</legend>
		<input type="hidden" name="matricula" value="<%=request.getParameter("matricula")%>" >
		Nota: <input name="ponto" type="text"> <br/>
		Materia: <select name="materia">
				<option>Portugues</option>
				<option>Matematica</option>
				<option>Ingles</option>
				<option>Geografia</option>
		</select><br/>
		<input type="submit">
	</fieldset>
</form>
</body>
</html>
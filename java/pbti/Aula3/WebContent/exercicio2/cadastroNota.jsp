<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Cadastro Aluno</title>
</head>
<body>
<form action="/Aula3/CadastrarNota" method="POST">
	<fieldset>
		<legend>Cadastro de Nota</legend>
		<label>Nota</label><input type="text" name="nota"/><br/>
		<label>Materia</label><select name="materia">
				<option value="por">portugues</option>
				<option value="mat">matematica</option>
				<option value="geo">geografia</option>
				
			</select></<br/>
		<input type="hidden" name="matricula" value="<%=request.getParameter("matricula")%>"/>
		<input type="submit"/>
	</fieldset>
</form>
</body>
</html>
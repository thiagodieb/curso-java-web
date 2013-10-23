<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Salvando os Dados</title>
</head>
<body>

<jsp:useBean id="aluno" class="beans.Aluno"></jsp:useBean>
<jsp:setProperty property="*" name="aluno"/>
<jsp:getProperty property="inserir" name="aluno"/>
</body>
</html>
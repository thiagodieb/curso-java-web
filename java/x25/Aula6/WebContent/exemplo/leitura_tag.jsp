<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="beans.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Leitura</title>
</head>
<body>

<jsp:useBean id="cursoDaCremilda" class="beans.Curso" scope="session"/>
<jsp:getProperty property="resultadocompleto" name="cursoDaCremilda"/><br/>

</body>
</html>
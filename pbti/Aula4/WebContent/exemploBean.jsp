<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Exemplo Bean</title>
</head>
<body>

<jsp:useBean id="meuObjeto" class="pacote.ExemploBean"/>
<jsp:setProperty property="*" name="meuObjeto"/>
<jsp:getProperty property="imprimirtudo" name="meuObjeto"/>

</body>
</html>
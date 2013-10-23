<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<html>
<head> <title>Exemplo Beans</title> </head>
<body>
<jsp:useBean id="meuObjeto" class="pacote.ExemploBean" scope="page" />
<jsp:setProperty name="meuObjeto" property="*" />
<%=meuObjeto.imprimirTudo() %>
</body>
</html>
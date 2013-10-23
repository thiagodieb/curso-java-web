<%@ page errorPage="erro.html" language="java" contentType="application/json"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Exemplo JSP</title>
</head>
<body>
<% out.println("Cremilda da Silva"); %>
<jsp:include page="Novo.jsp"></jsp:include>
<%@ include file="teste.html" %>
<%@ include file="Novo.jsp" %>


</body>
</html>

<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" import="tratamento.*" %>
<%@ include file="head.jsp" %>
<body>
Nome:<%
String valor = Manipulacao.adicionarDestaque(request.getParameter("nome"));
out.println(valor);
%>
</body>
</html>
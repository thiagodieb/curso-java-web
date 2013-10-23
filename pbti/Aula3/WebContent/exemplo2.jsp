<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" buffer="2kb"%>
<html>
<head> <title>Exemplo</title> </head>
<body>
Caminho : <%=application.getContextPath() %><br/>
Servidor : <%=application.getServerInfo() %><br/>
Projeto : <%=application.getServletContextName() %><br/>
<% out.clear(); out.write("<html><body>"); %>
<% response.setCharacterEncoding("UTF-8"); %>
Buffer : <%=response.getBufferSize() %><br/>
Charset : <%=response.getCharacterEncoding() %><br/>
ContentType : <%=response.getContentType() %><br/>
</body>
</html>


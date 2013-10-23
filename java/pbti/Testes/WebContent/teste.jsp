<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" buffer="2kb"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Exemplo</title>
</head>
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
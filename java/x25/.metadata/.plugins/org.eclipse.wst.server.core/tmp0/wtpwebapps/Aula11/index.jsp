<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Exemplo title here</title>
</head>
<body> 
<s:property value="msg" />
${msg}
<%=request.getAttribute("msg") %>

<s:a action="fomulario"> Formulario</s:a>

</body>
</html>
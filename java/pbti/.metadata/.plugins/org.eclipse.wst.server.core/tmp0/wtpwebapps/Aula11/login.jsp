<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Login</title>
</head>
<body>
<s:actionerror/>
<s:form action="logar" method="post" namespace="/auth">
	<s:textfield key="login" label="Login"/>
	<s:password key="senha" label="Senha"/>
	<s:submit/>
</s:form>
</body>
</html>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Cadastro de Pessoa</title>
</head>
<body>
<s:form method="post" action="salvar">
<s:textfield label="Name" name="pessoa.nome"/>
<s:textfield label="Idade" name="pessoa.idade"/>
<s:submit label="Enviar"></s:submit>
</s:form>
<s:a action="listar">Listagem</s:a>
</body>
</html>
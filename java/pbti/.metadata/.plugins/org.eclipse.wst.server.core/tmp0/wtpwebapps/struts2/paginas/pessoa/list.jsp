<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Lista de Pessoas</title>
</head>
<body>
<h2>Pessoa</h2>
<table>
	<tr>
		<td>Nome</td>
		<td>Idade</td>
	</tr> 
	<s:iterator value="pessoaList">
	    <tr>
	        <td><s:property value="nome"/></td>
	        <td><s:property value="idade"/></td>
 	        <td><a href="delete?id=<s:property value="id"/>">delete</a></td>
	    </tr> 
	</s:iterator>
</table>

</body>
</html>
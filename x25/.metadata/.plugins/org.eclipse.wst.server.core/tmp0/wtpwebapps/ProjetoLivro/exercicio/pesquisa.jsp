<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" import="beans.*,dao.*,java.util.*"%>
<form action="pesquisar" method="POST">
	<fieldset>
		<label>Titulo/ISBN:</label>
		<input name="busca" type="text" size="100px">
		<input type="submit">
	</fieldset>
</form>
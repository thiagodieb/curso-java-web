<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"
    import="java.util.*,beans.*,dao.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Listagem</title>
</head>
<body>
<table border="1">
	<tr>
		<td>Nome</td>
		<td>Login</td>
		<td>Senha</td>
	</tr>
	<% List<Usuario> lista = (List<Usuario>) request.getAttribute("listagem"); 
		if(lista != null){
			for(Usuario usuario: lista){
			%>
			<tr>
				<td><%=usuario.getNome()%></td>
				<td><%=usuario.getLogin()%></td>
				<td><%=usuario.getSenha()%></td>
			</tr>
			<%	
			}
		}
	%>
</table>

</body>
</html>






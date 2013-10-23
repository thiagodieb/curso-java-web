<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII" import="java.sql.*" %>
<html>
<head></head>
<body>
	<form action="" method="POST">
		<input type="text" name="nome"> 
		<input type="text" name="login"> 
		<input type="password" name="senha"> 
		<input type="submit">
	</form>
	
<%
if(request.getMethod() == "POST"){
	try {
		String d ="jdbc:mysql://localhost/curso_java_web?user=root&password=";
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection con =  DriverManager.getConnection(d);
	
 		out.write("<h2>Salvo com sucesso!</h2>");
	} catch (Exception e) {  out.write(e.getMessage()); }
}
%>
<%
 	try {
		String d2 ="jdbc:mysql://localhost/curso_java_web?user=root&password=";
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection con2 =  DriverManager.getConnection(d2);   
 		PreparedStatement stmt = con2.prepareStatement("select * from alunos");
 		ResultSet res = stmt.executeQuery();
 		while (res.next()) {
 			out.write("Nome: "+ res.getString("nome"));
 			out.write(" Login: "+ res.getString("login"));
 			out.write("<hr/>");
 		}
	} catch (Exception e) { 
		out.write("Erro");
	} 
%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" import="java.sql.*"%>
<html>
<head></head>
<body>
<form action="" method="POST">
<input type="text" name="nome">
<input type="text" name="login">
<input type="text" name="senha">
<input type="submit">
</form>
<%
if(request.getMethod() == "POST"){
	try {
		String d ="jdbc:mysql://localhost/curso_java_web?user=root&password=";
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection con =  DriverManager.getConnection(d);
		String sql = "insert into alunos  (id,nome,login,senha) values (null,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, request.getParameter("nome"));
		stmt.setString(2, request.getParameter("login"));
		stmt.setString(3, request.getParameter("senha"));
		stmt.execute();
 		out.write("<h2>Salvo com sucesso!</h2>");
	} catch (Exception e) { 
		out.write("Erro");
	}
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
		e.printStackTrace();
		out.write("Erro");
	} 
%>
</body>
</html>
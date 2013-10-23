<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Exercicio 3</title>
</head>
<body>

<jsp:useBean id="calculadora" class="exercicio.Calculadora"></jsp:useBean>
<jsp:setProperty property="*" name="calculadora" />
<jsp:getProperty property="<%=param.operacao%>" name="calculadora" />

 <% 
String operacao = request.getParameter("operacao");
double valor = 0;
if(operacao.equals("somar")){ 
	valor = calculadora.getSomar();
}else if(operacao.equals("subtrair")){
	valor = calculadora.getSubtrair();
}else if(operacao.equals("dividir")){
	valor = calculadora.getDividir();
}else{
	valor = calculadora.getMultiplicar();
}

out.println(valor);
%>
</body>
</html>
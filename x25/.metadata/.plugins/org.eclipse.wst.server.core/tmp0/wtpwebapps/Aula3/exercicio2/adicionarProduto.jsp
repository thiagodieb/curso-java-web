<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Adicionar Produto</title>
</head>
<body>

<form action="/Aula3/AdicionarProduto" method="POST">
	<fieldset>
		<legend>	Selecione seu produto</legend>
		<label>Produtos</label>
			<select name="produto">
				<option>Camarao</option>
				<option>Peixe</option>
				<option>Carne</option>
				<option>Ave</option>
				<option>Porco</option>
			</select>
		<label>Quantidade</label>
		<input type="text" name="quantidade"/>
		<p>
		<input type="submit" />
		</p>
	</fieldset>
	
</form>
<a href="/Aula3/ListarProduto"> Visualizar Lista de Produtos</a>

</body>
</html>
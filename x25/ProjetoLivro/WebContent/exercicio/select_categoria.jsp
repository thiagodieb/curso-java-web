<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" import="beans.*,dao.*,java.util.*"%>

<select name="categoria.id">
<%
List<Categoria> categorias = (List<Categoria>) request.getAttribute("listaCategoria");

int id = 0; 
for(Categoria categoria: categorias){%>
	<option value="<%=categoria.getId()%>" <%=id == categoria.getId() ? "selected" : "" %>><%=categoria.getNome()%></option>
<%}%>
</select>

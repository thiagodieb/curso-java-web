<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" import="beans.*,dao.*,java.util.*"%>
<select name="categoria">
<%
CategoriaDao c = new CategoriaDao();
List<Categoria> categorias = c.list();
int id = 0;
if(l.getCategoria() != null){
	id = l.getCategoria().getId();	
}
 
for(Categoria categoria: categorias){%>
	<option value="<%=categoria.getId()%>" <%=id == categoria.getId() ? "selected" : "" %>><%=categoria.getNome()%></option>
<%}%>
</select>

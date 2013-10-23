<%
String[] menu = {"Principal","Novidades","Categoria"};
for(int i = 0; i < menu.length; i++){
%><a href="#"> <%
	out.print(menu[i]);
%></a> | <%
}
%>

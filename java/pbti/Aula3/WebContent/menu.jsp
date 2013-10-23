<%
String [] m = new String[3];
m[0] = "Principal";
m[1] = "Novas";
m[2] = "Fale Conosco";
for(String menu : m){
	%><li>
	<%
	out.println(menu);
	%>
	</li>
	<%
}
%>
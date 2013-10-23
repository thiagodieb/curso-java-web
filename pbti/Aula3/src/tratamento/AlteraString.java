package tratamento;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;

public class AlteraString {
	
	
	public AlteraString(String valor, JspWriter out) throws IOException{
		out.println(AlteraString.up(valor));
		out.println(AlteraString.lo(valor));
		out.println(AlteraString.re(valor));
	}
	
	public static String up(String valor){
		return valor.toUpperCase();
	}

	public static String lo(String valor){
		return valor.toLowerCase();
	}
	
	public static String re(String valor){
		return new StringBuffer(valor).reverse().toString();
	}
}

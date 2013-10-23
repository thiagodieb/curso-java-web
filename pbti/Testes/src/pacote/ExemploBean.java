package pacote;
import java.io.Serializable;
public class ExemploBean  implements Serializable{
	private String atributo1;
	private boolean atributo2;
	public String getAtributo1() {
		return atributo1;
	}
	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}
	public boolean isAtributo2() {
		return atributo2;
	}
	public void setAtributo2(boolean atributo2) {
		this.atributo2 = atributo2;
	} 
	public String imprimirTudo(){
		return "Atributo1 :"+ atributo1 +" <br/> Atributo2:"+atributo2;
	}
	
}

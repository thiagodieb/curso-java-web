package pacote;

import java.io.Serializable;

public class ExemploBean implements Serializable {
	private String atributo1;
	private boolean atributo2;
	private int atributo3;

	
	public void setminhavozinha(String nome){
		this.atributo1 = nome;
	}
	public String getminhavozinha(){
		return "aaaaa";
	}
	public String getAtributo1() {
		return atributo1;
	}
	
	public int getAtributo3(){
		return atributo3;
	}
	
	public void setAtributo3(int a){
		this.atributo3 = a;
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

	public String getimprimirtudo() {
		return "Atributo1 :" + atributo1 + " <br/> Atributo2:" + atributo2;
	}
}

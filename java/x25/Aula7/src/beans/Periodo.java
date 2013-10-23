package beans;

import java.util.Set;

public class Periodo {

	private int id;
	private String ano;
	private Set alunos;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public Set getAlunos() {
		return alunos;
	}
	public void setAlunos(Set alunos) {
		this.alunos = alunos;
	}
	
	
	public Periodo() {
		// TODO Auto-generated constructor stub
	}
	
}

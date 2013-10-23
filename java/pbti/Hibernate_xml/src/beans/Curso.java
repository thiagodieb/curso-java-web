package beans;

import java.util.Set;

public class Curso {
	private int id;
	private String nome;
	private int cargaHoraria;
	private Set turmas;
	
	public Set getTurmas() {
		return turmas;
	}
	public void setTurmas(Set turmas) {
		this.turmas = turmas;
	}
	
	public int getId() { return id; }
	public String getNome() { return nome; }
	public int getCargaHoraria() { return cargaHoraria; }
	
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	} 
}
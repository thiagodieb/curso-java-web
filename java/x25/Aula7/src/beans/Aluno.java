package beans;

import java.util.Set;

public class Aluno {

	private int id;
	private String nome;
	private int idade;
	private Set turmas;
	
	
	public Set getTurmas() {
		return turmas;
	}

	public void setTurmas(Set turmas) {
		this.turmas = turmas;
	}

	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	public Aluno(int id, String nome, int idade, Set turmas) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.turmas = turmas;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}

package beans;

import java.util.*;
 
public class Aluno {
	
	private int id;
	private String nome;
	private String cpf;
	private int idade;
	private Set turmas;
	private Endereco endereco;
	

	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Set getTurmas() {
		return turmas;
	}
	public void setTurmas(Set turmas) {
		this.turmas = turmas;
	}
	public Aluno(){
		
	}
	public Aluno(  String nome, String cpf, int idade, Set turmas,
			Endereco endereco) {
		super(); 
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.turmas = turmas;
		this.endereco = endereco;
	}
	
	
}

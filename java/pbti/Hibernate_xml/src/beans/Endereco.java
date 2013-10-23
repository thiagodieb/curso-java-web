package beans;

import java.util.*;

public class Endereco {
	
	public Endereco(){
		
	}
	public Endereco( String logadouro, String bairro, String cidade,
			String estado,Aluno aluno) {
		super(); 
		this.logadouro = logadouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado; 
		this.aluno = aluno; 
	}
	private int id;
	private String logadouro;
	private String bairro;
	private String cidade;
	private String estado;
	private Aluno aluno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogadouro() {
		return logadouro;
	}
	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
}

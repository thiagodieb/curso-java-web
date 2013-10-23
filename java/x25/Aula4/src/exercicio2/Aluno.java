package exercicio2;

import java.util.ArrayList;

public class Aluno {
	private String nome;
	private String matricula;
	private int serie;
	private String turma;
	private ArrayList<Nota> notas = new ArrayList<Nota>();
	
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public Aluno(){
		
	}
	public Aluno(String nome, String matricula, int serie, String turma) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.serie = serie;
		this.turma = turma;
	}
	
	

}

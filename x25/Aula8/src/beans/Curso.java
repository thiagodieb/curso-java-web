package beans;

import java.util.List;

import javax.persistence.*;

@Entity
public class Curso {

	@Id
	@GeneratedValue
	private int id;
	
	private String nome;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="curso")
	private List<Turma> turmas;
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
	public List<Turma> getTurmas() {
		return turmas;
	}
	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	
	public Curso() {
		// TODO Auto-generated constructor stub
	}
	
	public Curso(int id, String nome, List<Turma> turmas) {
		super();
		this.id = id;
		this.nome = nome;
		this.turmas = turmas;
	}
	
	
	
}






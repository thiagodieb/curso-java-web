package beans;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Turma {
	@Id
	@GeneratedValue
	private int id;
	@ManyToOne
	@JoinColumn(name="fk_id_curso")
	private Curso curso;
	
	@ManyToMany(cascade= CascadeType.ALL)
	@JoinTable(name="Alunos_Turma_nada",
	joinColumns=@JoinColumn(name="id_turma"),
	inverseJoinColumns=@JoinColumn(name="id_aluno"))
	private Set<Aluno> alunos;
	
	
	public Set<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Turma() {
		// TODO Auto-generated constructor stub
	}
	
	public Turma(int id, Curso curso) {
		super();
		this.id = id;
		this.curso = curso;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	

}

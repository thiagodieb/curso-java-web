package beans;

import java.util.*;

import javax.persistence.*;

@Entity
public class Turma {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private Date dataInicil;
	private Date dataFim;

	
	@ManyToOne
	@JoinColumn(name = "idCurso")
	private Curso curso;
	
	@ManyToMany(mappedBy="turmas")
	private Set<Aluno> alunos;
	
	public Set<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataInicil() {
		return dataInicil;
	}
	public void setDataInicil(Date dataInicil) {
		this.dataInicil = dataInicil;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Turma(){
		
	}
	public Turma( String nome, Date dataInicil, Date dataFim,
			Curso curso) {
		this.nome = nome;
		this.dataInicil = dataInicil;
		this.dataFim = dataFim;
		this.curso = curso;
	}
	
	
}

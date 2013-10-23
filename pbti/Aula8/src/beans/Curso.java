package beans;

import java.util.List;

import javax.persistence.*;



@Entity
public class Curso {
	
	@Id
	@GeneratedValue
	private int idCurso;
	@Column(nullable=false)
	private String nome;
	@Column(name="duracao_tempo",nullable=false)
	private double duracao;

	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Coordenador co;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="cursoX")
	private List<Turma> turmas;
	
	
	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public Coordenador getCo() {
		return co;
	}

	public void setCo(Coordenador co) {
		this.co = co;
	}
	
	

}

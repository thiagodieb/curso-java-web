package beans;

import javax.persistence.*;

@Entity
public class Turma {
	@Id
	@GeneratedValue
	private int idTurma;
	private String nome;
	@ManyToOne()
	@JoinColumn(name="idCurso")
	private Curso cursoX;
	public int getIdTurma() {
		return idTurma;
	}
	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Curso getCursoX() {
		return cursoX;
	}
	public void setCursoX(Curso cursoX) {
		this.cursoX = cursoX;
	}
	
	
	
}

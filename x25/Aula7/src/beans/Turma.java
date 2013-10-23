package beans;

import java.util.Set;

public class Turma {

	private int id;
	private String professor;
	private int horario;
	private Curso curso;
	private Set alunos;
	
	
	public Set getAlunos() {
		return alunos;
	}
	public void setAlunos(Set alunos) {
		this.alunos = alunos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public Turma() {
		// TODO Auto-generated constructor stub
	}
	
	public Turma(int id, String professor, int horario, Curso curso, Set alunos) {
		super();
		this.id = id;
		this.professor = professor;
		this.horario = horario;
		this.curso = curso;
		this.alunos = alunos;
	}
	
	
	
}

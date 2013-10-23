package beans;

import java.util.Date;
import java.util.Set;

public class Turma {

	private int id;
	private String codigo;
	private Date dataInicial;
	private Date dataFinal;
	private Curso curso;
	private Set alunos;
	
	
	public Set getAlunos() {
		return alunos;
	}
	public void setAlunos(Set alunos) {
		this.alunos = alunos;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Date getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}
	public Date getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	public String toString(){
		return this.getCodigo()+" | "+this.getId();
	}
	public Turma(){
		
	}
	public Turma( String codigo, Date dataInicial, Date dataFinal) {
		super();
		this.codigo = codigo;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}
	
	
}

package beans;

public class Ementa {

	private int id;
	private String descricao;
	private Curso curso;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	public Ementa() {
		// TODO Auto-generated constructor stub
	}
	public Ementa(int id, String descricao, Curso curso) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.curso = curso;
	}
	
	
}

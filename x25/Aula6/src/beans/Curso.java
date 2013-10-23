package beans;
public class Curso {

	private int id;
	private String nome;
	private String turno;
	private String conteudo;
	private String duracao;
	
	
	
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
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	public String getResultadocompleto(){
		return "Nome:"+this.getNome()+" <br/> " +
				"Turno:"+this.getTurno()+"<br/>";
	}
	
	public Curso(){
		
	}
	
	public Curso(int id, String nome, String turno, String conteudo, String duracao) {
		super();
		this.id = id;
		this.nome = nome;
		this.turno = turno;
		this.conteudo = conteudo;
		this.duracao = duracao;
	}
	
	
	
}

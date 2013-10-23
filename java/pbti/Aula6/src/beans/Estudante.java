package beans;

public class Estudante{

	private int id;
	private String nome;
	private int matricula;
	private String turma;
	private int serie;
	

	public Estudante(){
		
	}


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


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getTurma() {
		return turma;
	}


	public void setTurma(String turma) {
		this.turma = turma;
	}


	public int getSerie() {
		return serie;
	}


	public void setSerie(int serie) {
		this.serie = serie;
	}


	public Estudante(int id, String nome, int matricula, String turma, int serie) {
		super();
		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
		this.turma = turma;
		this.serie = serie;
	}
	 
	
	
	
}

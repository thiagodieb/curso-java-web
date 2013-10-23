
public class Produto {
	
	private String nome;
	private int quatidade;
	
	public Produto(String nome, int quatidade) {
		super();
		this.nome = nome;
		this.quatidade = quatidade;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuatidade() {
		return quatidade;
	}
	public void setQuatidade(int quatidade) {
		this.quatidade = quatidade;
	}
	
	public String toString(){
		return "Produto: "+this.getNome()+" quantidade: "+this.getQuatidade();
	}

}

package beans;

public class Curso {
	
	private String nome;
	private String empresa;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	@Override
	public String toString() {
		return this.getNome()+ " -  "+this.getEmpresa();
	}
	 

}

package beans;

import javax.persistence.*; 
@Entity
@DiscriminatorValue("PessoaFisica")
 public class PessoaFisica extends Pessoa{ 
	private String cpf;
	
	public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public PessoaFisica(String nome,String cpf) {
		super();
		this.cpf = cpf;
		this.setNome(nome);
	} 
	
}

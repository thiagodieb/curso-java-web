package beans;
import javax.persistence.*;

@Entity
public class Endereco {
	@Id
	@GeneratedValue
	private Long id;
	private String logadouro;
	private String bairro;
	private String estado;
	private String cidade;
	@OneToOne(mappedBy="endereco")
	private Aluno aluno;
	
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogadouro() {
		return logadouro;
	}
	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public Endereco(){
		
	}
	
	public Endereco(String logadouro, String bairro, String estado,
			String cidade) {
		this.logadouro = logadouro;
		this.bairro = bairro;
		this.estado = estado;
		this.cidade = cidade;
	}
	
	
	
}

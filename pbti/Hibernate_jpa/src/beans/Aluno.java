package beans;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Aluno {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String cpf;
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Endereco endereco;
	 @ManyToMany
	     @JoinTable(name = "Turma_has_Aluno",
	         joinColumns = @JoinColumn(name = "idAluno"),
	         inverseJoinColumns = @JoinColumn(name = "idTurma"))
	private Set<Turma> turmas;
	
	public Set<Turma> getTurmas() {
		return turmas;
	}
	public void setTurmas(Set<Turma> turmas) {
		this.turmas = turmas;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Aluno(){
		
	}
	public Aluno(String nome, String cpf, Endereco endereco) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
}

package beans;

import java.util.Set;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="id_pessoa")
public class Aluno extends Pessoa {
		
	private String nomeAluno;
	
	@ManyToMany(mappedBy="alunos",cascade=CascadeType.ALL)
	private Set<Turma> turma;


	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public Set<Turma> getTurma() {
		return turma;
	}

	public void setTurma(Set<Turma> turma) {
		this.turma = turma;
	}
	
}

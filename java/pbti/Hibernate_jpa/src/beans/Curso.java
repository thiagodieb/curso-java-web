package beans;

import javax.persistence.*;
import java.util.*;

@Entity
public class Curso {
	@Id @GeneratedValue
	private Long idCurso;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="curso")
 	private List<Turma> turmas;
 	
  	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	public Long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}

	
}

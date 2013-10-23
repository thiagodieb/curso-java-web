package beans;

import javax.persistence.*;

@Entity
public class Coordenador {
	@Id
	@GeneratedValue
	private int idCoordenador;
	private String nome;
	private String curriculo;
	public int getIdCoordenador() {
		return idCoordenador;
	}
	public void setIdCoordenador(int idCoordenador) {
		this.idCoordenador = idCoordenador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurriculo() {
		return curriculo;
	}
	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}
	
}

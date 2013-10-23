package beans;

import javax.persistence.*;

@Entity
public class Usuario {
	@Id
	@GeneratedValue
	@Column(name="idUsuario")
	private int id;
	private String nome;
	@Column(length=45)
	private String login;
	@Column(length=45)
	private String senha;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(int id, String nome, String login, String senha) {
	
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	
	
}

package beans;

import java.io.*;

import javax.persistence.*;
 
@Entity
@NamedQuery(name="consultaSimples",
			query = "select * from Pessoa where id = :idCode"
)
public class Pessoa{
	
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	
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
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	public Pessoa( String nome) { 
		this.nome = nome;
	}
	
	
}

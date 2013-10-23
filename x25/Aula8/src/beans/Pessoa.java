package beans;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.JOINED) 
public class Pessoa {

	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String cfp;
	private int idade;
	
	
}

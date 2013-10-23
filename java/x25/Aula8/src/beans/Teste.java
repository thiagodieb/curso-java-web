package beans;

import javax.persistence.*;

@Entity
public class Teste {
	@Id
	@GeneratedValue
	private String idTeste;
	private int idTeste2;
	private String texto;
}

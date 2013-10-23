package beans;

import javax.persistence.*;

@Entity
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(
//		name="coluna_tipo", 
//		discriminatorType=DiscriminatorType.STRING)
//@DiscriminatorValue(value="Tabela_Pessoa")
@Inheritance(strategy=InheritanceType.JOINED)
public class Pessoa {
	@Id
	@GeneratedValue
	private int id;
	

}

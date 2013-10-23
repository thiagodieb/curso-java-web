package beans;

import javax.persistence.*;
@Entity
//@DiscriminatorValue(value="Tabela_Pessoa_Fisica")
@PrimaryKeyJoinColumn(name="pessoa_id")
public class Aluno extends Pessoa{
	
	private String nome;

}

package exercicio2;
import java.util.ArrayList;


public class Aluno {
	public String nome;
	public String matricula;
	public String turma;
	public int serie;
	public ArrayList<Pontuacao> pontuacao;
	

	public Aluno(String nome, String matricula, String turma, int serie,
			ArrayList<Pontuacao> pontuacao) {
		this.nome = nome;
		this.matricula = matricula;
		this.turma = turma;
		this.serie = serie;
		this.pontuacao = pontuacao;
	}
}
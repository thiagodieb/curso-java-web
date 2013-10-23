package beans;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import db.Conexao;

public class Aluno{

	private int id;
	private String nome;
	private String login;
	private String senha;
	

	public Aluno(){
		
	}
	
	public Aluno(int id, String nome, String login, String senha) {
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	
	
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
	
	public String getInserir(){
		String sql = "insert into alunos  (id,nome,login,senha) values (null,?,?,?)";
		try {
			PreparedStatement stmt = new Conexao().conectar().prepareStatement(sql);
			stmt.setString(1,this.getNome());
			stmt.setString(2,this.getLogin());
			stmt.setString(3,this.getSenha());
			stmt.execute();
			return "Salvo com sucesso";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Falhou";
	}
	
	public String getListar(){
		String sql = "select * from alunos";
		String resultado = "";
		try {
			PreparedStatement stmt = new Conexao().conectar().prepareStatement(sql);
	 		ResultSet res = stmt.executeQuery();
	 		while (res.next()) {
	 			resultado += "Nome: "+ res.getString("nome");
	 			resultado += " Login: "+ res.getString("login");
	 			resultado += "<hr/>";
	 		}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return resultado;
	}
}

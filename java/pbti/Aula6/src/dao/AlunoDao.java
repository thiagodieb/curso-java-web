package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Aluno;

import db.Conexao;

public class AlunoDao extends Dao<Aluno>{
	
	public void adicionar(Aluno a){
		String sql = "insert into alunos  (id,nome,login,senha) values (null,?,?,?)";
		try {
			PreparedStatement stmt = c.prepareStatement(sql);
			stmt.setString(1,a.getNome());
			stmt.setString(2,a.getLogin());
			stmt.setString(3,a.getSenha());
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluir (Aluno a){
		String sql = "delete from alunos  where id = ?";
		try {
			PreparedStatement stmt = c.prepareStatement(sql);
			stmt.setInt(1, a.getId());
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(int id){
		Aluno a = new Aluno();
		a.setId(id);
		this.excluir(a);
	}
	
	
	public List<Aluno> listar(){
		String sql = "select * from alunos";
 		List<Aluno> lista = new ArrayList<Aluno>();
		try {
			PreparedStatement stmt = new Conexao().conectar().prepareStatement(sql);
	 		ResultSet res = stmt.executeQuery();
	 		while (res.next()) {
	 			Aluno a = new Aluno(Integer.parseInt(res.getString("id"))
	 								,res.getString("nome"),
	 								res.getString("login"),
	 								res.getString("senha"));
	 			lista.add(a);
	 		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;		
	}


	@Override
	public Aluno buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

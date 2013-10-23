package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Aluno;
import beans.Estudante;

import db.Conexao;

public class EstudanteDao extends Dao<Estudante>{
	 
	 
	@Override
	public void adicionar(Estudante a) {
		String sql = "insert into estudante  (id,nome,mastricula,turma,serie) values (null,?,?,?,?)";
		try {
			PreparedStatement stmt = c.prepareStatement(sql);
			stmt.setString(1,a.getNome());
			stmt.setInt(2,a.getMatricula());
			stmt.setString(2,a.getTurma());
			stmt.setInt(3,a.getSerie());
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void excluir(Estudante a) {
		String sql = "delete from estudante  where id = ?";
		try {
			PreparedStatement stmt = c.prepareStatement(sql);
			stmt.setInt(1, a.getId());
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void excluir(int id) {
		Estudante a = new Estudante();
		a.setId(id);
		this.excluir(a);		
	}

	@Override
	public List<Estudante> listar() {
		String sql = "select * from estudante";
 		List<Estudante> lista = new ArrayList<Estudante>();
		try {
			PreparedStatement stmt = new Conexao().conectar().prepareStatement(sql);
	 		ResultSet res = stmt.executeQuery();
	 		while (res.next()) {
	 			Estudante a = new Estudante(Integer.parseInt(res.getString("id"))
	 								,res.getString("nome"),
	 								Integer.parseInt(res.getString("matricula")),
	 								res.getString("turma"),
	 								Integer.parseInt(res.getString("serie"))
	 								);
	 			lista.add(a);
	 		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista; 
	}

	@Override
	public Estudante buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

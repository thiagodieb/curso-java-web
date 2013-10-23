package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import beans.*;

public class CursoDao implements GeralDao<Curso> {

	@Override
	public boolean add(Curso c) throws SQLException {
		String sql = "INSERT INTO curso (id,nome,turno,conteudo,duracao) VALUES (null,?,?,?,?)";
		
		PreparedStatement ps = CONN.prepareStatement(sql);
		ps.setString(1,c.getNome());
		ps.setString(2,c.getTurno());
		ps.setString(3,c.getConteudo());
		ps.setString(4,c.getDuracao());
		return ps.execute();
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Curso update(Curso e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Curso> list() throws SQLException {
		String sql2 = "Select * from curso";
		PreparedStatement ps2 = CONN.prepareStatement(sql2);
		ResultSet rs2 = ps2.executeQuery();
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		while(rs2.next()){
			cursos.add(new Curso(
					rs2.getInt("id"),
					rs2.getString("nome"),
					rs2.getString("turno"),
					rs2.getString("conteudo"),
					rs2.getString("duracao")));
		}
		return cursos;
	}

	@Override
	public Curso getObjectById(int id)  throws SQLException  {
		String sql2 = "Select * from curso where id=?";
		PreparedStatement ps2 = CONN.prepareStatement(sql2);
		ps2.setInt(1, id);
		ResultSet rs2 = ps2.executeQuery();
		while(rs2.next()){
			return new Curso(
					rs2.getInt("id"),
					rs2.getString("nome"),
					rs2.getString("turno"),
					rs2.getString("conteudo"),
					rs2.getString("duracao"));
		}
		return null;
	}

}

package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.Categoria;
import beans.Livro;

public class LivroDao implements GeralDao<Livro>{

	@Override
	public boolean add(Livro e) throws SQLException {
		String sql = "INSERT INTO livro  VALUES (null,?,?,?,?,?)";
		PreparedStatement ps = CONN.prepareStatement(sql);
		ps.setString(1,e.getTitulo());
		ps.setString(2,e.getIsbn());
		ps.setString(3,e.getDescricao());
		ps.setInt(4,e.getPaginas());
		ps.setInt(5,e.getCategoria().getId());
		return ps.execute();
	}

	@Override
	public boolean delete(int id) throws SQLException {
		String sql = "delete from livro  where idlivro = ?";
		PreparedStatement ps = CONN.prepareStatement(sql);
		ps.setInt(1,id);
		return ps.execute();
	}

	@Override
	public Livro update(Livro e) throws SQLException {
		String sql = "UPDATE livro SET titulo=?, isbn=?, descricao=?, paginas=?, idcategoria=?  where idlivro = ?";
		PreparedStatement ps = CONN.prepareStatement(sql);
		ps.setString(1,e.getTitulo());
		ps.setString(2,e.getIsbn());
		ps.setString(3,e.getDescricao());
		ps.setInt(4,e.getPaginas());
		ps.setInt(5,e.getCategoria().getId());
		ps.setInt(6,e.getId());
		ps.execute();	
		return e;
	}

	@Override
	public List<Livro> list() throws SQLException {
		String sql2 = "Select * from livro";
		Statement stm = CONN.createStatement();
		PreparedStatement ps2 = CONN.prepareStatement(sql2);
		ResultSet rs = ps2.executeQuery();
		ArrayList<Livro> livros = new ArrayList<Livro>();
		while(rs.next()){
			Livro l = new Livro(
					rs.getInt("idLivro"),
					rs.getString("titulo"),
					rs.getString("descricao"),
					rs.getString("isbn"),
					rs.getInt("paginas"),
					null);
			Categoria c = new CategoriaDao().getObjectById(rs.getInt("idcategoria"));
			l.setCategoria(c);
			livros.add(l);
		}
		return livros;
	}

	@Override
	public Livro getObjectById(int id) throws SQLException {
		String sql2 = "Select * from livro l , categoria c where idlivro=? and l.idcategoria = c.idcategoria";
		PreparedStatement ps2 = CONN.prepareStatement(sql2);
		ps2.setInt(1, id);
		ResultSet rs2 = ps2.executeQuery();
		while(rs2.next()){
			return new Livro(
					rs2.getInt("idLivro"),
					rs2.getString("titulo"),
					rs2.getString("descricao"),
					rs2.getString("isbn"),
					rs2.getInt("paginas"),
					new Categoria(rs2.getInt("idCategoria"),rs2.getString("nome")) );
		}
		return null;
	}

}

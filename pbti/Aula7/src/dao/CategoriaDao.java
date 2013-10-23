package dao;

import java.sql.*;
import java.util.*;

import beans.*;

public class CategoriaDao implements GeralDao<Categoria> {
	
 	@Override
	public boolean add(Categoria e) throws SQLException {
		String sql = "Insert into categoria valeus (null,?)";
		PreparedStatement ps = CONN.prepareStatement(sql);
		ps.setString(1,e.getNome());
		ps.executeQuery();
 		return true;
		
	}

	@Override
	public boolean delete(int id)  throws SQLException {
		String sql = "DELETE from categoria where idCategoria = ?";
		PreparedStatement ps = CONN.prepareStatement(sql);
		ps.setInt(1,id);
		ps.executeQuery();
		return true;
		
	}

	@Override
	public Categoria update(Categoria e)  throws SQLException {
		String sql = "UPDATE categoria SET nome=? where idCategoria = ?";
		PreparedStatement ps = CONN.prepareStatement(sql);
		ps.setString(1,e.getNome());
		ps.setInt(2,e.getId());
		ps.executeQuery();
		return e;
	}

	@Override
	public List<Categoria> list() throws SQLException {
		String sql2 = "Select * from categoria";
		Statement stm = CONN.createStatement();
		PreparedStatement ps2 = CONN.prepareStatement(sql2);
		ResultSet rs = ps2.executeQuery();
		ArrayList<Categoria> categorias = new ArrayList<Categoria>();
		while(rs.next()){
			categorias.add(new Categoria(
					rs.getInt("idCategoria"),
					rs.getString("nome")));
		}
		return categorias;
	}

	@Override
	public Categoria getObjectById(int id) throws SQLException {
		String sql2 = "Select * from categoria where idCategoria=?";
		PreparedStatement ps2 = CONN.prepareStatement(sql2);
		ps2.setInt(1, id);
		ResultSet rs2 = ps2.executeQuery();
		while(rs2.next()){
			return new Categoria(
					rs2.getInt("idCategoria"),
					rs2.getString("nome"));
		}
		return null;
	}


}

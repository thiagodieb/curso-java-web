package dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import beans.Curso;
import connections.*;

public interface GeralDao<G> {

	public static Connection CONN = Conection.getConection();
	
	public boolean add(G e) throws SQLException ;

	public boolean delete(int id) throws SQLException;

	public G update(G e) throws SQLException;

	public List<G> list()  throws SQLException;

	public G getObjectById(int id)  throws SQLException ;

}

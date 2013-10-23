package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction; 
import util.Connections;

public class GenericDao<T>{
	
	protected Session s = Connections.getSession();
	protected Transaction t;
	
	public T add(T objeto ){
		t = s.beginTransaction();
		s.save(objeto);
		t.commit();
		s.close();
		return objeto;
	}
	
	public T update(T objeto ){
		t = s.beginTransaction();
		s.update(objeto);
		t.commit();
		s.close();
		return objeto;
	}
	
	public T delete(T objeto ){
		t = s.beginTransaction();
		s.delete(objeto);
		t.commit();
		s.close();
		return objeto;
	}
	
	public List<T> list(String classe){
		String sql = "from "+classe;
		t = s.beginTransaction();
		List<T>  list = (List<T>) s.createQuery(sql).list();
		t.commit();
		return list;
	}
	
}

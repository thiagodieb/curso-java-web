package dao;

import java.util.List; 
import org.hibernate.Session;
import org.hibernate.Transaction; 
import util.Connection; 
import beans.Pessoa;

public class PessoaDao {
	private Session s = Connection.getSession();
	private Transaction t;
	
	public Pessoa add(Pessoa p){
		t = s.beginTransaction();
		s.save(p);
		t.commit();
		return p;
	}
	public Pessoa update(Pessoa p){
		t = s.beginTransaction();
		s.update(p);
		t.commit();
		return p;
	}
	public List<Pessoa> list(){
		return (List <Pessoa>) s.createQuery("from Pessoa").list();
	}
	public Pessoa delete(Pessoa p){
		t = s.beginTransaction();
		s.delete(p);
		t.commit();
		return p;
	}
}

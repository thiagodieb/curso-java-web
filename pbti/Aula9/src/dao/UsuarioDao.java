package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import beans.Usuario;

public class UsuarioDao {
	
	private Session s = Conexao.getSession();
	
	public void add(Usuario a){
		Transaction t = s.beginTransaction();
		s.saveOrUpdate(a);
		t.commit(); 
	}
	public void update(Usuario a){
		this.add(a); 
	}
	public void delete(int id){
		Transaction t = s.beginTransaction();
		Usuario u = new Usuario();
		u.setId(id);
		s.delete(u);
		t.commit();
	}
	public List<Usuario> list(){
		return (List<Usuario>) s.createQuery("from Usuario").list();
	}
	
	

}

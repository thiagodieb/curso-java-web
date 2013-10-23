package db;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

public class Conexao {

	private static Session s;
	
	public static Session getSession(){
		
		if(s == null){
			s = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		}
		return s;
	}
	
	
}

package dao;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

public class Conexao {
	
	private static Session session;
	
	public static Session getSession(){
		
		if(session == null){
			session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		}
		return session;
		
	}

}

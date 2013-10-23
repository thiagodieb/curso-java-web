package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Connection {

	private static Session s; 
	
	public static  Session getSession(){
		if(s == null){
			SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
			s = sf.openSession(); 
		}
		return s;
	}
}

package db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Conexao {
	private static Session s = null;
	public static Session getSession(){
		if(s == null){
			Configuration c = new Configuration();
			SessionFactory sf = c.configure().buildSessionFactory();
			s = sf.openSession();
		}
		return s;
	}

}

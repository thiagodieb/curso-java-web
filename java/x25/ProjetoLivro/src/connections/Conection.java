package connections;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Conection {
	
	private static EntityManager conn;
	
	public static EntityManager getConection(){

		if(Conection.conn == null){
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso");
			EntityManager em = emf.createEntityManager();
			conn = em;
		}
		return conn;
	}

}

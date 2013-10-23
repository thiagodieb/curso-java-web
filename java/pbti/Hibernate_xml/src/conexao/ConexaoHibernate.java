package conexao;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConexaoHibernate {
	public static SessionFactory createSession(){
		try{
			Configuration cf = new Configuration();
			cf.configure();
			return cf.buildSessionFactory();
		}catch(Throwable e){
			System.out.println("Falha:"+e);
			throw new ExceptionInInitializerError(e);
		}		
	}
}
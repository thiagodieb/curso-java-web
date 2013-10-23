import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Conexao {
	protected static SessionFactory factory;
	protected Session session;

	public Conexao() {
		factory = new Configuration().configure().buildSessionFactory();
	}

	protected Session conectar() throws Throwable {
		session = factory.openSession();
		session.beginTransaction();
		return session;
	}

	protected void desconectar() throws Throwable {
		session.getTransaction().commit();
		session.close();
	}
}

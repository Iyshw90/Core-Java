import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class StudentCheck {
	public static void main(String arg[]) {

		Configuration config = new Configuration();

		config.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.close();

		System.out.println("Object Saved");

	}
}

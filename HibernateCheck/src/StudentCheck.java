import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentCheck 
{
	public static void main(String arg[])
	{
		
		Configuration config=new Configuration();
		
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=config.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		/*com.Student student=new com.Student();
		
		student.setStudId(1005);
		student.setStudName("Yang");
		student.setStudAddr("Chennai");
		
		
		Transaction transaction=session.beginTransaction();
		session.save(student);
		
		transaction.commit();*/
		
		session.close();
		
		System.out.println("Table Created");
		
	}
}

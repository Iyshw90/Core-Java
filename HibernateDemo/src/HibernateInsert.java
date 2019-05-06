import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateInsert 
{
	public static void main(String arg[])
	{
		
		Configuration config=new Configuration();
		
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=config.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		com.Employee employee=new com.Employee();
		
		employee.setEmployeeId(1005);
		employee.setEmployeeName("Yang");
		employee.setAddr("Chennai");
		employee.setSalary(45000);
		
		Transaction transaction=session.beginTransaction();
		session.save(employee);
		
		transaction.commit();
		
		session.close();
		
		System.out.println("Object Inserted");
		
	}
}

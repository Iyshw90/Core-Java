import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Employee;

public class HibernateDelete
{
	public static void main(String arg[])
	{
		
		Configuration config=new Configuration();
		
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=config.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Employee ID To Update:");
		int employeeId;
		employeeId=scanner.nextInt();
		
		Employee employee=(Employee)session.get(Employee.class,employeeId);
		
		
					
		
		Transaction transaction=session.beginTransaction();
		session.delete(employee);
		transaction.commit();
		
		session.close();
		
		System.out.println("Object Deleted");
		
	}
}

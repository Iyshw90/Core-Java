class Printer implements Runnable
{
	public void run()
	{
		for(int i=0; i< 5;i++)
		{
			System.out.println("Printing..."+i+"  | "+Thread.currentThread().getName());
			try{
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class Fax implements Runnable
{
	public synchronized void run()
	{
		for(int i=0; i< 5;i++)
		{
			System.out.println("Receiving Fax..."+i+"  | "+Thread.currentThread().getName());
			try{
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}


public class RunnableDemo
{
	public static void main(String arg[])
	{
		Printer p1 = new Printer();
		Fax f1 = new Fax();
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p1);
		Thread t3 = new Thread(f1);
		Thread t4 = new Thread(f1);
					
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
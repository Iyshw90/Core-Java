class HPPrinter extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("HP Printer - Printing...."+i +" | "+ Thread.currentThread().getName());
			
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

class CanonPrinter extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("HP Printer - Printing...."+i+" | "+Thread.currentThread().getName());
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

public class ThreadDemo
{
	public static void main(String arg[])
	{
		HPPrinter p1 = new HPPrinter();
		CanonPrinter c1 = new CanonPrinter();
		p1.start();
		c1.start();
	}
}
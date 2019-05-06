import java.util.Scanner;

class eLensKart 
{
	int lens = 50;
	synchronized void buy(int lens)
	{
		if(this.lens < lens)
		{
			System.out.println("Insufficient Stock");
			try{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		this.lens = this.lens - lens;
		System.out.println("Lens Purchased");
		
	}
	synchronized void getStock(int lens)
	{
		this.lens = this.lens +lens;
		System.out.println("Received Stock"+this.lens);
		notify();
	}
}

public class ThreadWaitDemo
{
	static int num;
	static eLensKart e = new eLensKart();

	
	static class BuyProduct extends Thread
	{
		public void run()
		{
			e.buy(num);			
		}
	}
	
	static class GetProduct extends Thread
	{
		public void run()
		{
			e.getStock(50);
		}
	}
	
		
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no.of lens to be purchase| Limit is only 50");
		num = scan.nextInt(); 
		BuyProduct b = new BuyProduct();
		GetProduct g = new GetProduct();
		b.start();
		g.start();
		
	}
}
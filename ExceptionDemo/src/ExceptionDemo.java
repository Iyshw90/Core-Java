import java.util.Scanner;

class Average
{
	private double m1,m2,m3;
	
	public Average(double m1,double m2,double m3)
	{
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public double calculate() throws ArithmeticException 
	{
		if((this.m1<= 0) || (this.m2<= 0) || (this.m3<= 0))
		{
			throw new ArithmeticException();
		}
		return (this.m1+this.m2+this.m3)/3;
	}
}

public class ExceptionDemo
{
	public static void main(String arg[])
	{
		double m1,m2,m3;
		double avg =0.0;
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a 1st Mark:");
			m1= scan.nextInt();
			System.out.println("Enter a 2nd Mark:");
			m2= scan.nextInt();
			System.out.println("Enter a 3rd Mark:");
			m3= scan.nextInt();
			
			Average avgObj= new Average(m1,m2,m3);
			avg = avgObj.calculate();
			System.out.println("Average value:"+avg);
				
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Entered number is less than or equal zero");
		}
		catch(Exception e)
		{
			System.out.println("Unknown Exception");
		}
	}
	
}
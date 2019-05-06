import java.util.Scanner;
public class Factorial {
	
	public static void main(String arg[])
	{
		int num,i=1;
		long fact=1;
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the Number:");
		num = scannerObj.nextInt();
		scannerObj.close();
		
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial is: "+fact);
		
		
		
	}

}

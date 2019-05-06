import java.util.Scanner;
public class FibanocciSeries {

	public static void main(String arg[])
	{
		int num,sum=0;
		int firstNumber=0,nextNumber=1;
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the number:");
		num= scannerObj.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			System.out.print(firstNumber+" ");
			sum = firstNumber + nextNumber;
			firstNumber = nextNumber;
			nextNumber = sum;
		}
		
		
		
	}
}

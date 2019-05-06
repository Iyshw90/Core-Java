import java.util.Scanner;
public class ArmstrongNumber {
	
	public static void main(String arg[])
	{
	
		int inputNumber,value=0,sum=0,number;
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the Number :");
		inputNumber = scannerObj.nextInt();
		number = inputNumber;
		
		while(number != 0)
		{
			value = number%10;
			sum = sum + value*value*value;
			number /=10;
		}
		
		if(sum == inputNumber)
		{
			System.out.println("Armstrong Number ");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}
	}
	

}

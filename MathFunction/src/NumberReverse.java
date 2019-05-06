import java.util.*;

public class NumberReverse {

	public static void main(String arg[])
	{
		int num,rem=0,result=0;
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the number:");
		num= scannerObj.nextInt();
		
		while(num !=0)
		{
			rem = num%10;
			result = (result*10)+rem;
			num=num/10;
		}
		System.out.println("Reversed Number is:"+result);
	}
}

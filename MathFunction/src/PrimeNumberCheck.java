import java.util.Scanner;
public class PrimeNumberCheck {

	public static void main(String arg[])
	{
		int num,checkFactor=0;
		Scanner scanerObj= new Scanner(System.in);
		System.out.println("Enter the number:" );
		num = scanerObj.nextInt();
		scanerObj.close();
		
		for(int i=num;i>=1;i--)
		{
			if(num%i== 0)
			{
				checkFactor= checkFactor+1;
			}
		}
		if(checkFactor == 2)
		{
			System.out.println("Prime Number");
		}
		else{
			System.out.println("Not A Prime Number");
		}
	}
}

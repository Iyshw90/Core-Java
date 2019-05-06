import java.util.Scanner;

public class StringReverse
{
	public static void main(String arg[])
	{
		String inputString;
		int len;
		char[] chArray;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the String:");
		inputString = scan.nextLine();
		
		len= inputString.length();
		System.out.println("Input String length::::"+len);
		chArray = inputString.toCharArray();
		
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(chArray[i]);
		}
			
	}
	
}
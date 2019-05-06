import java.util.Scanner;

public class StringLength
{
	public static void main(String arg[])
	{
		String inputString;
		char[] chArray;
		int len=0;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the String:");
		inputString = scan.next();
		chArray = inputString.toCharArray();
		
		scan.close();
		
		for(char c: chArray)
		{
			len++;
		}
		
		/*for (int i=0;chArray[i]!='\0' ; i++)
		{
			len++;
		}*/
		
		System.out.println("Total no  of charecters :"+len);

			
	}
	
}
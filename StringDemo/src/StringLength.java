import java.util.Scanner;

public class StringLength {

	public static void main(String arg[])
	{
		String str;
		int len = 0;
		char[] chArray;
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the string:");
		str = scan.next();
		chArray = str.toCharArray();
		/*
		 * for(int i=0; chArray[i] != '\0';i++)
		 * 
		 * {
		 * 
		 * len++;
		 * 
		 * }
		 */	
	
		for(char c: chArray )
		{
			len++;
		}
		
		System.out.println("Length of string: " +len);
		
	}
}

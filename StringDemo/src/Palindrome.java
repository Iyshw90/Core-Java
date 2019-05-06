import java.util.Scanner;

public class Palindrome
{
	public static void main(String arg[])
	{
		String inputString;
		int len;
		char[] chArray;
		boolean checkFlag = true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the String:");
		inputString = scan.next();
		len= inputString.length();
		chArray = inputString.toCharArray();
		scan.close();
		
		
		for(int i=0,j=len-1;i<chArray.length && j>=0;i++,j--)
		{
			if(chArray[i]!= chArray[j])
			{
				checkFlag = false;
				break;
			}
		}
		if(checkFlag)
		{
			System.out.println(inputString+" is a Palindrome");
		}
		else
		{
			System.out.println(inputString+"is not a Palindrome");
		}
	}
}
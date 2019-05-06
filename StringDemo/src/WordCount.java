import java.util.Scanner;

public class WordCount {

	public static void main(String arg[])
	{
		String str;
		int count ;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string:");
		str = scan.nextLine();
		
		if(str.charAt(0)== ' ')
		{
			count =0;
		}
		else
		{
			count =1;
		}
		System.out.println(",,,"+str.length());
		for(int i=0; i<str.length() ;i++)
		{
			if(i+1 < str.length())
			{
			if(str.charAt(i)== ' ' && str.charAt(i+1)!= ' ')
			{
				count++;
			}
			}
			
		}
		System.out.println("Total number of words:"+count);
		
	
	}
}

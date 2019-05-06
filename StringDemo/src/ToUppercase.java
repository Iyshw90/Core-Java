import java.util.Scanner;

public class ToUppercase {

	public static void main(String arg[])
	{
		String str;
		int asciiValue ;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string:");
		str = scan.next();
		
		for(int i=0; i<str.length() ;i++)
		{
			asciiValue = str.charAt(i);
			//System.out.println(asciiValue);
			if(asciiValue>96 && asciiValue<123)
            {
				asciiValue=asciiValue-32;
                System.out.print((char) asciiValue);
            }
			else if(asciiValue>64 && asciiValue<91)
			{
				System.out.print((char) asciiValue);
				
			}
			else if(asciiValue >47 && asciiValue <58 )
			{
				System.out.print((char) asciiValue);
			}
		}
		
	}
}

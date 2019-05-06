import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandlingDemo
{
	public static void main(String arg[])
	{
		try{
			FileInputStream fis = new FileInputStream("C:\\Iyshw\\FileInput.txt");
			FileOutputStream fos = new FileOutputStream("C:\\Iyshw\\FileOutputStream.txt");
			int i;
			String str="";
			System.out.println("Content:");
			System.out.println("--------");
			
			while((i=fis.read())!= -1)
			{
				System.out.print((char)i);
				str = str + (char)i;
				
			}
			
			System.out.println();
			System.out.println("Printing String"+str);
			fos.write(str.getBytes());
					
		}
		catch(Exception e)
		{
			System.out.println("Exception Occurred!");
		}
	}
}
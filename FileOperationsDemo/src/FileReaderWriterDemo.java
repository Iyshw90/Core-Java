import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
 
public class FileReaderWriterDemo
{
	public static void main(String arg[])
	{
		try{
			/*File Reader demo*/
			FileReader fr = new FileReader("C:\\Iyshw\\FileInput.txt");
			System.out.println("Reading from the file...");
			char[] ch = new char[400];
			System.out.println("Copying the Contents of file to Char[]...");
			System.out.println();
			fr.read(ch);
			System.out.println("Printing the char Array:");
			System.out.println("------------------------");
			for(int i=0;i<ch.length;i++)
			{
				System.out.print(ch[i]);
			}
			System.out.println();
			
			
			/*File Writer demo*/
			int i;
			FileWriter fw = new FileWriter("C:\\Iyshw\\FileWriter.txt");
			FileReader fr1 = new FileReader("C:\\Iyshw\\FileInput.txt");
			System.out.println("Writing into the file...");
			fw.write(ch);
			fw.flush();
			System.out.println("Printing the Contents of FileWriter.txt:");
			System.out.println("----------------------------------------");
			while((i=fr1.read())!= -1)
			{
				System.out.print((char)i);
			}
			
			
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("File is not found in the given location");
		}
		catch(Exception e)
		{
			System.out.println("Unknown Exception");
		}
			
		
	}
	
}
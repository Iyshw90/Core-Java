import java.util.*;
import java.io.*;

public class Product
{
	
	public static void main(String arg[])
	{
		
			
String txt = "Please locate where locate occurs!";
char[] ch = txt.toCharArray();

for (int i=0;i<txt.length();i++)
System.out.print(ch[i]);

System.out.println("Printing index number:"+txt.indexOf("locate")); 
System.out.println("Print text"+ch[txt.indexOf("locate")]);

for (int i=0;i<txt.length();i++)
System.out.print(ch[i]);




	}
}
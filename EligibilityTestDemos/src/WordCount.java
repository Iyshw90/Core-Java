import java.util.Scanner;

public class WordCount
{
public static void main(String arg[])
{
int count = 0;
Scanner scan = new Scanner(System.in);
System.out.println("Enter the String:");
String str = scan.nextLine();

char[] ch = str.toCharArray();

if(str.charAt(0)== ' ')
{
count=0;
}
else
{
count =1;
}

for(int i=0; i<str.length() ;i++)
{
if(i+1< str.length())
{
if((str.charAt(i)== ' ' ) && (str.charAt(i+1)!=' '))
{
count = count +1;
}
}
}

System.out.println("The number of words is:"+count);


}
}
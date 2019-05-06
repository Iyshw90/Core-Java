import java.util.Scanner;
public class BiggestAndSmallest
{
public static void main(String arg[])
{
int max,min;
int a[] = new int[5];
Scanner scan = new Scanner(System.in);
for(int i=0;i<a.length;i++)
{
System.out.println("Enter one number and press enter key:");
a[i]=scan.nextInt();
}
max = a[0];

for(int i=0;i<a.length;i++)
{
if(max < a[i])
{
  max = a[i];
}
}
System.out.println("Maximum of the given number is:"+max);

min= a[0];

for(int i=0;i<a.length;i++)
{
if(min > a[i])
{
min=a[i];
}
}
System.out.println("Minimum of the given number is "+min);
}
}
import java.util.Scanner;
public class Factorial{
 
public static void main(String arg[])
{
int num;
long fact=1;
Scanner scan = new Scanner(System.in);
System.out.println("Enter the number:");
num=scan.nextInt();
scan.close();

for(int i=1;i<=num;i++)
{
fact= fact*i;
}

System.out.println("Factorial of "+num+" is :"+fact);

}

}
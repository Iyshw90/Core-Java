import java.util.Scanner;

public class CharCount {

	public static void main(String arg[]) {
		String str;
		int count = 0;

		char c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string:");
		str = scan.next();
		System.out.println("Enter the charecter:");
		c = scan.next().charAt(0);
		// c=(char) System.in.read();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c)
				count++;
		}

		System.out.println("The No.of.occurance of" + c + "is :" + count);

	}
}

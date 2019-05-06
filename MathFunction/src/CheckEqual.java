import java.util.*;

public class CheckEqual {

	public int calculateLHS(int a, int b) {
		return (a + b) * (a + b);
	}

	public int calculateRHS(int a, int b) {
		return (a * a) + 2 * a * b + (b * b);
	}

	public static void main(String arg[]) {
		int a, b, lhs, rhs;

		CheckEqual obj = new CheckEqual();
		Scanner scannerObj = new Scanner(System.in);

		System.out.println("Enter the 'a' value:");
		a = scannerObj.nextInt();
		System.out.println("Enter the 'b' value:");
		b = scannerObj.nextInt();

		lhs = obj.calculateLHS(a, b);
		rhs = obj.calculateRHS(a, b);

		if (lhs == rhs) {
			System.out.println("L.H.S = R.H.S");
		} else {
			System.out.println("L.H.S != R.H.S");
		}
	}

}

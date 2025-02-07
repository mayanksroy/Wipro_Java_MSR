package ExceptionHandling;

import java.util.Scanner;

public class test2 {
	
	public void division(int x) throws ArithmeticException {
		System.out.println("Division: " + 100/x);
	}
	public static void main(String[] args) {
		test2 obj = new test2();
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter Numerator: ");
			int x = scanner.nextInt();
			
			obj.division(x);
		}
		catch (RuntimeException re) {
			System.out.println("Do not use zero as denominator");
		}
		finally {
			scanner.close();
		}
	}
}

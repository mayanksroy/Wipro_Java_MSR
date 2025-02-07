package ExceptionHandling;

import java.util.*;

public class test1 {
	static int x;
	static int y;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter Numerator: ");
			int x = scanner.nextInt();
			System.out.println("Enter Denominator");
			int y = scanner.nextInt();
			
			System.out.println("Division is: " + x/y);
		}
		
		catch (RuntimeException re) {
			
			if(re instanceof ArithmeticException) {
				System.out.println("Do not put zero '0' as Denominator");
			}
			else if (re instanceof InputMismatchException) {
				System.out.println("Please Use Numericals Only");
			}
		}
		finally {
			scanner.close();
			System.out.println("This is finally Complete!");
		}
		
	}
	
}


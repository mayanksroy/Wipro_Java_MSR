package ExceptionHandling;
import java.util.Scanner;

public class test3 {
	void checkweight(int w) {
		if (w > 100) {
			System.out.println("Product Valid");
		}
		else {
			try {
				throw new InvalidException();
			}
			catch (InvalidException ie) {
				System.out.println("Product weight must be greater then 100");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Value: ");
		int w = scanner.nextInt();
		test3 obj = new test3();
		obj.checkweight(w);
		scanner.close();
	}
}

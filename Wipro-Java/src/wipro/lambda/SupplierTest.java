package wipro.lambda;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter Input: ");
		String str = read.next();
		
		Supplier<Integer> supp = () -> str.length();
		System.out.println("Length of String: " + supp.get());
		read.close();
	}
}

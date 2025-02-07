package wipro.lambda;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionalTest {
	public static void main(String[] args) {
		Function<String, Integer> str = x -> x.length();
		Scanner read = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = read.nextLine();
		System.out.println("Length of String: " + str.apply(input));
		read.close();
	}
}

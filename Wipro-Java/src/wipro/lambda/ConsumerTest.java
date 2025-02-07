package wipro.lambda;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Input: ");
		String a = read.next();
		Consumer<String> consume = x -> System.out.println("Mr. " + x);
		consume.accept(a);
		read.close();
	}
}

package wipro.lambda;
import java.util.Scanner;
import java.util.function.Predicate;
public class PradicateTest {
	public static void main(String[] args) {
		Predicate<Integer> p = x -> x%2==0;
		Scanner read = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = read.nextInt();
		boolean a = p.test(num);
		if(a == true) {
			System.out.println(num + " is Even");
		}
		else {
			System.out.println(num + " is Odd");
		}
		read.close();
	}
}

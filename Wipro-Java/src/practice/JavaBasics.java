package practice;
import java.util.Scanner;

public class JavaBasics {
	void Sum(int a, int b) {
		System.out.println("Sum is: " + (a+b));
	}
	
	public static void main(String[] args) {
		//main method
		//scanner function
		//output function
		//operation
		//method creation
		//method calling
		//object creation
		//method calling using object
		
		Scanner read = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int a = read.nextInt();
		System.out.println("Enter Number 2: ");
		int b = read.nextInt();
		
//		int sum = a+b;
//		System.out.println("Sum is: " + sum);
		
		JavaBasics obj = new JavaBasics();
		obj.Sum(a, b);
		read.close();
	}
}
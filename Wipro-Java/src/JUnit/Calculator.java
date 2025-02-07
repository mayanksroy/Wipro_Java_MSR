package JUnit;

public class Calculator {
	public int sum(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int division(int a, int b) {
		if(b==0) throw new ArithmeticException("Division by Zero Not Possible");
		return a/b;
	}
}

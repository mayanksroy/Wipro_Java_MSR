package ExceptionHandling;

public class test2main {
	public static void main(String[] args) {
//		test2 obj = new test2();
		
		try {
//			obj.division();
		}
		catch (RuntimeException re) {
			System.out.println("Do not use zero as denominator");
		}
	}
}

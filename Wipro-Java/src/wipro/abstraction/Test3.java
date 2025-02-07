package wipro.abstraction;

public class Test3 {
	public static void main(String[] args) {
		I1 obj = new I1impl1();
		obj.operation(1, 2);
		
		I1 obj2 = new I1impl2();
		obj2.operation(3, 1);
	}
}

package wipro.inheritance;

public class A {
	public void sub(int x, int y) {
		System.out.println(x-y);
	}
	public static void main(String[] args) {
		A obj = new A();
		obj.sub(3, 1);
	}
}

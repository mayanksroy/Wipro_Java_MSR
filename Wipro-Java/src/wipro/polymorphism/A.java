package wipro.polymorphism;

public class A {
	//method overloading
	void sum(int a, int b) {
		System.out.println("Sum of integers is " + (a+b));
	}
	void sum(float a, float b) {
		System.out.println("Sum of float is " + (a+b));
	}
	public static void main(String[] args) {
		A obj = new A();
		obj.sum(2, 3);
		obj.sum(4.2f, 5.5f);
	}
}

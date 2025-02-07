package wipro.polymorphism;

public class C extends B{
	@Override
	void Animal() {
		System.out.println("Eats Grass");
	}
	public static void main(String[] args) {
		B obj = new B();
		obj.Animal();
	}
}

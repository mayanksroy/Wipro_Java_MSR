package wipro.abstraction;

public interface I3 {
	public static void sum(int x, int y) {
		System.out.println("Sum: " + (x+y));
	}
	
	public default void sub(int x, int y) {
		System.out.println("Sub: " + (x-y));
	}
	
	public static void main(String[] args) {
		I3.sum(1, 2);
	}
}

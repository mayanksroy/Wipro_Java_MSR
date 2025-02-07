package wipro;
import java.util.*;
public class Employee {
	String name;
	int id;
	
	Employee(String x, int y){
		name = x;
		id = y;
	}
	
	void display() {
		System.out.println("Name of Employee: " + name);
		System.out.println("ID of Employee: " + id);
		System.out.println("Welcome!");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = scanner.nextLine();
		System.out.println("Enter Your ID: ");
		int id = scanner.nextInt();
		
		Employee studinfo = new Employee(name, id);
		studinfo.display();
		
		scanner.close();
	}

}

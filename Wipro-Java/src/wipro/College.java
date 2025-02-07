package wipro;
import java.util.*;
public class College {
	String name;
	int id;
	static String cllgname = "MIET";
	static int cllgcode = 68;
	
	College(String x, int y){
		name = x;
		id = y;
	}
	
	void display() {
		System.out.println("Name of Student is " + name);
		System.out.println("ID of Student is " + id);
		System.out.println("College Name is " + cllgname);
		System.out.println("College Code is " + cllgcode);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = scanner.nextLine();
		System.out.println("Enter Your ID: ");
		int id = scanner.nextInt();
		
		College studinfo = new College(name, id);
		studinfo.display();
		
		scanner.close();
	}
}

package wipro;

public class Oops1 {
	int id = 1;
	String name = "Mayank Singh";
	static String cllgname= "MIET";
	
	public static void main(String[] args) {
		Oops1 Obj = new Oops1();
		System.out.println("Student ID: " + Obj.id);
		System.out.println("Student Name: " + Obj.name);
		System.out.println("College Name: " + cllgname);
		
		System.out.println("");
		
		Obj.id = 2;
		Obj.name = "Pradeep Kushwaha";
		
		System.out.println("Student ID: " + Obj.id);
		System.out.println("Student Name: " + Obj.name);
		System.out.println("College Name: " + cllgname);
	}
}

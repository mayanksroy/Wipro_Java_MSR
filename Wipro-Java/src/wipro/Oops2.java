package wipro;

public class Oops2 {
	int empid;
	String empname;
	
	Oops2(){
		empid = 101;
		empname = "Abhishek";
	}
	
	Oops2(int x, String y){
		empid = x;
		empname = y;
	}
	
	Oops2(int x){
		empid = x;
	}
	
	Oops2(String y){
		empname = y;
	}
	
	
	public void display()
	{
		System.out.println("Emp ID: " + empid);
		System.out.println("Emp Name: " + empname);
	}
	
	public static void main(String[] args) {
		Oops2 emp1 = new Oops2();
		emp1.display();
		Oops2 emp2 = new Oops2(102, "Mukund");
		emp2.display();
		Oops2 emp3 = new Oops2(103);
		emp3.display();
		Oops2 emp4 = new Oops2("Kanishk");
		emp4.display();
		
	}
}

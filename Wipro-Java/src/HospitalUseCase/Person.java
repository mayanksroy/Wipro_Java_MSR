package HospitalUseCase;

abstract public class Person {
	private String name;
	private String email;
	private double phone;
	
	public Person(String name, String email, double phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	
	public abstract void performAction();
	
}

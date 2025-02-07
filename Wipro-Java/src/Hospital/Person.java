package Hospital;

abstract class Person {
    private String name;
    private String email;
    private String phone;

    // Constructor
    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
    
    // Abstract method for polymorphism
    public abstract void performAction();
}

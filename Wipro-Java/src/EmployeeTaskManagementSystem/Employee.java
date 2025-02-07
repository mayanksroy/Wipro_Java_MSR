package EmployeeTaskManagementSystem;

class Employee {
    int id;
    String name;
    String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
    	return "EmpID: " + id + " Name: " + name + " Department: " + department;
    }
}
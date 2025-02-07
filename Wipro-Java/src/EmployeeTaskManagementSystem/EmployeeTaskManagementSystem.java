package EmployeeTaskManagementSystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class EmployeeTaskManagementSystem {

    private final HashMap<Integer, Employee> employeehm = new HashMap<>();
    private final HashMap<Integer, List<Task>> employeet = new HashMap<>();
    private final PriorityQueue<Task> pq = new PriorityQueue<>(Comparator.comparing(task -> task.priority));
    private final LinkedList<Task> pt = new LinkedList<>();

    public void addEmployee(int id, String name, String department) {
        Employee employee = new Employee(id, name, department);
        employeehm.put(id, employee);
        employeet.put(id, new ArrayList<>());
        System.out.println("Employee added successfully.");
    }

    public void assignTask(int employeeId, int taskId, String description, String priority, String status) {
        Task task = new Task(taskId, description, priority, status);
        if (!employeet.containsKey(employeeId)) {
            System.out.println("Employee not found. Please add the employee first.");
            return;
        }
        employeet.get(employeeId).add(task);
        pq.add(task);
        if (status.equalsIgnoreCase("Pending")) {
            pt.add(task);
        }
        System.out.println("Task assigned successfully.");
    }

    public void markTaskAsCompleted(int employeeId, int taskId) {
        if (!employeet.containsKey(employeeId)) {
            System.out.println("Employee not found.");
            return;
        }

        List<Task> tasks = employeet.get(employeeId);
        for (Task task : tasks) {
            if (task.taskId == taskId && task.status.equalsIgnoreCase("Pending")) {
                task.status = "Completed";
                pt.remove(task);
                System.out.println("Task marked as completed successfully.");
                return;
            }
        }
        System.out.println("Pending task with the given Task ID not found.");
    }

    public void viewEmployees() {
        System.out.println("======= Employees =======");
        for (Employee employee : employeehm.values()) {
            System.out.println(employee);
        }
    }

    public void viewTasksByEmployee(int employeeId) {
        if (!employeet.containsKey(employeeId)) {
            System.out.println("Employee not found or no tasks assigned.");
            return;
        }
        System.out.println("===== Tasks for Employee ID " + employeeId + " =====");
        for (Task task : employeet.get(employeeId)) {
            System.out.println(task);
        }
    }

    public void viewTasksByPriority() {
        List<Task> sortedTasks = new ArrayList<>(pq);
        sortedTasks.sort(Comparator.comparing(task -> task.priority));
        System.out.println("======= Tasks by Priority =======");
        for (Task task : sortedTasks) {
            System.out.println(task);
        }
    }

    public void viewPendingTasks() {
        System.out.println("======= Pending Tasks =======");
        for (Task task : pt) {
            System.out.println(task);
        }
    }

    public void removeCompletedTasks() {
        for (Map.Entry<Integer, List<Task>> entry : employeet.entrySet()) {
            List<Task> tasks = entry.getValue();
            tasks.removeIf(task -> task.status.equalsIgnoreCase("Completed"));
        }
        pq.removeIf(task -> task.status.equalsIgnoreCase("Completed"));
        pt.removeIf(task -> task.status.equalsIgnoreCase("Completed"));
        System.out.println("Completed tasks removed successfully.");
    }

    public static void main(String[] args) {
        EmployeeTaskManagementSystem system = new EmployeeTaskManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Employee Task Management System ===");
            System.out.println("1. Add Employee");
            System.out.println("2. Assign Task");
            System.out.println("3. View All Employees");
            System.out.println("4. View Tasks by Employee ID");
            System.out.println("5. View Tasks by Priority");
            System.out.println("6. View Pending Tasks");
            System.out.println("7. Mark Task as Completed");
            System.out.println("8. Remove Completed Tasks");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int empId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Department (Admin/Accounts/Library/Janitor): ");
                    String department = scanner.nextLine();
                    system.addEmployee(empId, name, department);
                    break;

                case 2:
                    System.out.print("Enter Employee ID: ");
                    int employeeId = scanner.nextInt();
                    System.out.print("Enter Task ID: ");
                    int taskId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Task Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter Task Priority (High/Medium/Low): ");
                    String priority = scanner.nextLine();
                    System.out.print("Enter Task Status (Pending/Completed): ");
                    String status = scanner.nextLine();
                    system.assignTask(employeeId, taskId, description, priority, status);
                    break;

                case 3:
                    system.viewEmployees();
                    break;

                case 4:
                    System.out.print("Enter Employee ID to view tasks: ");
                    int empIdForTasks = scanner.nextInt();
                    system.viewTasksByEmployee(empIdForTasks);
                    break;

                case 5:
                    system.viewTasksByPriority();
                    break;

                case 6:
                    system.viewPendingTasks();
                    break;

                case 7:
                    System.out.print("Enter Employee ID: ");
                    int empIdToMark = scanner.nextInt();
                    System.out.print("Enter Task ID: ");
                    int taskIdToMark = scanner.nextInt();
                    system.markTaskAsCompleted(empIdToMark, taskIdToMark);
                    break;

                case 8:
                    system.removeCompletedTasks();
                    break;

                case 9:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
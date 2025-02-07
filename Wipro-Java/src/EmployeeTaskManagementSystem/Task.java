package EmployeeTaskManagementSystem;

class Task {
    int taskId;
    String description;
    String priority;
    String status; 

    public Task(int taskId, String description, String priority, String status) {
        this.taskId = taskId;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }

    @Override
    public String toString() {
    	return "TaskID: " + taskId + " Description: " + description + " Priority: " + priority + " Status: " + status;
    }
}

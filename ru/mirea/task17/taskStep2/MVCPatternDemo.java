package ru.mirea.task17.taskStep2;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Employee model = retrieveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeName("Bob");
        System.out.println("After updating, Employee Details are as follows");
        controller.updateView();
    }
    static Employee retrieveEmployeeFromDatabase() {
        Employee employee = new Employee();
        employee.setName("Jon");
        employee.setSalary("1000$");
        return employee;

    }
}

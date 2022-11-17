package ru.mirea.task17.taskStep2;

public class EmployeeController {
    Employee model;
    EmployeeView view;
    EmployeeController(Employee model, EmployeeView view){
        this.model = model;
        this.view = view;
    }
    public void setEmployeeName(String name) {
        model.setName(name);
    }
    public String getEmployeeName() {
        return model.getName();
    }
    public void setEmployeeSalary(String salary) {
        model.setSalary(salary);
    }
    public String getEmployeeSalary() {
        return model.getSalary();
    }
    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getSalary());
    }
}

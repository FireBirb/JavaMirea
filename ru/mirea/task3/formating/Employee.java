package ru.mirea.task3.formating;

//import ru.mirea.task3.formating.Report;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {
    private String fullname;
    private double salary;

    Employee (String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getFullname() {
        return fullname;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[]{};
        System.out.println("How many employees?");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i<n; i++) {
            Employee employee = new Employee(scanner.nextLine(), scanner.nextDouble());
            employees = Arrays.copyOf(employees, employees.length + 1);
            employees[employees.length - 1] = employee;
            scanner.nextLine();
        }
        Report.generateReport(employees);
    }
}

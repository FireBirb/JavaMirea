package ru.mirea.task3.formating;

import java.util.Formatter;

import ru.mirea.task3.formating.Employee;
//Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака после запятой и можете добавить что-нибудь свое.

public class Report {
    static public void generateReport(Employee[] employees) {
        Formatter fmt = new Formatter();
        for (Employee employee : employees) {
            String s = employee.getFullname() + ": ";
            System.out.printf("%-30s%10.2f$%n", s, employee.getSalary());
        }
    }
}

package ru.mirea.task11.taskStep3;

import java.util.Calendar;

public class TestStudent {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Student student = new Student("John","Dow","Med","M2", 1, 1.7, cal);
        System.out.println(student);
        System.out.println(student.getDateOfBirth("EEEE, dd MMMM yyyy"));
        System.out.println(student.getDateOfBirth("d-MMM-yy"));
        System.out.println(student.getDateOfBirth("d/M/yy"));
    }
}

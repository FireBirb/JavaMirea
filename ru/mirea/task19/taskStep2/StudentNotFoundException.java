package ru.mirea.task19.taskStep2;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String name) {
        super("Student named "+ name + " not found");
    }
}
package ru.mirea.task19.taskStep2;

public class EmptyStringException extends IllegalArgumentException {
    public EmptyStringException() {
        super("Got empty string");
    }
}

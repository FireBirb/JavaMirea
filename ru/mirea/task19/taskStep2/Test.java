package ru.mirea.task19.taskStep2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Gina Down", 67, 12, 19));
        s.add(new Student("Alex Up", 57, 12, 18));
        s.add(new Student("Mahs Right", 93, 12, 19));
        s.add(new Student("Lake left", 24, 2, 18));
        new LabClassUI(s);
    }

}
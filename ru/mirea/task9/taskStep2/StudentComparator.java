package ru.mirea.task9.taskStep2;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGPA() > o2.getGPA()){
            return 1;
        } else if (o1.getGPA() < o2.getGPA()){
            return -1;
        }
        else return 0;
    }
}

package ru.mirea.task19.taskStep2;

import java.util.ArrayList;
import java.util.Comparator;

public class LabClass {
    private final ArrayList<Student> students;
    LabClass(ArrayList<Student> students) {
        this.students = students;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void add (Student student) {
        students.add(student);
    }
    public int size() {
        return students.size();
    }
    public Student get (int i) {
        return students.get(i);
    }
    public void remove(int i) {
        students.remove(i);
    }
    protected ArrayList<Student> sortStudents(Comparator<Student> comp){
        Student temp;
        for (int i = 1; i < students.size(); i++) {
            Student current = students.get(i);
            int j = i-1;
            for(; j >= 0 && comp.compare(current, students.get(j)) < 0; j--) {
                students.set(j+1, students.get(j));
            }
            students.set(j+1, current);
        }
        return students;
    }
}

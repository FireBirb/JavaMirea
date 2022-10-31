package ru.mirea.task9.taskStep4;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int age;
    private double GPA;

    @Override
    public int compareTo(Student o2) {
        if (GPA > o2.getGPA()){
            return 1;
        } else if (GPA < o2.getGPA()){
            return -1;
        }
        else return 0;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public double getGPA() {
        return GPA;
    }

    public Student(String name, String surname, int age, double GPA) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", GPA=" + GPA +
                '}';
    }
}

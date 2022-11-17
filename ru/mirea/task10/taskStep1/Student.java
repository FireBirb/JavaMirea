package ru.mirea.task10.taskStep1;

public class Student {
    private String name, surname, specialty, group;
    private int course;
    private double GPA;

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public double getGPA() {
        return GPA;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public String getSpecialty() {
        return specialty;
    }

    public Student(String name, String surname, String specialty, String group, int course, double GPA) {
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.group = group;
        this.course = course;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialty='" + specialty + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", GPA=" + GPA +
                '}';
    }
}

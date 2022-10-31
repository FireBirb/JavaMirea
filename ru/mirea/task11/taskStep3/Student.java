package ru.mirea.task11.taskStep3;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Student {
    private String name, surname, specialty, group;
    private int course;
    private double GPA;
    private Calendar dateOfBirth;

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

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDateOfBirth(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format, Locale.ENGLISH);
        String answ = dateFormat.format(dateOfBirth.getTime());
        return answ;
    }

    public Student(String name, String surname, String specialty, String group, int course, double GPA, Calendar dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.group = group;
        this.course = course;
        this.GPA = GPA;
        this.dateOfBirth = dateOfBirth;
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
                ", Date of birth=" + getDateOfBirth("dd/MM/yyyy") +
                '}';
    }
}

package ru.mirea.task19.taskStep2;

public class Student implements Comparable<Student>{
    private String name;
    private int GPA, groupNum, age;

    public static final AgeComparator AGE_COMP = new AgeComparator();
    public static final AvgComparator AVG_COMP = new AvgComparator();
    public static final GroupComparator GROUP_COMP = new GroupComparator();

    public Student(String name, int GPA, int groupNum, int age) {
        this.name = name;
        this.GPA = GPA;
        this.groupNum = groupNum;
        this.age = age;
    }

    public String getFio() {
        return name;
    }

    public void setFio(String name) {
        if(name.equals(""))
            throw new EmptyStringException();
        this.name = name;
    }

    public int getAvgPoint() {
        return GPA;
    }

    public void setAvgPoint(int GPA) {
        this.GPA = GPA;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " +
                "GPA = " + GPA +
                ", group = " + groupNum +
                ", age = " + age;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
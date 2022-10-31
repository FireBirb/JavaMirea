package ru.mirea.task2.taskStep4;

public class Dog {
    private String name;
    private int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public int getHuman() {
        return age*7;
    }
    public String toString() {
        return "Name: " + name + " Age: " + age + " (" + this.getHuman() + " in human years)";
    }
}

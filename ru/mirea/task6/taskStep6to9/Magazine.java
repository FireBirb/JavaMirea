package ru.mirea.task6.taskStep6to9;

public class Magazine implements Printable{
    String s;
    Magazine() {s = "This is a magazine";}
    @Override
    public void print() {
        System.out.println(s);
    }
}

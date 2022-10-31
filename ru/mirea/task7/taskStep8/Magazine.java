package ru.mirea.task7.taskStep8;

public class Magazine implements Printable {
    String s;
    Magazine() {s = "This is a magazine";}
    @Override
    public void print() {
        System.out.println(s);
    }
}

package ru.mirea.task6.taskStep6to9;

public class Book implements Printable{
    String s;
    Book() {s = "This is a book";}
    @Override
    public void print() {
        System.out.println(s);
    }
}

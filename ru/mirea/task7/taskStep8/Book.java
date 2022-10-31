package ru.mirea.task7.taskStep8;

public class Book implements Printable {
    String s;
    Book() {s = "This is a book";}
    @Override
    public void print() {
        System.out.println(s);
    }
    public static void printBooks(Printable[] printables) {
        for (Printable printable : printables)
        {
            if (printable instanceof Book) printable.print();
        }
    }
}

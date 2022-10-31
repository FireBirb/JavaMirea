package ru.mirea.task7.taskStep8;

public class TestPrint {
    public static void main(String[] args) {
        Printable[] printables = new Printable[]{new Book(), new Book(), new Magazine()};
        for (Printable printable : printables) {
            printable.print();
        }
        Book.printBooks(printables);
    }
}

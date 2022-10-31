package ru.mirea.task6.taskStep4;

public class TestPrice {
    public static void main(String[] args) {
        Book cat = new Book(500);
        Book dog = new Book(700);
        Chair porsche = new Chair(3000);
        Chair volkswagen = new Chair(4000);
        Pizza earth = new Pizza(100);
        Pizza mars = new Pizza(75);
        System.out.println(cat.getPrice());
        System.out.println(dog.getPrice());
        System.out.println(volkswagen.getPrice());
        System.out.println(porsche.getPrice());
        System.out.println(earth.getPrice());
        System.out.print(mars.getPrice());
    }
}

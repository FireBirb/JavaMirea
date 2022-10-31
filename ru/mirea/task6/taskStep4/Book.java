package ru.mirea.task6.taskStep4;

public class Book implements Priceable {
    private int price;

    public String getPrice() {return "Book's price: " + this.price;}
    Book (int price) {this.price = price;}
}

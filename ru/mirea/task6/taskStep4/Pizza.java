package ru.mirea.task6.taskStep4;

public class Pizza implements Priceable {
    private int price;

    public String getPrice() {return "Pizza's price: " + this.price;}
    Pizza (int price) {this.price = price;}
}

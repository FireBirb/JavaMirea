package ru.mirea.task6.taskStep4;

public class Chair implements Priceable {
    private int price;

    public String getPrice() {return "Chair's price: " + this.price;}
    Chair (int price) {this.price = price;}
}

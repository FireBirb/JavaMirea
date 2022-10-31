package ru.mirea.task2.taskStep5;

import java.util.Scanner;

public class Computer {
    private String color, manufacturer, price;
    public Computer () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price (in $), color of the corpus and manufacturer's name, separating them with enter:");
        do{price = scanner.nextLine();}while(price.equals(""));
        do{color = scanner.nextLine();}while(color.equals(""));
        do{manufacturer = scanner.nextLine();}while(manufacturer.equals(""));
    }

    public String getColor() {
        return color;
    }

    public String getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public String toString() {
        return "Color: " + color + " Price: " + price + "$ Manufacturer: " + manufacturer;
    }
}

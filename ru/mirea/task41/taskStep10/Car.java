package ru.mirea.task41.taskStep10;

public class Car extends Vehicle {
    Car(double speed, double human_capacity, double  cargo_capacity, double price_per_kilo) {
        this.speed = speed;
        this.cargo_capacity = cargo_capacity;
        this.human_capacity = human_capacity;
        this.price_per_kilo = price_per_kilo;
    }
}

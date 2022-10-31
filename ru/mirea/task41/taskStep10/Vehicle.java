package ru.mirea.task41.taskStep10;

public abstract class Vehicle {
    double speed, human_capacity, cargo_capacity, price_per_kilo;
    public double Time(double distance) {return distance/speed;}
    public double Cost(double distance) {return price_per_kilo*Time(distance)*(human_capacity+cargo_capacity);}
}

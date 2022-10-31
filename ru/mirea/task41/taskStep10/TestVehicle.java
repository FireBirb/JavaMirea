package ru.mirea.task41.taskStep10;

public class TestVehicle {
    public static void main(String[] args) {
        Car car = new Car(60, 400, 100, 1);
        Ship ship = new Ship(100, 4000, 1000, 8);
        Train train = new Train(150, 2000, 500, 5);
        Plane plane = new Plane(300, 8000, 3000, 15);
        System.out.println("Time by car: " + car.Time(1000));
        System.out.println("Cost for car: " + car.Cost(1000));
        System.out.println("Time by ship: " + ship.Time(1000));
        System.out.println("Cost for ship: " + ship.Cost(1000));
        System.out.println("Time by train: " + train.Time(1000));
        System.out.println("Cost for train: " + train.Cost(1000));
        System.out.println("Time by plane: " + plane.Time(1000));
        System.out.println("Cost for plane: " + plane.Cost(1000));
    }
}

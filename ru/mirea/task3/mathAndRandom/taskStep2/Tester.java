package ru.mirea.task3.mathAndRandom.taskStep2;

import java.util.Arrays;

public class Tester {
    private int amount;
    private Circle[] circles;
    Tester() {amount = 0; circles = new Circle[1];}
    public void add(int x, int y) {
        Circle circle = new Circle(x, y);
        if (amount == 0) {
            circles[0] = circle;
        } else {
            circles = Arrays.copyOf(circles, circles.length + 1);
            circles[circles.length - 1] = circle;
        }
        amount += 1;
    }
    public void max() {
        if (amount == 0) {
            System.out.println("There are no circles");
            return;
        }
        int m = -1;
        Circle max_circle = new Circle();
        for (Circle circle : circles) {
            if (m<circle.getRadius()) {
                m = circle.getRadius();
                max_circle = circle;
            }
        }
        System.out.print("The biggest circle is ");
        System.out.println(max_circle);
    }
    public void min() {
        if (amount == 0) {
            System.out.println("There are no circles");
            return;
        }
        int m = 1001;
        Circle min_circle = new Circle();
        for (Circle circle : circles) {
            if (m>circle.getRadius()) {
                m = circle.getRadius();
                min_circle = circle;
            }
        }
        System.out.print("The smallest circle is ");
        System.out.println(min_circle);
    }

    public static void main(String[] args) {
        Tester test = new Tester();
        test.add(1,2);
        test.add(0,0);
        test.add(5,5);
        test.max();
        test.min();
        test.add(-1, -1);
        test.add(10, 8);
        test.max();
        test.min();
    }
}


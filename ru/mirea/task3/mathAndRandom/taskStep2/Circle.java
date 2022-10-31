package ru.mirea.task3.mathAndRandom.taskStep2;

import java.lang.Math;
import ru.mirea.task3.mathAndRandom.taskStep2.Point;

public class Circle {
    private Point center;
    private int radius;
    private double len;
    public Circle(int x, int y) {
        center = new Point();
        setCenter(x, y);
        radius = (int)(Math.random()*1000);
        len = radius*2*Math.PI;
    }
    public Circle() {center = new Point(); radius = 0; len = 0;}

    public int getRadius() {
        return radius;
    }

    public void setCenter(int x, int y) {
        center.setX(x);
        center.setY(y);
    }

    public String toString() {
        return "is at (" + center.getX() + ", " + center.getY() + "), radius = " + radius + ", length = " + len;
    }
}

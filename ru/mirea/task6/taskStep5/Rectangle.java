package ru.mirea.task6.taskStep5;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle() {}
    public Rectangle(double width, double length){this.width=width; this.length = length;}
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width*length;
    }
    public double getPerimeter() {
        return 2*(length+width);
    }
    public String toString() {
        return super.toString() + "\nLength: " + length + "\nWidth: " + width;
    }
}

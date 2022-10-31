package ru.mirea.task6.taskStep5;

abstract public class Shape {
    protected String color;
    protected boolean filled;
    public Shape() {}
    public Shape(String color, boolean filled) {this.color = color; this.filled = filled;}

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString() {
        return "Filled: " + isFilled() + "\nColor: " + getColor();
    }
}

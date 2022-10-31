package ru.mirea.task2.taskStep2;

public class Ball {
    private double x = 0, y = 0;
    public Ball() {}
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move (double xDisp, double yDisp) {
        y += yDisp;
        x += xDisp;
    }
    public String toString() {
        return "The ball's coordinates is (" + x + ", " + y + ")";
    }
}

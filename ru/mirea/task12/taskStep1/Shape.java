package ru.mirea.task12.taskStep1;

import java.awt.*;

abstract public class Shape {
    protected Color color;
    protected int[] pos;
    public Shape() {}
    public Shape(Color color, int[] pos) {this.color = color; this.pos = pos;}

    public void setColor(Color color) {
        this.color = color;
    }

    public void setpos(int[] pos) {
        this.pos = pos;
    }

    public Color getColor() {
        return color;
    }

    public int[] getpos() {
        return pos;
    }
    @Override
    public String toString() {
        return "pos: " + getpos() + "\nColor: " + getColor();
    }
}
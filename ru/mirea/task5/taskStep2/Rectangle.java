package ru.mirea.task5.taskStep2;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape{
    protected double length, width;
    public Rectangle() {length = 2; width = 1; color = color.RED; pos = new int[] {0,0};}
    public Rectangle(double length, double width, Color color, int[] pos){
        this.length=length;
        this.width=width;
        this.color = color;
        this.pos = pos;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double rectangle = new Rectangle2D.Double(pos[0], pos[1], length, width);

        g2d.setColor(getColor());
        g2d.fill(rectangle);
    }
}
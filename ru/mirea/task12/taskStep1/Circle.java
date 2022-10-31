package ru.mirea.task12.taskStep1;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape {
    protected double radius;
    public Circle() {radius = 5; color = color.RED; pos = new int[] {0,0};}
    public Circle(double radius){this.radius=radius;}
    public Circle(double radius, Color color, int[] pos){
        this.radius=radius;
        this.color = color;
        this.pos = pos;
    }
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(pos[0], pos[1], radius*2, radius*2);

        g2d.setColor(getColor());
        g2d.fill(circle);
    }
}

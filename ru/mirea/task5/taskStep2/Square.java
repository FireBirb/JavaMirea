package ru.mirea.task5.taskStep2;

import ru.mirea.task5.taskStep2.Rectangle;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Square extends Rectangle {
    Square(double side)
    {
        setWidth(side);
        setLength(side);
    }

    Square(double side, Color color, int[] pos)
    {
        this.color = color;
        setWidth(side);
        setLength(side);
        this.pos = pos;
    }
    public double getSide() {
        return getLength();
    }
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double square = new Rectangle2D.Double(pos[0], pos[1], getSide(), getSide());

        g2d.setColor(getColor());
        g2d.fill(square);
    }
}
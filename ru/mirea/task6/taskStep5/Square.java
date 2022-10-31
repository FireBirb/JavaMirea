package ru.mirea.task6.taskStep5;

public class Square extends Rectangle{
    Square(){}

    Square(double side)
    {
        //this.side = side;
        setWidth(side);
        setLength(side);
    }

    Square(double side, String color, boolean filled)
    {
        //this.side = side;
        this.color = color;
        this.filled = filled;
        setWidth(side);
        setLength(side);
    }

    public double getSide()
    {
        return getLength();
    }

    public void setSide(double side)
    {
        //this.side = side;
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side)
    {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side)
    {
        super.setLength(side);
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}

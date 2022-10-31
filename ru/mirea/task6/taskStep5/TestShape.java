package ru.mirea.task6.taskStep5;

public class TestShape {
    public static void main(String[] args) {
        Circle c1 = new Circle(5, "Red", false);
        Rectangle r1 = new Rectangle(5, 6, "Green", true);
        Square s1 = new Square(3, "Blue", true);
        System.out.println(c1);
        System.out.println(r1);
        System.out.println(s1);
        s1.setSide(4);
        System.out.println(s1.getArea());
        c1.setColor("Purple");
        System.out.println(c1.getColor() + ", " + c1.getArea());
    }
}

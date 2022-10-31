package ru.mirea.task7.taskStep3;

public class TestMove {
    public static void main(String[] args) {
        MovablePoint mp1 = new MovablePoint(15, -5,2,2);
        MovableRectangle mr1 = new MovableRectangle(0, 0, 10, 15);
        System.out.println(mp1);
        mp1.moveUp();
        mp1.moveLeft();
        System.out.println(mp1);

        System.out.println(mr1);
        mr1.moveLeft();
        mr1.moveDown();
        mr1.moveDown();
        System.out.println(mr1);
    }
}

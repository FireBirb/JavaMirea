package ru.mirea.task2.taskStep2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball (3,4);
        System.out.println(ball);
        ball.setXY(0,1);
        System.out.println(ball);
        ball.move(3, -1);
        System.out.println(ball);
    }
}

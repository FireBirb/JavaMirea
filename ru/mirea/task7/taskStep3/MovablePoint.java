package ru.mirea.task7.taskStep3;

public class MovablePoint implements Movable {
    public int x, y, xSpeed, ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
        this.xSpeed = 1;
        this.ySpeed = 1;
    }
    public String ItoS(int i) {
        return String.valueOf(i);
    }
    @Override
    public void moveDown() {
        y -= ySpeed;
    }
    @Override
    public void moveUp() {
        y += ySpeed;
    }
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }
    @Override
    public void moveRight() {
        x += xSpeed;
    }
    @Override
    public String toString() {
        return "x: " + x + "\ny: " + y + "\nX speed: " + xSpeed + "\nY speed: " + ySpeed;
    }
}

package ru.mirea.task6.taskStep10;

import java.util.Scanner;

public class Monitor {
    double diagonal; //in inches
    int len, width, frequency;
    String res;

    public void Fill(){
        System.out.println("Enter monitor's diagonal (in inches), its length, width and frequency (in Hz), separating them with enter:");
        Scanner scanner = new Scanner(System.in);
        diagonal = scanner.nextDouble();
        scanner.nextLine();
        len = scanner.nextInt();
        scanner.nextLine();
        width = scanner.nextInt();
        scanner.nextLine();
        this.res = len + "x" + width;
        frequency = scanner.nextInt();
        scanner.nextLine();
    }
    Monitor(){}

    Monitor(double diagonal, int len, int width, int frequency) {
        this.diagonal = diagonal;
        this.len = len;
        this.width = width;
        this.res = len + "x" + width;
        this.frequency = frequency;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getRes() {
        return res;
    }

    public int getFrequency() {
        return frequency;
    }
}

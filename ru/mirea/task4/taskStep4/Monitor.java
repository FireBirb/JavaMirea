package ru.mirea.task4.taskStep4;

public class Monitor {
    double diagonal; //in inches
    int len, width, frequency;
    String res;

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

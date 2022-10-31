package ru.mirea.task7.taskStep4;

public class MathFunc implements MathCalculable{
    @Override
    public double Pow(double num, double p) {
        double res = 1;
        for (int i = 0; i<p; i++) {
            res *= num;
        }
        return res;
    }

    @Override
    public double Modulus(double real, double image) {
        return Math.sqrt(Pow(real, 2) + Pow(image,2));
    }
    public double CircLength(double radius) {
        return 2*radius*PI;
    }
    public double CircArea(double radius) {
        return PI*Pow(radius,2);
    }
}

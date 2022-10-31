package ru.mirea.task7.taskStep4;

public class TestMath {
    public static void main(String[] args) {
        MathFunc math = new MathFunc();
        double area = math.CircArea(4);
        double len = math.CircLength(4);
        double twointen = math.Pow(2, 10);
        double mod = math.Modulus(3, 4);
        System.out.println(area);
        System.out.println(len);
        System.out.println(twointen);
        System.out.println(mod);
    }
}

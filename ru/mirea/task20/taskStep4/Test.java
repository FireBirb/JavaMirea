package ru.mirea.task20.taskStep4;

public class Test {
    public static void main(String[] args) {
        Double[] arr = new Double[]{(double) 1, (double)3, (double)2};
        MinMax<Double> dMinMax = new MinMax<>(arr);
        System.out.println(dMinMax.min());
        System.out.println(dMinMax.max());
        String[] ss = new String[]{"one", "two", "three"};
        MinMax<String> sMinMax = new MinMax<>(ss);
        System.out.println(sMinMax.min());
        System.out.println(sMinMax.max());
        System.out.println(Calculator.sum(1, 0.5));
        System.out.println(Calculator.divide(1, 0.5));
        System.out.println(Calculator.multiply(1, 0.5));
        System.out.println(Calculator.subtraction(1, 0.5));
    }
}

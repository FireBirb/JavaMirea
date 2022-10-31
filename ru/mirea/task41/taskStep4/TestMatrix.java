package ru.mirea.task41.taskStep4;

public class TestMatrix {
    public static void main(String[] args) {
        double[][] m = {{1,2,3},{1,1,3}, {1,1,1}};
        Matrix m1 = new Matrix(3, 3, m);
        double[][] m2 = {{3, 1, 2}, {1, 1, 1}, {2, 4, 5}};
        double[][] m3 = {{3,4,3}, {3,4,3}, {3,4,3}};

        m1.Mult(2);
        System.out.println(m1);
        m1.Mult(m2);
        System.out.println(m1);
        m1.Plus(m3);
        System.out.println(m1);
    }
}

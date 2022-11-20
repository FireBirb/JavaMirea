package ru.mirea.task20.taskStep4;

public final class Calculator {
    //private Calculator() {}
    public static <N extends Number> double sum(N x1, N x2)
    {
        return x1.doubleValue() + x2.doubleValue();
    }
    public static <N extends Number> double multiply(N x1, N x2)
    {
        return x1.doubleValue() * x2.doubleValue();
    }
    public static <N extends Number> double divide(N x1, N x2)
    {
        return x1.doubleValue() / x2.doubleValue();
    }
    public static <N extends Number> double subtract(N x1, N x2)
    {
        return x1.doubleValue() - x2.doubleValue();
    }
}

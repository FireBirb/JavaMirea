package ru.mirea.task20.taskStep4;

public class MinMax <T extends Comparable<T>> {
    T[] arr;
    MinMax(T[] arr) {
        this.arr = arr;
    }
    public T min() {
        T m = arr[0];
        for (T t : arr) {
            if (t.compareTo(m) > 0) m = t;
        }
        return m;
    }
    public T max () {
        T m = arr[0];
        for (T t : arr) {
            if (t.compareTo(m) < 0) m = t;
        }
        return m;
    }
}

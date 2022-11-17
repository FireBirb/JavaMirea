package ru.mirea.task20.taskStep1to3;

import java.io.Serializable;

public class Generics <T extends Comparable, V extends Serializable, K>{
    T t;
    V v;
    K k;
    Generics (T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public K getK() {
        return k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }
    public void print () {
        System.out.println("T: " + t.getClass() + "\nV: " + v.getClass() + "\nK: " + k.getClass());
    }

    public static void main(String[] args) {
        new Generics<String, String, String>("one", "two", "three").print();
        new Generics<Double, Integer, String>(0.5, 2, "three").print();
    }
}

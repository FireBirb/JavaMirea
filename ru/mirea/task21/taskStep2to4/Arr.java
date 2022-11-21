package ru.mirea.task21.taskStep2to4;

public class Arr <T>{
    private T[] arr;
    Arr (T[] arr) {
        this.arr = arr;
    }
    public T get(int i) {
        try {
            return arr[i];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
            return null;
        }
    }
    public void getFive() {
        int i = 0;
        for (T t : arr) {
            if (i<5) System.out.println(t);
            else break;
            i++;
        }
    }

    public static void main(String[] args) {
        Arr<Integer> i1 = new Arr<>(new Integer[]{1, 2, 3, 5, 10, 8, 100});
        Arr<Integer> i2 = new Arr<>(new Integer[]{1, 2, 3});
        Arr<String> s = new Arr<>(new String[]{"one", "two", "three", "lol", "idk", "words"});
        System.out.println(i1.get(5));
        System.out.println(i1.get(20));
        System.out.println(i2.get(1));
        System.out.println(s.get(4));
        i1.getFive();
        i2.getFive();
        s.getFive();
    }
}

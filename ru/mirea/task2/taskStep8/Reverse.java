package ru.mirea.task2.taskStep8;

public class Reverse {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3"};
        int n = arr.length;
        String temp;
        for (int i = 0; i < n/2; i++) {
            temp = arr[n-i-1];
            arr[n-i-1] = arr[i];
            arr[i] = temp;
        }
        for (String s : arr) System.out.print(s + " ");
    }
}

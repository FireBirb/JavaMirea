package ru.mirea.task1;

import java.util.Scanner;

public class ArrAv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i=0; i<n; i++) {
            System.out.println("Enter next number in array");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum: " + sum + "\nAverage: " + (double)sum/(double)n);

    }
}

package ru.mirea.task1;

import java.util.Scanner;

public class ArrMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int i = 0;
        int sum = 0, max = 0, min = 0;
        while (i<n) {
            System.out.println("Enter next number in array");
            arr[i] = scanner.nextInt();
            min = (i==0) ? arr[i] : Math.min(min, arr[i]);
            max = (i==0) ? arr[i] : Math.max(max, arr[i]);
            sum += arr[i];
            i++;
        } //а куда do while ставить я не уверена, оно и так работает
        System.out.println("Sum: " + sum + "\nMin: " + min + "\nMax: " + max);

    }
}

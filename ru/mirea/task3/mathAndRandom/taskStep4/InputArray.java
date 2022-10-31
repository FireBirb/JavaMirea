package ru.mirea.task3.mathAndRandom.taskStep4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class InputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter length of the array");
        int n = scanner.nextInt();
        while (n<=0) {
            System.out.println("Incorrect length. Try again.");
            n = scanner.nextInt();
        }
        int[] arr = new int[n], arr_even = new int[1];
        arr_even[0] = -1;
        //ArrayList<Integer> arr_even = new ArrayList<>();
        for (int i = 0; i<n; i++) {
            arr[i] = random.nextInt(0, n);
            System.out.print(arr[i] + " ");
            //if (arr[i]%2==0) arr_even.add(arr[i]);
            if (arr[i]%2==0) {
                arr_even = Arrays.copyOf(arr_even, arr_even.length + 1);
                arr_even[arr_even.length - 1] = arr[i];
            }
        }
        System.out.println((arr_even.length==1) ? "\nNo even numbers" : "\nThe even numbers in this array are:");
        //for (int num : arr_even) System.out.print(num + " ");
        for (int i = 1; i<arr_even.length; i++) System.out.print(arr_even[i] + " ");
    }
}

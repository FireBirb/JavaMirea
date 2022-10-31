package ru.mirea.task3.mathAndRandom.taskStep3;

import java.util.Random;

public class ShortArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[4];
        boolean going_up = true;
        for (int i = 0; i<4; i++) {
            arr[i] = random.nextInt(10, 99);
            System.out.print(arr[i] + " ");
            if (i>0) {
                if (arr[i]<=arr[i-1]) going_up = false;
            }
        }
        System.out.println(going_up ? "\nArray is strictly increasing" : "\nArray is not strictly increasing");
    }
}

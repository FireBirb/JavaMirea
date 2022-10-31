package ru.mirea.task3.mathAndRandom.taskStep1;

import java.util.Random;
import java.lang.Math;
import java.util.Arrays;

public class RandomArr {
    public static void main(String[] args) {
        double[] mArr = new double[30], rArr = new double[30];
        Random random = new Random();
        for (int i = 0; i<30; i++) {
            mArr[i] = Math.random();
            rArr[i] = random.nextDouble();
        }
        System.out.println("Original Math.random array:");
        for (double num : mArr) {
            System.out.print(num + " ");
        }
        System.out.println("\nOriginal Random array:");
        for (double num : rArr) {
            System.out.print(num + " ");
        }

        Arrays.sort(mArr);
        Arrays.sort(rArr);

        System.out.println("\nSorted Math.random array:");
        for (double num : mArr) {
            System.out.print(num + " ");
        }
        System.out.println("\nSorted Random array:");
        for (double num : rArr) {
            System.out.print(num + " ");
        }
    }
}

package ru.mirea.task18.taskStep4;

import java.util.Scanner;

public class Exception4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = 1;
        try {
            i = Integer.parseInt(intString);
            try {
                System.out.println( 2/i );
            } catch (ArithmeticException e) {
                System.out.println("Attempted division by zero");
            }
        } catch (NumberFormatException e) {
            System.out.println("Not an integer");
        } finally {
            System.out.println("All done!");
        }

    }
}

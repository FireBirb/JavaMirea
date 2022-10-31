package ru.mirea.task2.taskStep10;

import java.util.Arrays;

public class HowMany {
    public static void main(String[] args) {
        String nargs = Arrays.toString(args);
        String[] res = nargs.split("\\s+");
        System.out.println(res.length);
    }
}

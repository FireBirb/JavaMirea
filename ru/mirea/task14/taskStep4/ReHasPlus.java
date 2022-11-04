package ru.mirea.task14.taskStep4;

import java.util.regex.Pattern;

public class ReHasPlus {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d ?\\+");
        System.out.println(p.matcher("(1 + 8) – 9 / 4").find());
        System.out.println(p.matcher("6 / 5 – 2 * 9").find());
    }
}

package ru.mirea.task14.taskStep1;

import java.util.regex.Pattern;

public class ReSplit {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[ ]");
        String s = "Hello world, I'm (not) alive!";
        String[] ss = p.split(s);
        for (String o : ss) {
            System.out.println(o);
        }
    }
}

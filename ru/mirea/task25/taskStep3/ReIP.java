package ru.mirea.task25.taskStep3;

import java.util.regex.Pattern;

public class ReIP {
    public static void main(String[] args) {
        String regex = "((?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?))";
        String[] strings = new String[] {"127.0.0.1", "255.255.255.0", "1300.6.7.8", "abc.def.gha.bcd"};
        for (String s : strings) {
            System.out.println(Pattern.compile(regex).matcher(s).matches());
        }
    }
}

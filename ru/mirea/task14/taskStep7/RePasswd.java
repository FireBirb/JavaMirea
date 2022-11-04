package ru.mirea.task14.taskStep7;

import java.util.regex.Pattern;

public class RePasswd {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])).{8,}");
        String[] ss = new String[] {"F032_Password", "TrySpy1.", "smart_pass", "A007"};
        for (String s : ss) {
            System.out.println(p.matcher(s).matches());
        }
    }
}

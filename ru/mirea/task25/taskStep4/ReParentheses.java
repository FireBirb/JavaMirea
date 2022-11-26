package ru.mirea.task25.taskStep4;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReParentheses {
    public static void main(String[] args) {
        String regex = "\\([^()]*\\)";
        String[] ss = new String[]{"(3*+*5)*–*9*×*4", "((3*+*5)*–*9*×*4", "()", ")(", "())()("};
        for (String s : ss) {
            Matcher matcher = Pattern.compile(regex).matcher(s);
            String temp = s;
            while (matcher.find()) {
                temp = temp.replaceAll(regex, "");
            }
            if (!(temp.contains("(")||temp.contains(")"))) System.out.println(s);
        }
    }
}

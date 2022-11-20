package ru.mirea.task22.taskStep1to3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public static String count(String s) {
        Pattern p = Pattern.compile("((\\d+\\.*\\d* ){2,}([+\\-*/] *)+)+");
        Matcher m = p.matcher(s.replace("\n", ""));
        Stack stack = new Stack(s.length());
        if (m.matches()) {
            ArrayList<String> nums = new ArrayList<String>(List.of(s.split("[^0-9.]")));
            nums.removeAll(List.of("", "\n", " "));
            ArrayList<String> ops = new ArrayList<String>(List.of(s.split("[^+\\-*/]")));
            ops.removeAll(List.of("", "\n", " "));
            String[] parts;
            if (nums.size() == ops.size() + 1) {
                parts = s.split("[^0-9.+\\-/*]");
                for (String part : parts) {
                    if (!(part.equals("+") || part.equals("-") || part.equals("*") || part.equals("/"))) {
                        stack.push(Double.parseDouble(part));
                    } else {
                        double a = stack.pop();
                        double b = stack.pop();
                        switch (part) {
                            case "+" -> stack.push(b + a);
                            case "-" -> stack.push(b - a);
                            case "*" -> stack.push(b * a);
                            case "/" -> stack.push(b / a);
                        }
                    }
                }
                return stack.pop().toString();
            }
        }
        return "Error";
    }
}

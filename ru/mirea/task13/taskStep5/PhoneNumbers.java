package ru.mirea.task13.taskStep5;

import java.util.Arrays;

public class PhoneNumbers {
    private String code, firstthree, secondthree, lastfour, number;
    public void Normalize(String s) {
        if (s.charAt(0) == '8' && s.length() == 11) {
            code = "7";
            firstthree = s.substring(1,4);
            secondthree = s.substring(4,7);
            lastfour = s.substring(7,11);
            number = "+%s%s-%s-%s".formatted(code, firstthree, secondthree, lastfour);
        }
        else if (s.charAt(0) == '+' && s.length() >= 12){
            StringBuilder sb = new StringBuilder(s);
            int n = sb.length();
            lastfour = sb.substring(n-4, n-1);
            sb.delete(n-4, n-1);
            n = sb.length();
            secondthree = sb.substring(n-3, n-1);
            sb.delete(n-4, n-1);
            n = sb.length();
            firstthree = sb.substring(n-3, n-1);
            sb.delete(n-4, n-1);
            code = sb.substring(1);
            number = "+%s%s-%s-%s".formatted(code, firstthree, secondthree, lastfour);
        }
        else {
            System.out.println("Wrong number format");
        }
    }
    public String toString() {
        return number;
    }
}

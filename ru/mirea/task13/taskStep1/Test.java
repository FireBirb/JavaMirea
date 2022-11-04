package ru.mirea.task13.taskStep1;

public class Test {
    public static void main(String[] args) {
        //№1
        String s1 = "I love Java!!!", s2 = "Another string !!!";
        //№2
        System.out.println(s1.charAt(s1.length()-1) + " " + s2.charAt(s2.length()-1));
        //№3
        System.out.println((s1.endsWith("!!!")) ? "Строка 1 оканчивается на !!!" : "Строка 1 не оканчивается на !!!");
        System.out.println((s2.endsWith("!!!")) ? "Строка 2 оканчивается на !!!" : "Строка 2 не оканчивается на !!!");
        //№4
        System.out.println((s1.startsWith("I love")) ? "Строка 1 начинается на I love" : "Строка 1 не начинается на I love");
        System.out.println((s2.startsWith("I love")) ? "Строка 2 начинается на I love" : "Строка 2 не начинается на I love");
        //№5
        System.out.println((s1.contains("Java")) ? "Строка 1 содержит подстроку Java" : "Строка 1 не содержит подстроку Java");
        System.out.println((s2.contains("Java")) ? "Строка 2 содержит подстроку Java" : "Строка 2 не содержит подстроку Java");
        //№6
        System.out.println((s1.indexOf("Java") < 0) ? "Строка 1 не содержит подстроку Java" : s1.indexOf("Java"));
        System.out.println((s2.indexOf("Java") < 0) ? "Строка 2 не содержит подстроку Java" : s2.indexOf("Java"));
        //№7
        System.out.println(s1.replace("a", "o"));
        System.out.println(s2.replace("a", "o"));
        //№8
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toUpperCase());
        //№9
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toLowerCase());
        //№10
        System.out.println(s1.substring(s1.indexOf("Java"), s1.indexOf("Java")+4));
        try {
            System.out.println(s2.substring(s2.indexOf("Java"), s2.indexOf("Java")+4));
        } catch (StringIndexOutOfBoundsException e) {System.out.println(e);}
    }
}

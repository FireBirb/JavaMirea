package ru.mirea.task27.taskStep1;

import java.util.HashSet;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args)
    {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        System.out.println(hashSet);

        TreeSet<String> treeSet = new TreeSet<String>(hashSet);
        System.out.println(treeSet);
    }
}

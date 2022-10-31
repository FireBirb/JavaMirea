package ru.mirea.task11.taskStep5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        long time;
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> link = new LinkedList<>();
        long timeArr, timeLink;

        time = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            arr.add(i);
        }
        timeArr = System.currentTimeMillis() - time;
        time = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            link.add(i);
        }
        timeLink = System.currentTimeMillis() - time;
        System.out.println("================Add================");
        System.out.println("---Add elements (5kk)");
        System.out.println("ArrayList:" + timeArr + "ms");
        System.out.println("LinkedList:" + timeLink + "ms");
        System.out.println();
        //-----------------------------------------------------------------------------
        time = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            arr.add(0, i);
        }
        timeArr = System.currentTimeMillis() - time;
        time = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            link.add(0, i);
        }
        timeLink = System.currentTimeMillis() - time;
        System.out.println("==============Insert==============");
        System.out.println("---Insert elements to the beginning (5k)");
        System.out.println("ArrayList:" + timeArr + "ms");
        System.out.println("LinkedList:" + timeLink + "ms");
        System.out.println();

        time = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            arr.add(2500000, i);
        }
        timeArr = System.currentTimeMillis() - time;
        time = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            link.add(2500000, i);
        }
        timeLink = System.currentTimeMillis() - time;
        System.out.println("---Insert elements to the middle (2k)");
        System.out.println("ArrayList:" + timeArr + "ms");
        System.out.println("LinkedList:" + timeLink + "ms");
        System.out.println();


        //-----------------------------------------------------------------------------
        time = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            arr.get(0);
        }
        timeArr = System.currentTimeMillis() - time;
        time = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            link.get(0);
        }
        timeLink = System.currentTimeMillis() - time;
        System.out.println("==============Get==============");
        System.out.println("---Get elements from the beginning (5kk)");
        System.out.println("ArrayList:" + timeArr + "ms");
        System.out.println("LinkedList:" + timeLink + "ms");
        System.out.println();

        time = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arr.get(2500000);
        }
        timeArr = System.currentTimeMillis() - time;
        time = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            link.get(2500000);
        }
        timeLink = System.currentTimeMillis() - time;
        System.out.println("---Get elements from the middle (1k)");
        System.out.println("ArrayList:" + timeArr + "ms");
        System.out.println("LinkedList:" + timeLink + "ms");
        System.out.println();

        int n = arr.size() - 1;
        time = System.currentTimeMillis();
        for (int i = 0; i < 3000000; i++) {
            arr.get(n);
        }
        timeArr = System.currentTimeMillis() - time;
        n = link.size() - 1;
        time = System.currentTimeMillis();
        for (int i = 0; i < 3000000; i++) {
            link.get(n);
        }
        timeLink = System.currentTimeMillis() - time;
        System.out.println("---Get elements from the end (3kk)");
        System.out.println("ArrayList:" + timeArr + "ms");
        System.out.println("LinkedList:" + timeLink + "ms");
        System.out.println();

        //-----------------------------------------------------------------------------


        time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arr.remove(0);
        }
        timeArr = System.currentTimeMillis() - time;
        time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            link.remove(0);
        }
        timeLink = System.currentTimeMillis() - time;
        System.out.println("==============Remove==============");
        System.out.println("---Remove elements from the beginning (10k)");
        System.out.println("ArrayList:" + timeArr + "ms");
        System.out.println("LinkedList:" + timeLink + "ms");
        System.out.println();


        time = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arr.remove(2500000);
        }
        timeArr = System.currentTimeMillis() - time;
        time = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            link.remove(2500000);
        }
        timeLink = System.currentTimeMillis() - time;
        System.out.println("---Remove elements from the middle (1k)");
        System.out.println("ArrayList:" + timeArr + "ms");
        System.out.println("LinkedList:" + timeLink + "ms");
        System.out.println();

        n = arr.size() - 1;
        time = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            arr.remove(n - i);
        }
        timeArr = System.currentTimeMillis() - time;
        n = link.size() - 1;
        time = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            link.remove(n - i);
        }
        timeLink = System.currentTimeMillis() - time;
        System.out.println("---Remove elements from the end (2kk)");
        System.out.println("ArrayList:" + timeArr + "ms");
        System.out.println("LinkedList:" + timeLink + "ms");
        System.out.println();
    }
}

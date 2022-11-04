package ru.mirea.task13.taskStep2;

import java.util.Optional;

public class TestPerson {
    public static void main(String[] args) {
        /*double time = System.currentTimeMillis();
        for (int i = 0; i<10000000; i++) {
            Person person1 = new Person("Name1", "Th1", "Lname1");
            Person person2 = new Person("Name2");
            person1.getName();
            person2.getName();
        }
        double fin = System.currentTimeMillis() - time;
        System.out.println(fin + " ms");*/ //about 1314 ms for 10kk

        Person person1 = new Person("Geralt", "of Rivia"); //trust me that's and o in the run window
        Person person2 = new Person("Jon", "Targaryen", "There aren't really thirdnames in eng so...");
        Person person3 = new Person("Bob");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person3.getName());
    }
}

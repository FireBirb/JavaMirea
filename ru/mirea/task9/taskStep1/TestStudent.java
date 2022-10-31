package ru.mirea.task9.taskStep1;

import java.util.Random;

public class TestStudent {
        public static void main(String[] args) {
            Random random = new Random();
            Student[] students = new Student[10];
            students[0]=new Student("John","Dow",17,random.nextInt(1000000,9999999));
            students[1]=new Student("Gina","Down",17,random.nextInt(1000000,9999999));
            students[2]=new Student("Alex","Up",17,random.nextInt(1000000,9999999));
            students[3]=new Student("Mahs","Right",17,random.nextInt(1000000,9999999));
            students[4]=new Student("Lake","Left",17,random.nextInt(1000000,9999999));
            students[5]=new Student("Troy","North",17,random.nextInt(1000000,9999999));
            students[6]=new Student("Sam","South",17,random.nextInt(1000000,9999999));
            students[7]=new Student("Dann","West",17,random.nextInt(1000000,9999999));
            students[8]=new Student("Alex","East",17,random.nextInt(1000000,9999999));
            students[9]=new Student("John","Yankee",17,random.nextInt(1000000,9999999));
            for (int i = 0; i<10; i++) {
                System.out.println(students[i]);
            }
            System.out.println();
            int n = 10;
            for (int j = 1; j < n; j++) {
                Student key = students[j];
                int i = j - 1;
                while ((i > -1) && (students[i].getID() > key.getID())) {
                    students[i+1] = students[i];
                    i--;
                }
                students[i+1] = key;
            }
            for (int i = 0; i<10; i++) {
                System.out.println(students[i]);
            }
    }
}

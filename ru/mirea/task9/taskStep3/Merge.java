package ru.mirea.task9.taskStep3;

import java.util.Random;

public class Merge {

    public Student[] sortArray(Student[] arrayA){
        if (arrayA == null) {
            return null;
        }
        if (arrayA.length < 2) {
            return arrayA;
        }
        Student[] arrayB = new Student[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);
        Student[] arrayC = new Student[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);
        arrayB = sortArray(arrayB);
        arrayC = sortArray(arrayC);

        return mergeArray(arrayB, arrayC);
    }
    public Student[] mergeArray(Student[] arrayA, Student[] arrayB) {

        Student[] arrayC = new Student[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length) {
                arrayC[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else if (arrayA[positionA].getID() < arrayB[positionB].getID()) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else {
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
        }
        return arrayC;
    }

    public static void main(String[] args) {
        Merge merge = new Merge();
        Random random = new Random();
        Student[] students1 = new Student[5];
        students1[0]=new Student("John","Dow",17,random.nextInt(1000000,9999999));
        students1[1]=new Student("Gina","Down",17,random.nextInt(1000000,9999999));
        students1[2]=new Student("Alex","Up",17,random.nextInt(1000000,9999999));
        students1[3]=new Student("Mahs","Right",17,random.nextInt(1000000,9999999));
        students1[4]=new Student("Lake","Left",17,random.nextInt(1000000,9999999));
        Student[] students2 = new Student[5];
        students2[0]=new Student("Troy","North",17,random.nextInt(1000000,9999999));
        students2[1]=new Student("Sam","South",17,random.nextInt(1000000,9999999));
        students2[2]=new Student("Dann","West",17,random.nextInt(1000000,9999999));
        students2[3]=new Student("Alex","East",17,random.nextInt(1000000,9999999));
        students2[4]=new Student("John","Yankee",17,random.nextInt(1000000,9999999));
        System.out.println("First array: ");
        for (int i = 0; i<5; i++) {
            System.out.println(students1[i]);
        }
        System.out.println("Second array: ");
        for (int i = 0; i<5; i++) {
            System.out.println(students2[i]);
        }
        System.out.println();
        Student[] students = merge.mergeArray(students1, students2);
        Student[] sortedArray = merge.sortArray(students);
        System.out.println("Sorted and merged arrays: ");
        for (Student student : sortedArray) {
            System.out.println(student);
        }
    }
}

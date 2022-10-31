package ru.mirea.task9.taskStep2;

public class SortingStudentsByGPA {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0]=new Student("John","Dow",17,1.7);
        students[1]=new Student("Gina","Down",17,0.5);
        students[2]=new Student("Alex","Up",17,1.0);
        students[3]=new Student("Mahs","Right",17,1.9);
        students[4]=new Student("Lake","Left",17,1.1);
        students[5]=new Student("Troy","North",17,0.1);
        students[6]=new Student("Sam","South",17,2);
        students[7]=new Student("Dann","West",17,1.3);
        students[8]=new Student("Alex","East",17,1.4);
        students[9]=new Student("John","Yankee",17,1.85);

        StudentQuickSort(students,0,9);

        for (Student st: students) {
            System.out.println(st);
        }
    }
    static StudentComparator co = new StudentComparator();
    public static void StudentQuickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student opora = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (co.compare(array[i],opora) < 0) {
                i++;
            }
            while (co.compare(array[j],opora) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            StudentQuickSort(array, low, j);

        if (high > i)
            StudentQuickSort(array, i, high);
    }
}




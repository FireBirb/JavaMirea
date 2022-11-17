package ru.mirea.task10.taskStep2;

import ru.mirea.task10.taskStep1.Student;

public class QuickSort {
    public static void SortStudent(Student[] array, int low, int high) {
        StudentComparator co = new StudentComparator();
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
            SortStudent(array, low, j);

        if (high > i)
            SortStudent(array, i, high);
    }
}

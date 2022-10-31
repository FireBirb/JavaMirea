package ru.mirea.task10.taskStep2;

import ru.mirea.task10.student.Student;
import ru.mirea.task10.taskStep2.QuickSort;

import java.util.Scanner;

public class SortingStudentsByGPA {
    private Student[] students = new Student[10];
    SortingStudentsByGPA() {
        students[0]=new Student("John","Dow","Med","M2", 1, 1.7);
        students[1]=new Student("Gina","Down","Med", "M1", 1, 0.5);
        students[2]=new Student("Alex","Up","IT","IT5", 2, 1.0);
        students[3]=new Student("Mahs","Right","Med","M4", 3, 1.9);
        students[4]=new Student("Lake","Left","Physicist","Phy1", 2, 1.1);
        students[5]=new Student("Troy","North","IT","IT1", 4, 0.1);
        students[6]=new Student("Sam","South","Med","M3", 1, 2);
        students[7]=new Student("Dann","West","Engineer","En0", 3, 1.3);
        students[8]=new Student("Alex","East","Physicist","Phy2", 2, 1.4);
        students[9]=new Student("John","Yankee","IT","IT6", 4, 1.85);
    }

    public void setArray(Student[] students) {
        this.students = students;
    }
    public void outArray() {
        for (Student st : students) {
            System.out.println("Student{" +
                    "name='" + st.getName() + '\'' +
                    ", surname='" + st.getSurname() + '\'' +
                    ", specialty='" + st.getSpecialty() + '\'' +
                    ", group='" + st.getGroup() + '\'' +
                    ", course=" + st.getCourse() +
                    ", GPA=" + st.getGPA() +
                    '}');
        }
    }

    public Student[] getStudents() {
        return students;
    }
    public Student[] Choose () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose another param");
        Options opt = Options.valueOf(scanner.nextLine());
        return Merge.sortArray(students, opt);
    }

    public static void main(String[] args) {
        SortingStudentsByGPA arr = new SortingStudentsByGPA();
        //arr.setArray();
        Student[] mArray = Merge.sortArray(arr.getStudents(), Options.GPA);
        QuickSort.SortStudent(arr.getStudents(),0,arr.getStudents().length-1);

        System.out.println("Merge sort: ");
        for (Student st: mArray) {
            System.out.println(st);
        }

        System.out.println("Quick sort:");
        arr.outArray();

        Student[] mArray1 = arr.Choose();
        System.out.println("By choice:");
        for (Student st: mArray1) {
            System.out.println(st);
        }
    }
    static StudentComparator co = new StudentComparator();

}




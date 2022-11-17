package ru.mirea.task17.taskStep1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Bob");
        System.out.println("After updating, Student Details are as follows");
        controller.updateView();
    }
    static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Jon");
        student.setRollno("01");
        return student;

    }
}

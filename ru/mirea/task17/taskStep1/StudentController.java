package ru.mirea.task17.taskStep1;

public class StudentController {
    Student model;
    StudentView view;
    StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }
    public void setStudentName(String name) {
        model.setName(name);
    }
    public String getStudentName() {
        return model.getName();
    }
    public void setStudentRollno(String rollno) {
        model.setRollno(rollno);
    }
    public String getStudentRollno() {
        return model.getRollno();
    }
    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollno());
    }
}

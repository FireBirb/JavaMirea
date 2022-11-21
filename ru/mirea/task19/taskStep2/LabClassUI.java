package ru.mirea.task19.taskStep2;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Comparator;

public class LabClassUI extends JFrame {

    //private ArrayList<Student> students;
    private final JTable studTable;
    LabClass labClass;

    public LabClassUI(ArrayList<Student> students){
        // base
        super("Students");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);
        labClass = new LabClass(students);
        // Buttons
        JPanel pN = new JPanel(new FlowLayout());
        JButton addStudentBtn = new JButton("Add a student");
        JButton remStudentBtn = new JButton("Remove a student");
        JButton findStudentBtn = new JButton("Find a student by name");
        pN.add(addStudentBtn);
        pN.add(remStudentBtn);
        pN.add(findStudentBtn);

        addStudentBtn.addActionListener(e -> {
            try {
                addBtnClicked();
            }catch (IllegalArgumentException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        remStudentBtn.addActionListener(e-> remBtnClicked());

        findStudentBtn.addActionListener(e->{
            try{
                findBtnClicked();
            }catch (StudentNotFoundException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        Object[] headers = new String[] {"Name", "Age", "Group", "Average points"};
        Object [][] startStudents = new String[students.size()][4];
        for(int i = 0; i < students.size(); i++){
            startStudents[i][0] = students.get(i).getFio();
            startStudents[i][1] = ((Integer)(students.get(i).getAge())).toString();
            startStudents[i][2] = ((Integer)(students.get(i).getGroupNum())).toString();
            startStudents[i][3] = ((Integer)(students.get(i).getAvgPoint())).toString();
        }
        studTable = new JTable( new DefaultTableModel(startStudents, headers)){
            @Override
            public boolean isCellEditable(int x, int y){
                return false;
            }
        };

        JTableHeader header = studTable.getTableHeader();
        header.setReorderingAllowed(false);
        header.setResizingAllowed(false);

        header.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(header.getHeaderRect(0).contains(e.getX(), e.getY()))
                    sortStudents(Student::compareTo);
                if(header.getHeaderRect(1).contains(e.getX(), e.getY()))
                    sortStudents(Student.AGE_COMP);
                if(header.getHeaderRect(2).contains(e.getX(), e.getY()))
                    sortStudents(Student.GROUP_COMP);
                if(header.getHeaderRect(3).contains(e.getX(), e.getY()))
                    sortStudents(Student.AVG_COMP);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        // Adding comps
        getContentPane().add(new JScrollPane(studTable), BorderLayout.CENTER);

        getContentPane().add(pN, BorderLayout.NORTH);

        setVisible(true);
    }

    private void sortStudents(Comparator<Student> comp){
        labClass.sortStudents(comp);
        DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();

        for (int i = 0; i < labClass.size(); i++) {
            dtm.removeRow(i);
            Student st = labClass.get(i);
            dtm.insertRow(i, new Object[]{st.getFio(), st.getAge(), st.getGroupNum(), st.getAvgPoint()});
        }
    }

    private void findBtnClicked() throws StudentNotFoundException {
        String s = JOptionPane.showInputDialog("Enter full name");
        for(int i = 0; i < labClass.size(); i++){
            if(labClass.get(i).getFio().equals(s)){
                JOptionPane.showMessageDialog(this, "Found a student: " + labClass.get(i).toString());
                return;
            }
        }
        throw new StudentNotFoundException(s);
    }

    private void remBtnClicked() {
        int c = studTable.getSelectedRowCount();
        if(c != 1) {
            JOptionPane.showMessageDialog(this, "Select exactly one string");
            return;
        }
        c = studTable.getSelectedRow();
        labClass.remove(c);
        DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();
        dtm.removeRow(c);

    }

    private void addBtnClicked() throws IllegalArgumentException {
        String name = JOptionPane.showInputDialog("Full name:");
        if(name.equals("")) throw new EmptyStringException();
        String age = JOptionPane.showInputDialog("Age:");
        String group = JOptionPane.showInputDialog("Group number:");
        String avg = JOptionPane.showInputDialog("Average points:");

        int avgI =0;
        int groupI = 0;
        int ageI =0;
        try {
            avgI = Integer.parseInt(avg);
            groupI = Integer.parseInt(group);
            ageI = Integer.parseInt(age);
        }catch (NumberFormatException e){
            throw new NumberFormatException(e.getMessage().substring(17) + " is not a number");
        }

        labClass.add(new Student(name, avgI, groupI, ageI));

        DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();

        dtm.addRow(new Object[]{name, age, group, avg});
    }
}
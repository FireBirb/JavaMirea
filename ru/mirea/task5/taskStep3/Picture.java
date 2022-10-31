package ru.mirea.task5.taskStep3;

import javax.swing.*;
import java.util.Scanner;

public class Picture extends JFrame {
    Picture () {
        setTitle("A picture");
        Scanner scanner = new Scanner(System.in);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("Enter full path to the picture, including its name");
        String path = scanner.nextLine();
        //ImageIcon image = new ImageIcon("C:\\Users\\littl\\IdeaProjects\\Mirea_Java\\src\\ru\\mirea\\task5\\taskStep3\\cat.jpg");
        ImageIcon image = new ImageIcon(path);
        JLabel label = new JLabel(image);
        add(label);
        pack();
    }
    public static void main(String[] args) {
        new Picture().setVisible(true);
    }
}

package ru.mirea.task15.taskStep1;

import ru.mirea.task5.taskStep1.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Напишите программу калькулятор, используя пример в листинге
//15.6. Реализуйте помимо сложения вычитание, деление и умножение для двух
//чисел, которые вводятся с клавиатуры.
public class Calculator {
    JFrame frame = new JFrame("Calculator");
    JButton add = new JButton("+");
    JButton sub = new JButton("-");
    JButton div = new JButton("/");
    JButton mult = new JButton("*");
    JLabel jl1 = new JLabel("Number 1:");
    JLabel jl2 = new JLabel("Number 2");
    JTextField num1 = new JTextField(10);
    JTextField num2 = new JTextField(10);
    //JPanel[] pan = new JPanel[8];
    public Calculator() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 0, 10, 300));
        frame.setSize(500,  500);
        //for (int i = 0; i<8; i++) {pan[i] = new JPanel(); pan[i].setLayout(new FlowLayout()); frame.add(pan[i]);}
        frame.add(jl1);
        frame.add(num1);
        frame.add(jl2);
        frame.add(num2);
        frame.add(add);
        frame.add(sub);
        frame.add(div);
        frame.add(mult);
        frame.setVisible(true);
        /*MilanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Milan++;
                score.setText("Result: " + Milan + " X " + Madrid);
                lastScorer.setText("Last scorer: AC Milan");
                if (Milan == Madrid) winner.setText("Winner: DRAW");
                else if (Milan > Madrid) winner.setText("Winner: AC Milan");
            }
        });
        RealButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Madrid++;
                score.setText("Result: " + Milan + " X " + Madrid);
                lastScorer.setText("Last scorer: Real Madrid");
                if (Madrid == Milan) winner.setText("Winner: DRAW");
                else if (Madrid > Milan) winner.setText("Winner: Real Madrid");
            }
        });
        setVisible(true);

        setTitle("A picture");
        Scanner scanner = new Scanner(System.in);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("Enter full path to the picture, including its name");
        String path = scanner.nextLine();
        //ImageIcon image = new ImageIcon("C:\\Users\\littl\\IdeaProjects\\Mirea_Java\\src\\ru\\mirea\\task5\\taskStep3\\cat.jpg");
        ImageIcon image = new ImageIcon(path);
        JLabel label = new JLabel(image);
        add(label);
        pack();*/
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

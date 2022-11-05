package ru.mirea.task15.taskStep1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Напишите программу калькулятор, используя пример в листинге
//15.6. Реализуйте помимо сложения вычитание, деление и умножение для двух
//чисел, которые вводятся с клавиатуры.
public class Calculator {
    JFrame frame = new JFrame("Calculator");
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton div = new JButton("/");
    JButton mult = new JButton("*");
    JLabel jl1 = new JLabel("Number 1:");
    JLabel jl2 = new JLabel("Number 2");
    JTextField num1 = new JTextField(10);
    JTextField num2 = new JTextField(10);
    public Calculator() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 10, 0, 0);
        c.ipady = 10;
        c.weightx = 0.3;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        frame.add(jl1, c);
        c.insets = new Insets(0, 0, 0, 10);
        c.weightx = 0.7;
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 3;
        frame.add(num1, c);
        c.insets = new Insets(0, 10, 0, 0);
        c.weightx = 0.3;
        c.gridx = 0;
        c.gridy = 1;
        frame.add(jl2, c);
        c.insets = new Insets(0, 0, 0, 10);
        c.weightx = 0.7;
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 3;
        frame.add(num2, c);
        c.insets = new Insets(0, 0, 0, 0);
        c.ipady = 50;
        c.weightx = 0.5;
        c.weighty = 0;
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        frame.add(plus, c);
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 2;
        c.gridwidth = 2;
        frame.add(minus, c);
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 2;
        frame.add(div, c);
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 3;
        c.gridwidth = 2;
        frame.add(mult, c);
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = num1.getText();
                try {
                    double n1 = Double.parseDouble(num1.getText().trim());
                    double n2 = Double.parseDouble(num2.getText().trim());
                    double res = n1+n2;
                    JOptionPane.showMessageDialog(null, "Result = "+res,"Alert",JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception er){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = num1.getText();
                try {
                    double n1 = Double.parseDouble(num1.getText().trim());
                    double n2 = Double.parseDouble(num2.getText().trim());
                    double res = n1-n2;
                    JOptionPane.showMessageDialog(null, "Result = "+res,"Alert",JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception er){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = num1.getText();
                try {
                    double n1 = Double.parseDouble(num1.getText().trim());
                    double n2 = Double.parseDouble(num2.getText().trim());
                    double res = n1*n2;
                    JOptionPane.showMessageDialog(null, "Result = " + res, "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception er){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = num1.getText();
                try {
                    double n1 = Double.parseDouble(num1.getText().trim());
                    double n2 = Double.parseDouble(num2.getText().trim());
                    if (n2 == 0) {
                        JOptionPane.showMessageDialog( null, "Error in Numbers!","alert" , JOptionPane.ERROR_MESSAGE);
                    } else {
                        double res = n1/n2;
                        JOptionPane.showMessageDialog(null, "Result = " + res, "Alert", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception er){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.setSize(new Dimension(500, 700));
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

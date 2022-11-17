package ru.mirea.task16.taskStep3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window implements ActionListener {
    JFrame frame = new JFrame();
    JTextArea text = new JTextArea();
    JMenuBar bar = new JMenuBar();
    JMenu color = new JMenu("Цвет"), font = new JMenu("Шрифт");
    JMenuItem blue = new JMenuItem("Синий"), red = new JMenuItem("Красный"), black = new JMenuItem("Черный");
    JMenuItem times = new JMenuItem("Times New Roman"), sans = new JMenuItem("MS Sans Serif"), courier = new JMenuItem("Courier New");
    JMenuItem[] colors = new JMenuItem[]{blue, red, black};
    JMenuItem[] fonts = new JMenuItem[]{times, sans, courier};
    Window() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        text.setFont(new Font("Serif", Font.PLAIN, 15));
        for (JMenuItem item : colors) {item.addActionListener(this);color.add(item);}
        for (JMenuItem item : fonts) {item.addActionListener(this);font.add(item);}
        bar.add(color); bar.add(font);
        frame.add(bar, BorderLayout.PAGE_START);
        frame.add(text, BorderLayout.CENTER);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Window();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == blue) text.setForeground(Color.blue);
        if (source == red) text.setForeground(Color.red);
        if (source == black) text.setForeground(Color.black);
        if (source == times) text.setFont(new Font("Serif", Font.PLAIN, 15));
        if (source == sans) text.setFont(new Font("SansSerif", Font.PLAIN, 15));
        if (source == courier) text.setFont(new Font("Monospaced", Font.PLAIN, 15));
    }
}

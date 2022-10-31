package ru.mirea.task5.taskStep2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Window extends JPanel {

    private List<Object> shapes = new ArrayList<>();
    private Random random = new Random();

    public Window() {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(400, 400));
        for (int i = 0; i < 20; i++) {
            int sh = random.nextInt(1, 4);
            switch (sh) {
                case 1 -> addCircle(400, 400);
                case 2 -> addRectangle(400, 400);
                case 3 -> addSquare(400, 400);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Object s : shapes) {
            if (s instanceof Circle) {
                ((Circle) s).draw(g);
            } else if (s instanceof Rectangle) {
                ((Rectangle) s).draw(g);
            }
        }
    }

    public void addCircle(int maxX, int maxY) {
        shapes.add(new Circle(random.nextInt(20), new Color((int)(Math.random() * 0x1000000)), new int[] {random.nextInt(maxX), random.nextInt(maxY)}));
        repaint();
    }
    public void addRectangle(int maxX, int maxY) {
        shapes.add(new Rectangle(random.nextInt(20), random.nextInt(20), new Color((int)(Math.random() * 0x1000000)), new int[] {random.nextInt(maxX), random.nextInt(maxY)}));
        repaint();
    }
    public void addSquare(int maxX, int maxY) {
        shapes.add(new Square(random.nextInt(20), new Color((int)(Math.random() * 0x1000000)), new int[] {random.nextInt(maxX), random.nextInt(maxY)}));
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new Window());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
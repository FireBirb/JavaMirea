package ru.mirea.task5.taskStep4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;

public class Anim {
    private JPanel pane;
    private int nextImage = 1;
    private Image img;
    static String path = "C:\\Users\\littl\\IdeaProjects\\Mirea_Java\\src\\ru\\mirea\\task5\\taskStep4\\cats\\";

    Anim() {
        JFrame frame = new JFrame("The internet is for cats");
        Timer timer = new Timer(1000 / 2, listener);
        pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    img = ImageIO.read(new FileInputStream(path + String.format("cat%02d.jpg", nextImage+1)));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                g.drawImage(img , 0, 0, 750, 1000, this);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(750, 1000);
            }
        };

        timer.start();

        frame.getContentPane().add(pane);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent event) {
            nextImage = nextImage < 3 ? nextImage + 1 : 0;
            pane.repaint();
        }
    };
    public static void main (String[] args) {
        new Anim();
    }
}


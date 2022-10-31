package ru.mirea.task5.taskStep1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//одна кнопка JButton labeled "AC Milan"
//другая JButton labeled "Real Madrid"
//надпись Jlabel содержит текст "Result: 0 X 0"
//надпись Jlabel содержит текст "Last Scorer N/A"
//надпись Jlabel содержит текст "Winner: DRAW"

public class Window extends JFrame {
    JButton MilanButton = new JButton("AC Milan");
    JButton RealButton = new JButton("Real Madrid");
    JLabel score = new JLabel("Result: 0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    JPanel[] pan = new JPanel[6];
    int Milan = 0, Madrid = 0;

    Window () {
        super("The teams, the DNA of the soul!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 3));
        setSize(500,  500);
        for (int i = 0; i<6; i++) {pan[i] = new JPanel(); pan[i].setLayout(new FlowLayout()); add (pan[i]);}
        //BorderLayout.CENTER
        pan[0].add(MilanButton);
        pan[2].add(RealButton);
        pan[3].add(score);
        pan[4].add(lastScorer);
        pan[5].add(winner);
        MilanButton.addActionListener(new ActionListener() {
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
    }
    public static void main(String[] args) {
        new Window();
    }
}

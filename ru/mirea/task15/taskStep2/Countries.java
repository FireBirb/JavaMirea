package ru.mirea.task15.taskStep2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Countries {
    JFrame frame = new JFrame("Countries");
    String[] cs = new String[]{"Australia", "China", "England", "Russia"};
    JComboBox box = new JComboBox(cs);
    JTextArea text = new JTextArea();
    Countries() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        text.setLineWrap(true);
        c.fill = GridBagConstraints.NONE;
        c.insets = new Insets(20, 10, 0, 0);
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.weightx = 0.0001;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        frame.add(box, c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 30, 0, 30);
        c.gridx=0;
        c.weightx = 1.0;
        c.gridy = 1;
        frame.add(text, c);
        box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (box.getSelectedIndex()) {
                    case 0: text.setText("Australia, the smallest continent and one of the largest countries on Earth, lying between the Pacific and Indian oceans in the Southern Hemisphere. Australia's capital is Canberra, located in the southeast between the larger and more important economic and cultural centres of Sydney and Melbourne."); break;
                    case 1: text.setText("China is the world's most populous country with a population of 1.44 billion people. It has quickly become the second largest economy in the word. And, it is the world's third biggest country by territory. China is not only big but it has broad geographical and cultural diversity."); break;
                    case 2: text.setText("England is a country that is part of the United Kingdom. It shares land borders with Wales to its west and Scotland to its north. The Irish Sea lies northwest and the Celtic Sea to the southwest. It is separated from continental Europe by the North Sea to the east and the English Channel to the south."); break;
                    case 3: text.setText("Russia is a federation of 86 republics, provinces, territories, and districts, all controlled by the government in Moscow. The head of state is a president elected by the people. The economy is based on a vast supply of natural resources, including oil, coal, iron ore, gold, and aluminum."); break;
                }
            }
        });
        frame.setSize(new Dimension(500, 300));
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Countries();
    }
}

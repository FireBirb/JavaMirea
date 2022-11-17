package ru.mirea.task16.taskStep4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckDialog extends Dialog {
    JTextField text = new JTextField();
    public CheckDialog(JFrame owner) {
        super(owner, "Welcome", false);
        setLocationRelativeTo(owner);
        setLayout(new BorderLayout());
        text.setEditable(false);
        add(text, BorderLayout.CENTER);
        JButton ok = new JButton("ok");
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                setVisible(false);
            }
        });
        add(ok, BorderLayout.SOUTH);
        pack();
        setSize(300, 100);
        //setVisible(true);
    }
}

package ru.mirea.task16.taskStep4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class Window implements ActionListener {
    JFrame frame = new JFrame("Password application");
    JLabel service = new JLabel("Service:"), name = new JLabel("User name:"), passwd = new JLabel("Password:");
    JTextField answ_service = new JTextField(), answ_name = new JTextField();
    JPasswordField answ_passwd = new JPasswordField();
    CheckDialog dial = new CheckDialog(frame);
    Map<String, String> accs = Map.of("name1", "passwd1", "name2", "passwd2", "name3", "passwd3", "name4", "passwd4");
    Window() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        answ_service.setColumns(20);
        answ_name.setColumns(20);
        answ_passwd.setColumns(20);
        c.fill = GridBagConstraints.NONE;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        frame.add(service, c);
        c.gridx = 1;
        c.gridy = 0;
        frame.add(answ_service, c);
        c.gridx = 0;
        c.gridy = 1;
        frame.add(name, c);
        c.gridx = 1;
        c.gridy = 1;
        frame.add(answ_name, c);
        c.gridx = 0;
        c.gridy = 2;
        frame.add(passwd, c);
        c.gridx = 1;
        c.gridy = 2;
        frame.add(answ_passwd, c);
        answ_service.addActionListener(this);
        answ_name.addActionListener(this);
        answ_passwd.addActionListener(this);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
    public boolean Check(String name, String passwd) {
        return (accs.containsKey(name) && accs.get(name).equals(passwd));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == answ_service) {
            answ_service.setEnabled(false);
            answ_service.setEnabled(true);
        }
        else if (e.getSource() == answ_name) {
            answ_name.setEnabled(false);
            answ_name.setEnabled(true);
        }
        else if (e.getSource() == answ_passwd) {
            dial.text.setText((Check(answ_name.getText(), String.valueOf(answ_passwd.getPassword()))) ? "You're in" : "Wrong name and/or password, try again");
            dial.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Window();
    }
}

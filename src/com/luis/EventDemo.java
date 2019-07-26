package com.luis;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class EventDemo extends JFrame {

    JRadioButton btnRed = new JRadioButton("Red");
    JRadioButton btnGreen = new JRadioButton("Green");
    JRadioButton btnBlue = new JRadioButton("Blue");

    JCheckBox jcbBold = new JCheckBox("Bold");
    JCheckBox jcbItalic = new JCheckBox("Italic");

    JLabel msg = new JLabel("message");

    JTextField jtfName = new JTextField(10);
    JPasswordField jpfPass = new JPasswordField(10);

    JButton btnLogin = new JButton("Login");
    JButton btnRegister = new JButton("Register");

    String name = "";
    String pass = "";

    public EventDemo() {

        setTitle("Event Demo");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        msg.setBorder(new LineBorder(Color.black, 2));
        msg.setHorizontalAlignment(JLabel.CENTER);
        add(msg, BorderLayout.CENTER);

        JPanel inputPannel = new JPanel(new GridLayout(2, 2));
        inputPannel.add(new JLabel("Name"));
        inputPannel.add(jtfName);
        inputPannel.add(new JLabel("password"));
        inputPannel.add(jpfPass);
        add(inputPannel, BorderLayout.NORTH);

        JPanel btnPannel = new JPanel(new FlowLayout());
        btnPannel.add(btnLogin);
        btnPannel.add(btnRegister);
        add(btnPannel, BorderLayout.SOUTH);

        JPanel radioPanel = new JPanel(new GridLayout(3, 1));
        radioPanel.add(btnRed);
        radioPanel.add(btnGreen);
        radioPanel.add(btnBlue);
        add(radioPanel, BorderLayout.WEST);

        ButtonGroup group = new ButtonGroup();
        group.add(btnRed);
        group.add(btnGreen);
        group.add(btnBlue);

        btnRed.setSelected(true);
        msg.setForeground(Color.RED);

        JPanel checkPanel = new JPanel(new GridLayout(2, 1));
        inputPannel.add(jcbBold);
        inputPannel.add(jcbItalic);
        add(checkPanel, BorderLayout.EAST);

        setVisible(true);


    }

}

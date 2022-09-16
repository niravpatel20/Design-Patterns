package com.designpattern.creational.factory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowsButton implements Button{

    JPanel jPanel = new JPanel();
    JFrame jFrame = new JFrame();
    JButton jButton;

    @Override
    public void render() {

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("Hello World!");
        jLabel.setOpaque(true);
        jLabel.setBackground(new Color(235, 233, 126));
        jLabel.setFont(new Font("Dialog", Font.BOLD, 44));
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        jFrame.getContentPane().add(jPanel);
        jPanel.add(jLabel);

        jFrame.setSize(320, 200);
        jFrame.setVisible(true);

        onClick();
    }

    @Override
    public void onClick() {
        jButton = new JButton("Exit");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    jFrame.setVisible(false);
                    System.exit(0);
            }
        });
    }
}

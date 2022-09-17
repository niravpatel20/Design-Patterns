package com.designpattern.behavioral.state;

import javax.swing.*;
import java.awt.*;

public class UI {

    private Player player;
    private static JTextField jTextField = new JTextField();

    public UI(Player player){
        this.player = player;
    }

    public void init(){
        JFrame jFrame = new JFrame("Test Player");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        jFrame.getContentPane().add(context);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(jTextField);
        context.add(buttons);

        JButton play = new JButton("Play");
        play.addActionListener(e -> jTextField.setText(player.getState().onPlay()));
        JButton stop = new JButton("Stop");
        stop.addActionListener(e -> jTextField.setText(player.getState().onLock()));
        JButton next = new JButton("Next");
        next.addActionListener(e -> jTextField.setText(player.getState().onNext()));
        JButton prev = new JButton("Prev");
        prev.addActionListener(e -> jTextField.setText(player.getState().onPrevious()));

        jFrame.setVisible(true);
        jFrame.setSize(300, 100);

        buttons.add(play);
        buttons.add(stop);
        buttons.add(next);
        buttons.add(prev);




    }
}

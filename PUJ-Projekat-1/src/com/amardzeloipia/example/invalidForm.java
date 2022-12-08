package com.amardzeloipia.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class invalidForm extends JFrame {

    private JPanel invalidPanel;
    private JButton btnQuit;
    private JButton btnTryAgain;
    private JPanel mainPanel;


    public invalidForm() {

        add(invalidPanel);
        btnQuit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnTryAgain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginForm openAgain = new loginForm();
                openAgain.setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("invalidForm");
        frame.setContentPane(new invalidForm().invalidPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

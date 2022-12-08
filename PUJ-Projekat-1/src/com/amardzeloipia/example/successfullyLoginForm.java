package com.amardzeloipia.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class successfullyLoginForm extends JFrame{
    private JPanel successfulLoginPanel;
    private JButton btnQuit;
    private JButton btnContinue;
    private JPanel panelLbl;
    private JPanel btnPanel;

    public successfullyLoginForm() {

        add(successfulLoginPanel);
        successfulLoginPanel.setMinimumSize(new Dimension(250,350));
        btnQuit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnContinue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moviesForms openMovies = new moviesForms();
                openMovies.setMinimumSize(new Dimension(500,350));
                openMovies.setLocationRelativeTo(null);
                openMovies.setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("successfullyLoginForm");
        frame.setContentPane(new successfullyLoginForm().successfulLoginPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(250,350));
        frame.setMaximumSize(new Dimension(250,350));
        frame.pack();
        frame.setVisible(true);
    }
}

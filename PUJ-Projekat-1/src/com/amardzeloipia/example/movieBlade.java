package com.amardzeloipia.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class movieBlade extends JFrame{
    private JPanel panelBlade;
    private JButton btnGoBack;
    private JButton btnQuit;
    private JPanel panelPic;
    private JPanel panelDisc;
    private JPanel panelBtn;
    private JLabel lblPic;
    private JLabel lblDisc;


    public movieBlade() {
        add(panelBlade);
        String description = "<html>Officer K (Ryan Gosling), a new blade<br> runner for the Los Angeles <br>Police Department, unearths a long-buried secret that has<br> the potential to plunge what's left of society into chaos. <br>His discovery leads him on a quest to find Rick Deckard (Harrison Ford),<br> a former blade runner who's been missing for 30 years.";
        lblDisc.setText(description);
        btnGoBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moviesForms goBack = new moviesForms();
                goBack.setVisible(true);
                dispose();
            }
        });
        btnQuit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("movieBlade");
        frame.setContentPane(new movieBlade().panelBlade);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
